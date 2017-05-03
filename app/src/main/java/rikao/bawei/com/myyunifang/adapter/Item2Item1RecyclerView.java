package rikao.bawei.com.myyunifang.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.activity.WebActivity;
import rikao.bawei.com.myyunifang.bean.User;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/15 16:10
 */

public class Item2Item1RecyclerView extends RecyclerView.Adapter<Item2Item1RecyclerView.MyViewHolder> {
    private Context context;
    private User.DataBean data;

    public Item2Item1RecyclerView(Context context, User.DataBean data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View ItemView =View.inflate(context, R.layout.chunji,null);
        final MyViewHolder holder=new MyViewHolder(ItemView);

        ItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getLayoutPosition();
                Intent intent=new Intent(context, WebActivity.class);
                intent.putExtra("id",data.getBestSellers().get(0).getGoodsList().get(position).getId());
                context.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context).load(data.getBestSellers().get(0).getGoodsList().get(position).getGoods_img()).into(holder.chun_iv);
        holder.chun_tv.setText(data.getBestSellers().get(0).getGoodsList().get(position).getGoods_name());
        holder.chun_new_price.setText("￥"+data.getBestSellers().get(0).getGoodsList().get(position).getShop_price());
        holder.chun_price.setText("￥"+data.getBestSellers().get(0).getGoodsList().get(position).getMarket_price());
        holder.chun_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

    }
    @Override
    public int getItemCount() {
        return data.getBestSellers().get(0).getGoodsList().size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
         ImageView chun_iv;
         TextView chun_new_price;
         TextView chun_price;
         TextView chun_tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            chun_iv = (ImageView) itemView.findViewById(R.id.chun_iv);
            chun_new_price = (TextView) itemView.findViewById(R.id.chun_new_price);
            chun_price = (TextView) itemView.findViewById(R.id.chun_price);
            chun_tv = (TextView) itemView.findViewById(R.id.chun_tv);
        }
    }
}
