package rikao.bawei.com.myyunifang.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.fragment.FenLeiFragment;
import rikao.bawei.com.myyunifang.fragment.MyFragment;
import rikao.bawei.com.myyunifang.fragment.ShoppingFragment;
import rikao.bawei.com.myyunifang.fragment.ShouYeFragment;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout framelayout;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private FragmentManager manager;
    private ShouYeFragment shouYeFragment;
    private FenLeiFragment fenLeiFragment;
    private ShoppingFragment shoppingFragment;
    private MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initview();
        //设置默认
        shouYeFragment = new ShouYeFragment();
        fenLeiFragment = new FenLeiFragment();
        shoppingFragment = new ShoppingFragment();
        myFragment = new MyFragment();
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment, shouYeFragment, "shouye");
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rb1:
                //获得焦点
                rb1.setFocusable(true);
                rb1.requestFocus();
                changeFragment(shouYeFragment, "shouye");
                break;
            case R.id.rb2:
                //失去焦点
                rb1.setFocusable(false);
                changeFragment(fenLeiFragment, "fenlei");
                break;
            case R.id.rb3:
                rb1.setFocusable(false);
                changeFragment(shoppingFragment, "shopping");
                break;
            case R.id.rb4:
                rb1.setFocusable(false);
                changeFragment(myFragment, "my");
                break;
        }

    }


    private void initview() {
        framelayout = (FrameLayout) findViewById(R.id.fragment);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        rb4.setOnClickListener(this);
        rb1.requestFocus();

    }

    //替换fragment
    private void changeFragment(Fragment fragment, String tag) {
        FragmentTransaction beginTransaction = manager.beginTransaction();
        beginTransaction.replace(R.id.fragment, fragment,tag);
        beginTransaction.commit();
    }


}
