package rikao.bawei.com.myyunifang.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.bean.ShpingData;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/21 15:51
 */

public class MyBaseAdapter extends BaseAdapter {
    private Context context;
    private List<ShpingData> list;

    //声明接口
    public OnCheckListener listener;
    public OnShanListener sListener;
    //定义接口
    public  interface  OnCheckListener{
            void onCheck(boolean check,double price1,int count1,int position);
    }
    public  interface  OnShanListener{
        void onShan(int position);
    }
    public MyBaseAdapter(Context context, List<ShpingData> list,OnCheckListener listener,OnShanListener sListener) {
        this.context = context;
        this.list = list;
        this.listener=listener;
        this.sListener=sListener;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
       final viewHolder vv;
        if(convertView==null){
            vv=new viewHolder();
            convertView=View.inflate(context, R.layout.item_gouwuche,null);
            vv.ch= (CheckBox) convertView.findViewById(R.id.shaoping_item_chebox);
            vv.iv= (ImageView) convertView.findViewById(R.id.shaoping_item_image);
            vv.title= (TextView) convertView.findViewById(R.id.shaoping_item_title);
            vv.price= (TextView) convertView.findViewById(R.id.shaoping_item_price);
            vv.count= (TextView) convertView.findViewById(R.id.shaoping_item_count);
             vv.delete = (TextView) convertView.findViewById(R.id.delete);
            convertView.setTag(vv);
        }else{
           vv= (viewHolder) convertView.getTag();
        }
        vv.ch.setChecked(list.get(position).ischek());
        vv.title.setText(list.get(position).getName());
        vv.count.setText("数量:"+list.get(position).getCount());
        vv.price.setText("￥ "+list.get(position).getPrice());
        Glide.with(context).load(list.get(position).getPic()).into(vv.iv);
         vv.delete.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 sListener.onShan(position);

             }
         });
        vv.ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = vv.ch.isChecked();
                list.get(position).setIschek(checked);
                 if(checked){
                     listener.onCheck(checked,list.get(position).getPrice(),list.get(position).getCount(),position);
                 }else{
                     listener.onCheck(checked,list.get(position).getPrice(),list.get(position).getCount(),position);
                 }
            }
        });

        return convertView;
    }
    class viewHolder{
        ImageView iv;
        TextView title,price,count,delete;
        CheckBox ch;
    }
}
