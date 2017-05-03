package rikao.bawei.com.myyunifang.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;
import rikao.bawei.com.myyunifang.R;
import rikao.bawei.com.myyunifang.adapter.FeileiAdapter;
import rikao.bawei.com.myyunifang.bean.FenZhanShi;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/19 14:37
 */

public class FenLeiActivity extends SwipeBackActivity {

    private RecyclerView fenlei_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenlei);
        Intent intent=getIntent();
        FenZhanShi fen = (FenZhanShi) intent.getSerializableExtra("fen");
        Log.i("xxx",fen.getData().get(0).getGoods_img()) ;
        fenlei_recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.fenlei_recyclerview);
        fenlei_recyclerView.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        FeileiAdapter adapter=new FeileiAdapter(this,fen);
        fenlei_recyclerView.setAdapter(adapter);
    }
}
