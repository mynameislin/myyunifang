package rikao.bawei.com.myyunifang.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;
import com.stx.xhb.xbanner.transformers.Transformer;
import org.json.JSONArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Callback;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.bean.Details;

import static android.R.attr.name;

public class WebActivity extends AppCompatActivity {
    private String id;
    private Button bt_return;
    private XBanner banner;
    private ListView lv;
    private LinearLayout rdd;
    private TextView tv_name, t1, t2, tv1, tv2, tv3;
    private Button add, bug;
    private int i=1;
    private List<String> list = new ArrayList<>();
    private List<Details.DataBean.ActivityBean> activity;
    private List<Details.DataBean.GoodsBean.GalleryBean> gallery;
    public SharedPreferences sh;
    public SharedPreferences.Editor editor;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(final Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                String json = (String) msg.obj;
                final Gson gson = new Gson();
                details = gson.fromJson(json, Details.class);
                 Log.e("xxx", details.toString());
                String goods_desc = details.getData().getGoods().getGoods_desc();
                JSONArray jsonArray = null;
                try {
                    jsonArray = new JSONArray(goods_desc);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        String url = jsonArray.getJSONObject(i).getString("url");
                        list.add(url);
                    }
                    inintent();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 显示popwindow
                View view = View.inflate(WebActivity.this, R.layout.pop, null);
                ImageView pop_image= (ImageView) view.findViewById(R.id.pop_image);
                TextView pop_tv1= (TextView) view.findViewById(R.id.pop_tv1);
                TextView pop_tv2= (TextView) view.findViewById(R.id.pop_tv2);
                TextView pop_tv3= (TextView) view.findViewById(R.id.pop_tv3);
                final ImageView  inn1 = (ImageView) view.findViewById(R.id.inn1);
                final  ImageView  inn2 = (ImageView) view.findViewById(R.id.inn2);
                final  TextView num = (TextView) view.findViewById(R.id.num);

                inn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (i>1&&i<5){
                            i++;
                            num.setText(""+i);
                            inn1.setImageResource(R.drawable.reduce_able);
                        }else if (i==5){
                            inn2.setImageResource(R.drawable.add_unable);
                        }
                    }
                });
                inn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (i>1){
                            i--;
                            num.setText(""+i);
                            inn2.setImageResource(R.drawable.add_able);
                        }else if (i==1){
                            inn1.setImageResource(R.drawable.reduce_unable);
                        }
                    }
                });
                pop_tv1.setText("¥ " + details.getData().getGoods().getShop_price());
                pop_tv2.setText("库存"+details.getData().getGoods().getStock_number()+"件");
                pop_tv3.setText("限购"+details.getData().getGoods().getRestrict_purchase_num()+"件");
                Glide.with(WebActivity.this).load(details.getData().getGoods().getGoods_img()).into(pop_image);

                final   Button pop_but = (Button) view.findViewById(R.id.pop_but);
                pop_but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        RequestQueue requestQueue = Volley.newRequestQueue(WebActivity.this);
                        String url="http://169.254.116.62:8080/bullking1/cart";
                        //创建StringRequest
                        StringRequest request = new StringRequest(com.android.volley.Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
                            @Override
                            //响应成功
                            public void onResponse(String s) {
                                Toast.makeText(WebActivity.this, "添加购物车成功！！", Toast.LENGTH_SHORT).show();
                                pop.dismiss();
                            }
                        }, new com.android.volley.Response.ErrorListener() {
                            @Override
                            //响应错误
                            public void onErrorResponse(VolleyError volleyError) {
                                Toast.makeText(WebActivity.this, "添加购物车失败！！", Toast.LENGTH_SHORT).show();
                            }
                        }) {
                            @Override
                            protected Map<String, String> getParams() throws AuthFailureError {
                                int myid = sh.getInt("myid",0);
                                double shop_price = details.getData().getGoods().getShop_price();
                                String goods_img = details.getData().getGoods().getGoods_img();
                                String goods_name = details.getData().getGoods().getGoods_name();
                                Map<String, String> map = new HashMap<>();
                                map.put("productID",id);
                                map.put("count",i+"");
                                map.put("price",shop_price+"");
                                map.put("userID",myid+"");
                                map.put("pic",goods_img);
                                map.put("name",goods_name);
                                return map;
                            }
                        };
                        requestQueue.add(request);
                    }
                });
                pop = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                //可触摸
                pop.setTouchable(true);
                //获得焦点
                pop.setFocusable(true);
                //设置背景
                pop.setBackgroundDrawable(new ColorDrawable(Color.WHITE));

                //适配器加载数据
                activity = details.getData().getActivity();
                MyAdapter adapter=new MyAdapter();
                lv.setAdapter(adapter);

                String name = details.getData().getGoods().getGoods_name();
                tv_name.setText(name);
                double market_price = details.getData().getGoods().getMarket_price();
                double shop_price = details.getData().getGoods().getShop_price();
                t1.setText("¥ " + shop_price);
                t2.setText(market_price + "");
                //划横线
                t2.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                double shipping_fee = details.getData().getGoods().getShipping_fee();
                int sales_volume = details.getData().getGoods().getSales_volume();
                int collect_count = details.getData().getGoods().getCollect_count();
                tv1.setText("¥ " + shipping_fee);
                tv2.setText(sales_volume + "");
                tv3.setText(collect_count + "");


                //轮播图数据加载
                gallery = details.getData().getGoods().getGallery();
                //为XBanner绑定数据
                banner.setData(gallery, null);
                // XBanner适配数据
                banner.setmAdapter(new XBanner.XBannerAdapter() {
                    @Override
                    public void loadBanner(XBanner banner, View view, int position) {
                        Glide.with(WebActivity.this).load(gallery.get(position).getNormal_url()).into((ImageView) view);
                    }
                });
                // 设置XBanner的页面切换特效
                banner.setPageTransformer(Transformer.Default);
                // 设置XBanner页面切换的时间，即动画时长
                banner.setPageChangeDuration(2000);




            }
        }
    };
    private Details details;
    private PopupWindow pop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        //接值
        Intent it = getIntent();
        id = it.getStringExtra("id");
        initview();
        //获取数据
        getServerData(id);
        sh=getSharedPreferences("login",1);
        editor=sh.edit();


    }

    private void getServerData(String id) {
        //创建OkHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        String url = "http://m.yunifang.com/yunifang/mobile/goods/detail?random=46389&encode=70ed2ed2facd7a812ef46717b37148d6&id=" + id;
        //创建Request对象
        okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
        //得到Call
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                    Log.e("xxx","11111");
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
                String s = response.body().string();
                Log.e("xxx",s);
                Message message = Message.obtain();
                message.what = 0;
                message.obj = s;
                handler.sendMessage(message);
            }
        });

    }

    private void initview() {
        bt_return = (Button) findViewById(R.id.bt_return);
        banner = (XBanner) findViewById(R.id.banner);
        tv_name = (TextView) findViewById(R.id.tv_name);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        lv = (ListView) findViewById(R.id.lv);
        rdd = (LinearLayout) findViewById(R.id.rda);
        add = (Button) findViewById(R.id.add);
        bug = (Button) findViewById(R.id.bug);
        //点击返回监听
        bt_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //点击购买
        bug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pop.isShowing()){
                    //消失
                    pop.dismiss();
                }else {
                    //设置popupwindow的位置
                    pop.showAtLocation(bug, Gravity.BOTTOM, 0, 0);
                    pop.setFocusable(true);

                }
            }
        });
        //点击加入购物车
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pop.isShowing()){
                    //消失
                    pop.dismiss();
                }else {
                    //设置popupwindow的位置
                    pop.showAtLocation(bug, Gravity.BOTTOM, 0, 0);
                    pop.setFocusable(true);

                }
            }
        });

    }
    private void inintent() {
        for (int x = 0; x < list.size(); x++) {
            //寻找行布局，第一个参数为行布局ID，第二个参数为这个行布局需要放到那个容器上
       View view = LayoutInflater.from(WebActivity.this).inflate(R.layout.imageview_item, rdd, false);
            //通过View寻找ID实例化控件
            ImageView image = (ImageView) view.findViewById(R.id.item_iv);
            Glide.with(WebActivity.this).load(list.get(x)).into(image);
            //把行布局放到linear里
            rdd.addView(view);
        }
    }
   public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return activity.size();
        }
        @Override
        public Object getItem(int position) {
            return activity.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = View.inflate(WebActivity.this, R.layout.detaile_adapter, null);
            TextView tc = (TextView) convertView.findViewById(R.id.tc);
            tc.setText(activity.get(position).getTitle());
            return convertView;
        }
    }
}
