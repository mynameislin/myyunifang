package rikao.bawei.com.myyunifang.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import rikao.bawei.com.myyunifang.R;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private List<Integer> list=new ArrayList<>();
    private ImageView image;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Animation animation;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0: //适配器
                   MainActivity.MyAdapter adapter=new MyAdapter();
                    viewpager.setAdapter(adapter);
                    break;
                case 1:
                    tiao();
                    break;
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("yindao",MODE_PRIVATE);
        editor = sharedPreferences.edit();
        //自动登录
        boolean flag=sharedPreferences.getBoolean("key",false);
        if (flag){
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    handler.sendEmptyMessage(1);
                }
            },2000);
        }else{
            editor.clear();
        }
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        image = (ImageView) findViewById(R.id.main_image);
        getData();
        //发送延时消息
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        },2000);
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //滑动到最后一页显示进入
                if (position==list.size()-1){
                    image.setVisibility(View.VISIBLE);
                }else{
                    image.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //动画
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet set = new AnimationSet(true);
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_1);
                set.addAnimation(animation);
                animation.setFillAfter(true);
                image.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        editor.putBoolean("key",true);
                        editor.commit();
                        tiao();

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
    //跳转
    private void tiao() {

        Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
        startActivity(intent);

    }

    //获取数据
    private void getData() {
        list.add(R.mipmap.xiaomi_guidance_5);
        list.add(R.mipmap.xiaomi_guidance_3);
        list.add(R.mipmap.xiaomi_guidance_2);
        list.add(R.mipmap.xiaomi_guidance_1);
        list.add(R.mipmap.xiaomi_guidance_4);
    }
    //内部类
    private class MyAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return list.size();
        }
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view=View.inflate(MainActivity.this,R.layout.imageview_item,null);
            ImageView imageview= (ImageView) view.findViewById(R.id.item_iv);
            Glide.with(MainActivity.this).load(list.get(position)).into(imageview);
            container.addView(view);
            return view;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }

}
