package rikao.bawei.com.myyunifang.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import rikao.bawei.com.myyunifang.R;


public class WelcomeActivity extends AppCompatActivity {

    private EditText ed_time;
    private int time=5;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                if (time==0){
                    Intent intent=new Intent(WelcomeActivity.this,HomeActivity.class);
                    startActivity(intent);
                }else{
                    time--;
                    ed_time.setText("跳过 "+time+" s");
                    handler.sendEmptyMessageDelayed(0,1000);
                }
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ed_time = (EditText) findViewById(R.id.ed_time);
        ed_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        },1000);
    }
}
