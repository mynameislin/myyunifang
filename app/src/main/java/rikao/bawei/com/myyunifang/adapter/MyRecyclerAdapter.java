package rikao.bawei.com.myyunifang.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.stx.xhb.xbanner.XBanner;
import com.stx.xhb.xbanner.transformers.Transformer;
import java.util.ArrayList;
import java.util.List;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.activity.ShouYeActivity;
import rikao.bawei.com.myyunifang.bean.User;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/14 20:51
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private LayoutInflater mLayoutInflater;
    private User.DataBean data;
    private List<String> list=new ArrayList<>();
     //定义枚举类来定义两个类型
    public enum ITEM_TYPE{
        ITEM1,
        ITEM2
    }

    public MyRecyclerAdapter(Context context, User.DataBean data) {
        this.context = context;

        this.data = data;
        this.mLayoutInflater = mLayoutInflater.from(context);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
       //加载item view的时候根据不同的TYPE加载不同的布局
        if(viewType==ITEM_TYPE.ITEM1.ordinal()){
          return new item1ViewHolder(mLayoutInflater.inflate(R.layout.item1,parent,false));
        }else {
            return new item2ViewHolder(mLayoutInflater.inflate(R.layout.item2,parent,false));
        }
    }
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof item1ViewHolder){
            Glide.with(context).load(data.getAd5().get(position).getImage()).into(((item1ViewHolder) holder).iv1);
            ((item1ViewHolder) holder).tv1.setText(data.getAd5().get(0).getTitle());
            Glide.with(context).load(data.getAd5().get(position+1).getImage()).into(((item1ViewHolder) holder).iv2);
            ((item1ViewHolder) holder).tv2.setText(data.getAd5().get(1).getTitle());
            Glide.with(context).load(data.getAd5().get(2).getImage()).into(((item1ViewHolder) holder).iv3);
            ((item1ViewHolder) holder).tv3.setText(data.getAd5().get(2).getTitle());
            Glide.with(context).load(data.getAd5().get(3).getImage()).into(((item1ViewHolder) holder).iv4);
            ((item1ViewHolder) holder).tv4.setText(data.getAd5().get(3).getTitle());
             ((item1ViewHolder) holder).iv1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                      Intent intent=new Intent(context,ShouYeActivity.class);
                      intent.putExtra("title2",data.getAd5().get(0).getTitle());
                      intent.putExtra("data",data.getAd5().get(0).getAd_type_dynamic_data());
                     context.startActivity(intent);
                 }
             });
            ((item1ViewHolder) holder).iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,ShouYeActivity.class);
                    intent.putExtra("title2",data.getAd5().get(1).getTitle());
                    intent.putExtra("data",data.getAd5().get(1).getAd_type_dynamic_data());
                    context.startActivity(intent);
                }
            });
            ((item1ViewHolder) holder).iv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,ShouYeActivity.class);
                    intent.putExtra("title2",data.getAd5().get(2).getTitle());
                    intent.putExtra("data",data.getAd5().get(2).getAd_type_dynamic_data());
                    context.startActivity(intent);
                }
            });
            ((item1ViewHolder) holder).iv4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,ShouYeActivity.class);
                    intent.putExtra("title2",data.getAd5().get(3).getTitle());
                    intent.putExtra("data",data.getAd5().get(3).getAd_type_dynamic_data());
                    context.startActivity(intent);
                }
            });

            for (int i=0;i<data.getAd1().size();i++){
                list.add(data.getAd1().get(i).getImage());
            }
            ((item1ViewHolder) holder).xBanner.setData(list,null);
            ((item1ViewHolder) holder).xBanner.setmAdapter(new XBanner.XBannerAdapter() {
                @Override
                public void loadBanner(XBanner banner, View view, int position) {
                    Glide.with(context).load(list.get(position)).into((ImageView) view);
                }
            });
            // 设置XBanner的页面切换特效
            ((item1ViewHolder) holder).xBanner.setPageTransformer(Transformer.Default);
            // 设置XBanner页面切换的时间，即动画时长
            ((item1ViewHolder) holder).xBanner.setPageChangeDuration(1000);
                 ((item1ViewHolder) holder).xBanner.setOnItemClickListener(new XBanner.OnItemClickListener() {
                     @Override
                     public void onItemClick(XBanner banner, int position) {
                         Intent intent=new Intent(context, ShouYeActivity.class);
                         intent.putExtra("pager",data.getAd1().get(position).getAd_type_dynamic_data());
                         Log.i("xxx",data.getAd1().get(position).getTitle());
                         intent.putExtra("title",data.getAd1().get(position).getTitle());
                         context.startActivity(intent);
                     }
                 });
        }else if(holder instanceof item2ViewHolder){
           /* ViewGroup.LayoutParams layoutParams=((item2ViewHolder) holder).item2_recycler.getLayoutParams();
            screenWidth = metric.widthPixels;
            layoutParams.height = screenWidth/3 + dip2px(20);*/
            //设置布局的样式
            ((item2ViewHolder) holder).item2_recycler.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
            Item2RecyclerView irv=new Item2RecyclerView(context,data);
            ((item2ViewHolder) holder).item2_recycler.setAdapter(irv);
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return ITEM_TYPE.ITEM1.ordinal();

        }else if(position==1){
            return  ITEM_TYPE.ITEM2.ordinal();

        }
        return ITEM_TYPE.ITEM2.ordinal();
    }
    public static class item1ViewHolder extends  RecyclerView.ViewHolder {
         ImageView iv1;
        ImageView iv2;
        ImageView iv3;
         ImageView iv4;
         TextView tv1;
         TextView tv2;
         TextView tv3;
         TextView tv4;
         XBanner xBanner;

        public item1ViewHolder(View itemView) {
            super(itemView);
            iv1 = (ImageView) itemView.findViewById(R.id.item1_iv1);
            iv2 = (ImageView) itemView.findViewById(R.id.item1_iv2);
            iv3 = (ImageView) itemView.findViewById(R.id.item1_iv3);
            iv4 = (ImageView) itemView.findViewById(R.id.item1_iv4);
            tv1 = (TextView) itemView.findViewById(R.id.item1_tv1);
            tv2 = (TextView) itemView.findViewById(R.id.item1_tv2);
            tv3 = (TextView) itemView.findViewById(R.id.item1_tv3);
            tv4 = (TextView) itemView.findViewById(R.id.item1_tv4);
            xBanner = (XBanner) itemView.findViewById(R.id.item1_viewpager);
        }
    }
    public static class item2ViewHolder extends  RecyclerView.ViewHolder {

         RecyclerView item2_recycler;

        public item2ViewHolder(View itemView) {
            super(itemView);
            item2_recycler = (RecyclerView) itemView.findViewById(R.id.item2_recyclerView);
        }
    }

}
