package rikao.bawei.com.myyunifang.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.bean.LoginBean;

public class LoginActivity extends SwipeBackActivity implements View.OnClickListener {

    private ImageView login_back;
    private TextView login_zhuce;
    private EditText login_name;
    private EditText login_pwd;
    private TextView login_lose;
    private Button login_but;
    private ImageView login_qq;
    private ImageView login_sina;
    private ImageView login_weixin;
    public SharedPreferences sh;
    public SharedPreferences.Editor editor;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
              if(msg.what==0){
                 String json= (String) msg.obj;
                  Gson gson=new Gson();
                  LoginBean loginBean = gson.fromJson(json, LoginBean.class);
                  if(loginBean.getDataStr().equals("login succeed")){
                      Toast.makeText(LoginActivity.this, "登录成功！！！", Toast.LENGTH_SHORT).show();
                      editor.putInt("myid",loginBean.getId());
                      editor.putBoolean("mylogin",true);
                       editor.commit();
                      finish();
                  }else {
                      Toast.makeText(LoginActivity.this, "登录失败！！！", Toast.LENGTH_SHORT).show();
                  }
              }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //找控件
        initview();
        sh=getSharedPreferences("login",1);
        editor=sh.edit();

    }

    private void initview() {
        login_back = (ImageView) findViewById(R.id.login_back);
        login_zhuce = (TextView) findViewById(R.id.login_zhuce);
        login_name = (EditText) findViewById(R.id.login_name);
        login_pwd = (EditText) findViewById(R.id.login_pwd);
        login_lose = (TextView) findViewById(R.id.login_lose);
        login_but = (Button) findViewById(R.id.login_but);
        login_qq = (ImageView) findViewById(R.id.login_qq);
        login_sina = (ImageView) findViewById(R.id.login_sina);
        login_weixin = (ImageView) findViewById(R.id.login_weixin);
        login_back.setOnClickListener(this);
        login_zhuce.setOnClickListener(this);
        login_lose.setOnClickListener(this);
        login_but.setOnClickListener(this);
        login_qq.setOnClickListener(this);
        login_sina.setOnClickListener(this);
        login_weixin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //点击返回
            case R.id.login_back:
                finish();
                break;
            //注册页面
            case R.id.login_zhuce:
                Intent intent=new Intent(LoginActivity.this,ZhuceActivity.class);
                startActivity(intent);
                break;
            //点击登录
            case R.id.login_but:
                  initLogin();
                break;
            //忘记密码
            case R.id.login_lose:
                break;
            //qq登录
            case R.id.login_qq:
                break;
            //微博登录
            case R.id.login_sina:
                break;
            //微信登录
            case R.id.login_weixin:
                break;

        }

    }

    private void initLogin() {
        String name = login_name.getText().toString();
        Log.i("xxx",name);
        String pwd = login_pwd.getText().toString();
        Log.i("xxx",pwd);
        OkHttpClient okHttpClient = new OkHttpClient();
        String url="http://169.254.116.62:8080/bullking1/login?name="+name+"&pwd="+pwd;
        //创建请求方式
        Request builder = new Request.Builder().url(url).build();
        //创建call对象
        Call call = okHttpClient.newCall(builder);
       call.enqueue(new Callback() {
           @Override
           public void onFailure(Call call, IOException e) {

           }

           @Override
           public void onResponse(Call call, Response response) throws IOException {
               String string = response.body().string();
               Log.i("xxx",string);
               Message ms=new Message();
               ms.obj=string;
               ms.what=0;
               handler.sendMessage(ms);

           }
       });
    }
}
