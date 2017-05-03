package rikao.bawei.com.myyunifang.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.bean.LoginBean;

import static android.R.attr.name;

public class ZhuceActivity extends SwipeBackActivity implements View.OnClickListener {

    private ImageView zhuce_back;
    private EditText zhuce_name;
    private EditText zhuce_pwd;
    private Button zhuce_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        initview();
    }

    private void initview() {
        zhuce_back = (ImageView) findViewById(R.id.zhuce_back);
        zhuce_name = (EditText) findViewById(R.id.zhuce_name);
        zhuce_pwd = (EditText) findViewById(R.id.zhuce_pwd);
        zhuce_but = (Button) findViewById(R.id.zhuce_but);
        zhuce_back.setOnClickListener(this);
        zhuce_but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.zhuce_back:
                finish();
                break;
            case R.id.zhuce_but:
                getData();
                break;
        }
    }

    private void getData() {
        //获取请求队列
        RequestQueue queue= Volley.newRequestQueue(this);
        String name = zhuce_name.getText().toString();
        String pwd = zhuce_pwd.getText().toString();
        String url = "http://169.254.116.62:8080/bullking1/register?name="+name+"&pwd="+pwd+"";

        //创建StringRequest
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            //响应成功
            public void onResponse(String s) {
                Gson gson=new Gson();
                LoginBean loginBean = gson.fromJson(s, LoginBean.class);
                if(loginBean.getDataStr().equals("register succeed")){
                    Toast.makeText(ZhuceActivity.this, "注册成功！！！", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    Toast.makeText(ZhuceActivity.this, "注册失败！！！", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            //响应错误
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        //把请求方式添加到请求队列
        queue.add(request);
    }
}
