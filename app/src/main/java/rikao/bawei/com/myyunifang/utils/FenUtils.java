package rikao.bawei.com.myyunifang.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rikao.bawei.com.myyunifang.activity.FenLeiActivity;
import rikao.bawei.com.myyunifang.bean.FenZhanShi;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/18 13:53
 */

public class FenUtils {
    private OkHttpClient httpClient;
    private Request request;
    Context context=null;
    private Handler handler=new Handler(){



        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                String   str = (String) msg.obj;
                Gson gson=new Gson();
                FenZhanShi fenZhanShi = gson.fromJson(str, FenZhanShi.class);
                Log.i("xxx",fenZhanShi.getData().get(0).getGoods_name());
                Intent intent=new Intent(context, FenLeiActivity.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("fen",fenZhanShi);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        }
    };
    public void okHttp(String url, final Context cc){
       //创建okhttpclient对象
        httpClient=new OkHttpClient();
        //创建请求
        request = new Request.Builder().url(url).build();
        //创建call对象
        Call call = httpClient.newCall(request);
    //创建异步线程访问对象
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
            String    string = response.body().string();
              context =cc;
                Message message = new Message();
                message.what=0;
               message.obj=string;
                handler.sendMessage(message);

            }
        });
    }
}
