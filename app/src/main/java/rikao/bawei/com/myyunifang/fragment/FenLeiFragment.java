package rikao.bawei.com.myyunifang.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.adapter.FeileiRecyclerView;
import rikao.bawei.com.myyunifang.bean.FenLei;
import rikao.bawei.com.myyunifang.utils.FenUtils;

/**
 * Created by Administrator on 2017/4/12.
 */

public class FenLeiFragment extends Fragment implements View.OnClickListener {

    private View view;
    private ImageView type_sx_mianmo;
    private ImageView type_sx_runfushui;
    private ImageView type_sx_runfuru;
    private ImageView type_sx_jiemianru;
    private ImageView type_sx_other;
    private ImageView type_sx_taozhuang;
    private ImageView type_sx_man;
    private ImageView type_gx_bushui;
    private ImageView type_gx_xiufu;
    private ImageView type_gx_kongyou;
    private ImageView type_gx_meibai;
    private ImageView type_gx_kangzhou;
    private Button type_fz_huihe;
    private Button type_fz_zhongxing;
    private Button type_fz_ganxing;
    private Button type_fz_youxing;
    private Button type_fz_doudou;
    private Button type_fz_mingan;
    private RecyclerView type_recyclerView;
    private Handler handler=new Handler(){

        private FenLei fenLei;

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
             if(msg.what==0){
                 String obj = (String) msg.obj;
                 Gson gson=new Gson();
                 fenLei = gson.fromJson(obj, FenLei.class);
                  type_recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2,GridLayoutManager.VERTICAL,false));
                 FeileiRecyclerView fen=new FeileiRecyclerView(getActivity(),fenLei);
                 type_recyclerView.setAdapter(fen);
             }
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fenleifragment,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
         initView();
        //获取数据
        getData();
    }

    private void initView() {
        //按属性的id
        type_sx_mianmo = (ImageView) getActivity().findViewById(R.id.type_sx_mianmo);
        type_sx_runfushui = (ImageView) getActivity().findViewById(R.id.type_sx_runfushui);
        type_sx_runfuru = (ImageView) getActivity().findViewById(R.id.type_sx_runfuru);
        type_sx_jiemianru = (ImageView) getActivity().findViewById(R.id.type_sx_jiemianru);
        type_sx_other = (ImageView) getActivity().findViewById(R.id.type_sx_other);
        type_sx_taozhuang = (ImageView) getActivity().findViewById(R.id.type_sx_taozhuang);
        type_sx_man = (ImageView) getActivity().findViewById(R.id.type_sx_man);

        //按功效的id
        type_gx_bushui = (ImageView) getActivity().findViewById(R.id.type_gx_bushui);
        type_gx_xiufu = (ImageView) getActivity().findViewById(R.id.type_gx_xiufu);
        type_gx_kongyou = (ImageView) getActivity().findViewById(R.id.type_gx_kongyou);
        type_gx_meibai = (ImageView) getActivity().findViewById(R.id.type_gx_meibai);
        type_gx_kangzhou = (ImageView) getActivity().findViewById(R.id.type_gx_kangzhou);

        //按肤质的id
        type_fz_huihe = (Button) getActivity().findViewById(R.id.type_fz_huihe);
        type_fz_zhongxing = (Button) getActivity().findViewById(R.id.type_fz_zhongxing);
        type_fz_ganxing = (Button) getActivity().findViewById(R.id.type_fz_ganxing);
        type_fz_youxing = (Button) getActivity().findViewById(R.id.type_fz_youxing);
        type_fz_doudou = (Button) getActivity().findViewById(R.id.type_fz_doudou);
        type_fz_mingan = (Button) getActivity().findViewById(R.id.type_fz_mingan);


        //明星产品id
        type_recyclerView = (RecyclerView) getActivity().findViewById(R.id.type_recyclerView);

        //按属性的id
        type_sx_mianmo.setOnClickListener(this);
        type_sx_runfushui.setOnClickListener(this);
        type_sx_runfuru.setOnClickListener(this);
        type_sx_jiemianru.setOnClickListener(this);
        type_sx_other.setOnClickListener(this);
        type_sx_taozhuang.setOnClickListener(this);
        type_sx_man.setOnClickListener(this);


        type_gx_bushui.setOnClickListener(this);
        type_gx_xiufu.setOnClickListener(this);
        type_gx_kongyou.setOnClickListener(this);
        type_gx_meibai.setOnClickListener(this);
        type_gx_kangzhou.setOnClickListener(this);

        type_fz_huihe.setOnClickListener(this);
        type_fz_zhongxing.setOnClickListener(this);
        type_fz_ganxing.setOnClickListener(this);
        type_fz_youxing.setOnClickListener(this);
        type_fz_doudou.setOnClickListener(this);
        type_fz_mingan.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FenUtils ff=new FenUtils();
            switch (v.getId()){
                case R.id.type_sx_mianmo:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=13819&encode=d58e53c4b9e24bd5ba276ba68f8e98ec&category_id=17",getActivity());
                break;
                case R.id.type_sx_runfushui:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=39",getActivity());

                    break;
                case R.id. type_sx_runfuru:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=40",getActivity());

                    break;
                case R.id. type_sx_jiemianru :
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=24",getActivity());

                    break;
                case R.id. type_sx_other :
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=35",getActivity());

                    break;
                case R.id. type_sx_taozhuang:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=33",getActivity());

                    break;
                case R.id.type_sx_man:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=41   ",getActivity());

                    break;
                case R.id.type_gx_bushui:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=17",getActivity());

                    break;
                case R.id.type_gx_xiufu:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=31",getActivity());
                    break;
                case R.id.type_gx_kongyou:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=19",getActivity());
                    break;
                case R.id.type_gx_meibai:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=18",getActivity());
                    break;
                case R.id.type_gx_kangzhou:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=20",getActivity());
                    break;
                case R.id.type_fz_huihe:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=14",getActivity());
                    break;
                case R.id.type_fz_zhongxing:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=13",getActivity());
                    break;
                case R.id.type_fz_ganxing:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=29",getActivity());
                    break;
                case R.id.type_fz_youxing:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=28",getActivity());
                    break;
                case R.id.type_fz_doudou:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=15",getActivity());
                    break;
                case R.id.type_fz_mingan:
                    ff.okHttp("http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=37",getActivity());
                    break;



            }
    }

    public void getData() {
              //创建okhttpclient对象
         OkHttpClient mOkHttpClient = new OkHttpClient();
         String url="http://m.yunifang.com/yunifang/mobile/category/list?random=96333&encode=bf3386e14fe5bb0bcef234baebca2414";
          //创建Requset对象
        Request build = new Request.Builder().url(url).build();
        //创建call对象
        Call call = mOkHttpClient.newCall(build);
         //创建异步线程访问网络
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Message message = handler.obtainMessage(0, string);
                message.sendToTarget();
            }
        });
    }
}
