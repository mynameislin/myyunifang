package rikao.bawei.com.myyunifang.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rikao.bawei.com.myyunifang.Pay.Data;
import rikao.bawei.com.myyunifang.Pay.XuanZeActivity;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.activity.LoginActivity;
import rikao.bawei.com.myyunifang.adapter.MyBaseAdapter;
import rikao.bawei.com.myyunifang.bean.ShPing;
import rikao.bawei.com.myyunifang.bean.ShpingData;
import rikao.bawei.com.myyunifang.view.QQListView;

import static rikao.bawei.com.myyunifang.R.id.xlv;

/**
 * Created by Administrator on 2017/4/12.
 */

public class ShoppingFragment extends Fragment {

    private View view;
    private CheckBox shaoping_chebox;
    private Button shaoping_jiesuan;
    private TextView shaoping_sum_price;
    private RelativeLayout shaoping_xiangqing;
    DecimalFormat DecimalFormat= new  DecimalFormat(".##");
    private RelativeLayout shaoping_xiaoguo;
     List<ShpingData> list=new ArrayList<>();
    private SharedPreferences sh;
    private SharedPreferences.Editor editor;
    public SharedPreferences sh1;
    public SharedPreferences.Editor editor1;
    int count=0;
    double prices=0;
    private MyBaseAdapter mb;
    public QQListView xlv;
private Handler handler=new Handler(){
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        if(msg.what==0){
       String json= (String) msg.obj;
            Gson gson=new Gson();
            Log.i("xxx","aaa"+json);
            ShPing shPing = gson.fromJson(json, ShPing.class);
            Log.i("xxx","aaa"+shPing.getCartItemList().get(0).getName());
            for (int i=0;i<shPing.getCartItemList().size();i++){
                ShpingData ss=new ShpingData(shPing.getCartItemList().get(i).getPic(),shPing.getCartItemList().get(i).getName(),shPing.getCartItemList().get(i).getPrice(),shPing.getCartItemList().get(i).getCount(),shPing.getCartItemList().get(i).getId(),false);
                list.add(ss);
            }
            Log.i("xxx","aa="+list.size());
            if(list.size()==0){
                shaoping_xiangqing.setVisibility(View.GONE);
                shaoping_xiaoguo.setVisibility(View.VISIBLE);
            }else{
                shaoping_xiangqing.setVisibility(View.VISIBLE);
                shaoping_xiaoguo.setVisibility(View.GONE);

            }
            initAdapter();
        }else if(msg.what==1){
            String string= (String) msg.obj;
            Log.i("xxx",string);
            Gson gson=new Gson();
            Data data = gson.fromJson(string, Data.class);
            Intent intent=new Intent(getActivity(),XuanZeActivity.class);
            intent.putExtra("order_on",data.getData().getOrder_sn());
            startActivity(intent);
        }
    }
};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shaopping,null);
        return view;

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //得到控件
        initView();
        Log.i("xxx","aa="+sh.getBoolean("ok",false));
        if(sh.getBoolean("ok",false)){
            list.clear();
            //数据源
            initData();
            count=0;
            prices=0;
        }
        shaoping_jiesuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean mylogin = sh1.getBoolean("mylogin", false);
                if(mylogin){
                   initZhiFu();
                }else{
                    Toast.makeText(getActivity(), "请先登录！！！", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                }

            }
        });

        shaoping_chebox.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               boolean checked = shaoping_chebox.isChecked();
               if(checked){
                   for (int i=0;i<list.size();i++){
                       if(list.get(i).ischek()){

                       }else{
                           list.get(i).setIschek(checked);
                           double price = list.get(i).getPrice();
                           int count1 = list.get(i).getCount();
                           if(count1==1){
                               prices+=price;

                           }else{
                               prices+=(price*count1);
                           }
                           count+=count1;
                           String format = DecimalFormat.format(prices);
                           shaoping_sum_price.setText("￥"+format);
                           shaoping_jiesuan.setText("结算  "+count);
                       }
                       mb.notifyDataSetChanged();
                   }
               }else{
                   for (int i=0;i<list.size();i++){
                       list.get(i).setIschek(checked);
                       double price = list.get(i).getPrice();
                       int count1 = list.get(i).getCount();
                       if(count1==1){
                           prices-=price;

                       }else{
                           prices-=(price*count1);
                       }
                       count-=count1;
                       shaoping_jiesuan.setText("结算");
                       shaoping_sum_price.setText("￥0.00");
                       mb.notifyDataSetChanged();
                   }
               }
           }
       });

    }

    private void initZhiFu() {
        OkHttpClient client= new OkHttpClient();
        String url="http://lexue365.51dangao.cn/api/order/add_order";
        FormBody formBody=new FormBody.Builder().add("activity_id",4+"").add("time_id",2927+"").add("child_num",1+"").add("contact","xiallin")
                .add("mobile","15718812709").add("remark",1+"").build();
        Request build = new Request.Builder().url(url).addHeader("userid", 465 + "").addHeader("cltid", "1").addHeader("token", "bbb6e99c4cd22930ea4c945d9932f98a")
                .addHeader("mobile", "15718812709").post(formBody).build();
        Call call = client.newCall(build);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Message ms=new Message();
                ms.obj=string;
                ms.what=1;
                handler.sendMessage(ms);
            }
        });
    }

    private void initAdapter() {
        //书写适配器
        mb = new MyBaseAdapter(getActivity(), list, new MyBaseAdapter.OnCheckListener() {
            @Override
            public void onCheck(boolean check, double price1, int count1, int position) {
                if (check) {
                    if (count1 == 1) {
                        prices += price1;

                    } else {
                        prices += (price1 * count1);
                    }
                    count += count1;
                    list.get(position).setIschek(check);
                    String format = DecimalFormat.format(prices);
                    shaoping_sum_price.setText("￥" + format);
                    shaoping_jiesuan.setText("结算  " + count);
                    if (count == list.size()) {
                        shaoping_chebox.setChecked(true);
                    } else {
                        shaoping_chebox.setChecked(false);
                    }

                } else {
                    if (count1 == 1) {
                        prices -= price1;
                    } else {
                        prices -= (price1 * count1);
                    }
                    count -= count1;
                    list.get(position).setIschek(check);
                    String format = DecimalFormat.format(prices);
                    shaoping_sum_price.setText("￥" + format);
                    shaoping_jiesuan.setText("结算  " + count);
                    if (count == list.size()) {
                        shaoping_chebox.setChecked(true);
                    } else {
                        shaoping_chebox.setChecked(false);
                    }
                    if (count == 0) {
                        shaoping_jiesuan.setText("结算");
                        shaoping_sum_price.setText("￥0.00");
                    }

                }
            }
        }, new MyBaseAdapter.OnShanListener() {
            @Override
            public void onShan(int position) {
                 list.remove(position);
                deleteData(list.get(position).getId());
                 mb.notifyDataSetChanged();
                 xlv.turnToNormal();

            }
        });
        xlv.setAdapter(mb);
        xlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(xlv.canClick()) {
                    Toast.makeText(getActivity(), list.get(position).getCount()+"", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void deleteData(int id) {
        String url="http://169.254.116.62:8080/bullking1/deletepro?id="+id;
        AsyncHttpClient client=new AsyncHttpClient();
        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Toast.makeText(getActivity(), "删除成功！！！", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(getActivity(), "删除失败！！！", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        int myid = sh1.getInt("myid", 0);
        OkHttpClient okHttpClient = new OkHttpClient();
        String url="http://169.254.116.62:8080/bullking1/cart?userID="+myid;
        //创建请求方式
        Log.i("xxx","aaa="+url);
        Request builder = new Request.Builder().url(url).build();
        //创建call
        Call call = okHttpClient.newCall(builder);
         call.enqueue(new Callback() {
             @Override
             public void onFailure(Call call, IOException e) {

             }

             @Override
             public void onResponse(Call call, Response response) throws IOException {
                 String string = response.body().string();
                 Message ms=new Message();
                 ms.what=0;
                 ms.obj=string;
                 handler.sendMessage(ms);
             }
         });
    }
    @Override
    public void onResume() {
        super.onResume();

    }
    private void initView() {
        shaoping_chebox = (CheckBox) view.findViewById(R.id.shaoping_chebox);
        shaoping_jiesuan = (Button) view.findViewById(R.id.shaoping_jiesuan);
        shaoping_sum_price = (TextView) view.findViewById(R.id.shaoping_sum_price);
        shaoping_xiangqing = (RelativeLayout) view.findViewById(R.id.shaoping_xiangqing);
        xlv = (QQListView) view.findViewById(R.id.xlv);
        shaoping_xiaoguo = (RelativeLayout) view.findViewById(R.id.shaoping_xiaoguo);
        sh=getActivity().getSharedPreferences("bian",0);
        editor=sh.edit();
        sh1=getActivity().getSharedPreferences("login",1);
        editor1=sh1.edit();
         editor.putBoolean("ok",true);
        editor.commit();
    }
}
