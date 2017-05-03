package rikao.bawei.com.myyunifang.Pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;
import rikao.bawei.com.myyunifang.R;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/25 13:04
 */

public class XuanZeActivity extends SwipeBackActivity {

    private Button xuanze_zhifu;
    private CheckBox cb_wx;
    private CheckBox cb_zfb;
    private String order_on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_xuanze);
        order_on = getIntent().getStringExtra("order_on");
        xuanze_zhifu = (Button) findViewById(R.id.xuanze_zhifu);
        cb_wx = (CheckBox) findViewById(R.id.cb_wx);
        cb_zfb = (CheckBox) findViewById(R.id.cb_zfb);
         cb_wx.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 boolean checked = cb_wx.isChecked();
                 if(checked){
                     cb_zfb.setChecked(false);
                 }
             }
         });
        cb_zfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = cb_zfb.isChecked();
                if(checked){
                    cb_wx.setChecked(false);
                }
            }
        });
          xuanze_zhifu.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent=new Intent(XuanZeActivity.this,PayDemoActivity.class);
                  intent.putExtra("order", order_on);
                  startActivity(intent);
              }
          });
    }
}
