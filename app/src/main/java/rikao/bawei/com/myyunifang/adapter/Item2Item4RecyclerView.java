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
import rikao.bawei.com.myyunifang.activity.ShouYeActivity;
import rikao.bawei.com.myyunifang.activity.WebActivity;
import rikao.bawei.com.myyunifang.bean.User;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/16 20:56
 */

public class Item2Item4RecyclerView extends RecyclerView.Adapter<Item2Item4RecyclerView.Item4ViewHolder> {
  private Context context;
    private User.DataBean data;

    public Item2Item4RecyclerView(Context context, User.DataBean data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public Item4ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=View.inflate(context, R.layout.item4_grid,null);
        final Item4ViewHolder holder=new Item4ViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getLayoutPosition();
                Intent intent=new Intent(context, WebActivity.class);
                intent.putExtra("id",data.getDefaultGoodsList().get(position).getId());
                context.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(Item4ViewHolder holder, int position) {
          holder.item4_name_tv.setText(data.getDefaultGoodsList().get(position).getEfficacy());
        holder.item4_title_tv.setText(data.getDefaultGoodsList().get(position).getGoods_name());
        holder.item4_new_price.setText("￥"+data.getDefaultGoodsList().get(position).getShop_price());
        holder.item4_price.setText("￥"+data.getDefaultGoodsList().get(position).getMarket_price());
        holder.item4_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        Glide.with(context).load(data.getDefaultGoodsList().get(position).getGoods_img()).into(holder.item4_iv);

    }


    @Override
    public int getItemCount() {
        return data.getDefaultGoodsList().size();
    }

    public class Item4ViewHolder extends RecyclerView.ViewHolder{

        private  ImageView item4_iv;
        private  TextView item4_name_tv;
        private  TextView item4_title_tv;
        private  TextView item4_new_price;
        private  TextView item4_price;

        public Item4ViewHolder(View itemView) {
            super(itemView);
            item4_iv = (ImageView) itemView.findViewById(R.id.item4_iv);
            item4_name_tv = (TextView) itemView.findViewById(R.id.item4_name_tv);
            item4_title_tv = (TextView) itemView.findViewById(R.id.item4_title_tv);
            item4_new_price = (TextView) itemView.findViewById(R.id.item4_new_price);
            item4_price = (TextView) itemView.findViewById(R.id.item4_price);
        }
    }
}
