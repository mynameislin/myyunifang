package rikao.bawei.com.myyunifang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.List;

import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.adapter.Item2RecyclerView;
import rikao.bawei.com.myyunifang.adapter.MyRecyclerAdapter;
import rikao.bawei.com.myyunifang.bean.User;
import rikao.bawei.com.myyunifang.view.MyDecoration;

/**
 * Created by Administrator on 2017/4/12.
 */

public class ShouYeFragment extends Fragment {

    private String url="http://m.yunifang.com/yunifang/mobile/home?random=84831&encode=9dd34239798e8cb22bf99a75d1882447";
    private User user;
    private List<User.DataBean.Ad1Bean> ad1;
    private List<User.DataBean.Ad5Bean> ad5;
    private SwipeRefreshLayout srl;
    private RecyclerView recyclerview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.shouyefragment,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        srl = (SwipeRefreshLayout) view.findViewById(R.id.srl);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData();
    }
   //解析数据
    private void getData() {
//获取请求队列
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        //创建StringRequest
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            //响应成功
            @Override
            public void onResponse(String s) {
                Gson gson=new Gson();
                user = gson.fromJson(s, User.class);
                User.DataBean data = user.getData();
                initAdapter(data);
            }

        }, new Response.ErrorListener() {
            //响应错误
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        //把请求方式添加到请求队列
        queue.add(request);
    }
    private void initAdapter( User.DataBean data) {
        //设置布局的样式
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        MyRecyclerAdapter adapter=new MyRecyclerAdapter(getActivity(),data);
        //添加华丽的分割线
        MyDecoration decoration = new MyDecoration(getActivity(), MyDecoration.HORIZONTAL_LIST);
        recyclerview.addItemDecoration(decoration);
        recyclerview.setAdapter(adapter);
    }
}
