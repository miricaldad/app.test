package com.example.myapplication.listvieew;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.myapplication.R;

public class ListViewActivity extends Activity {

    private ListView mlv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        mlv = findViewById(R.id.lv_1);
        mlv.setAdapter(new MyListAdapter(ListViewActivity.this));

        mlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"pos:"+position,Toast.LENGTH_SHORT).show();

                //跳转
            }
        });

        mlv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"changan pos:"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }
}
