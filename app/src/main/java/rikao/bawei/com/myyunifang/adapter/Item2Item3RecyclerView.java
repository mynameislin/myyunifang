package rikao.bawei.com.myyunifang.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.media.Image;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.bean.User;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/15 16:10
 */

public class Item2Item3RecyclerView extends RecyclerView.Adapter<Item2Item3RecyclerView.MyViewHolder> {
    private Context context;
    private User.DataBean data;

    public Item2Item3RecyclerView(Context context, User.DataBean data) {
        this.context = context;
        this.data = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=View.inflate(context,R.layout.item3_iem1,null);
        MyViewHolder holder=new MyViewHolder(itemView);
        return holder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context).load(data.getSubjects().get(position).getImage()).into(holder.item3_item1_iv);
        holder.rclv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        User.DataBean.SubjectsBean subjectsBean = data.getSubjects().get(position);
        Item2Item3itemAdapter iiiap=new Item2Item3itemAdapter(context,subjectsBean);
        holder.rclv.setAdapter(iiiap);

    }
    @Override
    public int getItemCount() {
        return data.getSubjects().size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

         ImageView item3_item1_iv;
          RecyclerView rclv;

        public MyViewHolder(View itemView) {
        super(itemView);
            item3_item1_iv = (ImageView) itemView.findViewById(R.id.item3_item1_iv);
            rclv = (RecyclerView) itemView.findViewById(R.id.item3_item3_Recycler);
    }
}
}
