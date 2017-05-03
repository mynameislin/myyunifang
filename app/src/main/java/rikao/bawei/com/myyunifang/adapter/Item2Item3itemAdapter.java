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
 * @time 2017/4/16 20:07
 */

public class Item2Item3itemAdapter extends RecyclerView.Adapter<Item2Item3itemAdapter.Item3ViewHolder> {
private Context context;
 private    User.DataBean.SubjectsBean subjectsBean;

    public Item2Item3itemAdapter(Context context, User.DataBean.SubjectsBean subjectsBean) {
        this.context = context;
        this.subjectsBean = subjectsBean;
    }

    @Override
    public Item3ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View itemView=View.inflate(context, R.layout.chunji,null);
        final Item3ViewHolder iholder=new Item3ViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = iholder.getLayoutPosition();
                Intent intent=new Intent(context, WebActivity.class);
                intent.putExtra("id",subjectsBean.getGoodsList().get(position).getId());
                context.startActivity(intent);
            }
        });
        return iholder;
    }

    @Override
    public void onBindViewHolder(Item3ViewHolder holder, int position) {
          holder.chun_tv.setText(subjectsBean.getGoodsList().get(position).getGoods_name());
        holder.chun_new_price.setText("￥"+subjectsBean.getGoodsList().get(position).getShop_price());
        holder.chun_price.setText("￥"+subjectsBean.getGoodsList().get(position).getMarket_price());
        holder.chun_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        Glide.with(context).load(subjectsBean.getGoodsList().get(position).getGoods_img()).into(holder.chun_iv);
    }

    @Override
    public int getItemCount() {
        return subjectsBean.getGoodsList().size();
    }

    public class Item3ViewHolder extends RecyclerView. ViewHolder{

        private  ImageView chun_iv;
        private  TextView chun_new_price;
        private  TextView chun_price;
        private  TextView chun_tv;

        public Item3ViewHolder(View itemView) {
            super(itemView);
            chun_iv = (ImageView) itemView.findViewById(R.id.chun_iv);
            chun_new_price = (TextView) itemView.findViewById(R.id.chun_new_price);
            chun_price = (TextView) itemView.findViewById(R.id.chun_price);
            chun_tv = (TextView) itemView.findViewById(R.id.chun_tv);
        }
    }
}
