package rikao.bawei.com.myyunifang.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.stx.xhb.xbanner.XBanner;

import java.util.ArrayList;
import java.util.List;

import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.bean.User;
import rikao.bawei.com.myyunifang.view.MyDecoration;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/15 10:48
 */

public class Item2RecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private User.DataBean data;
    private LayoutInflater mLayoutInflater;
    private List<String> list=new ArrayList<>();
public enum  ITEM2_TYPE{
    ITEM1,ITEM2,ITEM3,ITEM4;
}
    public Item2RecyclerView(Context context, User.DataBean data) {
        this.context = context;
        this.data = data;
        this.mLayoutInflater=mLayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       if(viewType==ITEM2_TYPE.ITEM1.ordinal()){
             return new viewHolder1(mLayoutInflater.inflate(R.layout.item2_item1,null));
       }else if(viewType==ITEM2_TYPE.ITEM2.ordinal()){
            return new viewHolder2(mLayoutInflater.inflate(R.layout.item2_item2,parent,false));
       }else if(viewType==ITEM2_TYPE.ITEM3.ordinal()){
            return  new viewHolder3(mLayoutInflater.inflate(R.layout.item2_item3,parent,false));
       }else{
          return  new viewHolder4(mLayoutInflater.inflate(R.layout.item2_item4,null));
       }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
               if(holder instanceof viewHolder1){
                   ((viewHolder1) holder).item2_i1_tv.setText(data.getBestSellers().get(0).getName());
                     Item2Item1RecyclerView iirv=new Item2Item1RecyclerView(context,data);
                   ((viewHolder1) holder).item2_i1_recycler.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
                   //添加华丽的分割线
                   MyDecoration decoration = new MyDecoration(context, MyDecoration.HORIZONTAL_LIST);
                   ((viewHolder1) holder).item2_i1_recycler.addItemDecoration(decoration);
                      ((viewHolder1) holder).item2_i1_recycler.setAdapter(iirv);
               }else if(holder instanceof viewHolder2){
                   ((viewHolder2) holder).item2_item2_tv.setText("优惠活动");
                   for (int i=0;i<data.getActivityInfo().getActivityInfoList().size();i++){
                       list.add(data.getActivityInfo().getActivityInfoList().get(i).getActivityImg());
                   }
                   ((viewHolder2) holder).item2_item2_viewpager.setData(list,null);
                   ((viewHolder2) holder).item2_item2_viewpager.setmAdapter(new XBanner.XBannerAdapter() {
                       @Override
                       public void loadBanner(XBanner banner, View view, int position) {
                           Glide.with(context).load(list.get(position)).into((ImageView) view);
                       }
                   });
               }else if(holder instanceof  viewHolder3){
                   ((viewHolder3) holder).item3_i3_recycler.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
                   Item2Item3RecyclerView item3RecyclerView=new Item2Item3RecyclerView(context,data);
                   ((viewHolder3) holder).item3_i3_recycler.setAdapter(item3RecyclerView);
               }else if(holder instanceof  viewHolder4){
                    ((viewHolder4) holder).item2_item4_recyclcerView.setLayoutManager(new GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false));
                   Item2Item4RecyclerView iirc=new Item2Item4RecyclerView(context,data);
                   ((viewHolder4) holder).item2_item4_recyclcerView.setAdapter(iirc);

               }
    }
    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return ITEM2_TYPE.ITEM1.ordinal();
        }else if(position==1){
            return ITEM2_TYPE.ITEM2.ordinal();

        }else if(position==2){
            return ITEM2_TYPE.ITEM3.ordinal();
        }else if(position==3){
            return ITEM2_TYPE.ITEM4.ordinal();
        }
        return 1;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
    public static class viewHolder1 extends RecyclerView.ViewHolder{

        TextView item2_i1_tv;
        RecyclerView item2_i1_recycler;

        public viewHolder1(View itemView) {
            super(itemView);
            item2_i1_recycler = (RecyclerView) itemView.findViewById(R.id.item2_i1_recycler);
            item2_i1_tv = (TextView) itemView.findViewById(R.id.item2_i1_tv);
        }
    }
    public static class viewHolder2 extends RecyclerView.ViewHolder{
         TextView item2_item2_tv;
        XBanner item2_item2_viewpager;
        public viewHolder2(View itemView) {
            super(itemView);
            item2_item2_tv = (TextView) itemView.findViewById(R.id.item2_item2_tv);
          item2_item2_viewpager = (XBanner) itemView.findViewById(R.id.item2_item2_viewpager);

        }
    }
    public static class viewHolder3 extends RecyclerView.ViewHolder{

         RecyclerView item3_i3_recycler;

        public viewHolder3(View itemView) {
            super(itemView);
            item3_i3_recycler = (RecyclerView) itemView.findViewById(R.id.item3_i3_recycler);
        }
    }
    public static class viewHolder4 extends RecyclerView.ViewHolder{

         RecyclerView item2_item4_recyclcerView;

        public viewHolder4(View itemView) {
            super(itemView);
            item2_item4_recyclcerView = (RecyclerView) itemView.findViewById(R.id.item2_item4_recyclcerView);

        }
    }
}
