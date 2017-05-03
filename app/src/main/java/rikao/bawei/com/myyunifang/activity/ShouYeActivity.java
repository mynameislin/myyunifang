package rikao.bawei.com.myyunifang.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;
import rikao.bawei.com.myyunifang.R;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/17 13:10
 */

public class ShouYeActivity extends SwipeBackActivity{

    private WebView shou_web;
    private TextView shou_tilte;
    private TextView shou_fen;
    private TextView shou_fan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shou);
        Intent intent=getIntent();
        String title = intent.getStringExtra("title");
        String pager = intent.getStringExtra("pager");
        String title2 = intent.getStringExtra("title2");
        String data = intent.getStringExtra("data");
        //找控件
        initView();
        if(title!=null&&pager!=null){
            shou_tilte.setText(title+"展示");
            //设置WebView属性，能够执行Javascript脚本
            shou_web.getSettings().setJavaScriptEnabled(true);
            //加载需要显示的网页
            shou_web.loadUrl(pager);
            //设置Web视图
            setContentView(shou_web);

        }else{
            shou_tilte.setText(title2+"展示");
            //设置WebView属性，能够执行Javascript脚本
            shou_web.getSettings().setJavaScriptEnabled(true);
            //加载需要显示的网页
            shou_web.loadUrl(data);
            //设置Web视图
            setContentView(shou_web);
        }

    }
    @Override
    //设置回退
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && shou_web.canGoBack()) {
            shou_web.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
return false;

        }
private void initView() {
        shou_fan = (TextView) findViewById(R.id.shou_fan);
        shou_fen = (TextView) findViewById(R.id.shou_fen);
        shou_tilte = (TextView) findViewById(R.id.shou_title);
        shou_web = (WebView) findViewById(R.id.shou_web);
        }
        }
