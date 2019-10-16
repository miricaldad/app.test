package com.example.myapplication.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mcontext;
    private LayoutInflater mLayoutInfalter;

    MyGridViewAdapter(Context context){
        this.mcontext= context;
        mLayoutInfalter = LayoutInflater.from(mcontext);
    }


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null){
            convertView = mLayoutInfalter.inflate(R.layout.layout_griditem,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_gird);
            holder.textView = convertView.findViewById(R.id.tv_title1);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //赋值

        holder.textView.setText("话");

        Glide.with(mcontext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571241387753&di=7830365b87f4d95c703fa257580a87d5&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F9d0e2ea8f6c55592b94fe527d24a4f377708b45ec9cb-qwv7zF_fw658").into(holder.imageView);

        return convertView;
    }
}
