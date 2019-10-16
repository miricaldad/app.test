package com.example.myapplication.listvieew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class MyListAdapter extends BaseAdapter {

    private  Context mContext;
    private LayoutInflater mLayoutInflater;

    MyListAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
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
        public TextView tvTitle,tvTime,tvContent;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_listitem,null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.iv);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvTitle = convertView.findViewById(R.id.tv_titile);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2088-03-09");
        holder.tvContent.setText("这是内容");

        Glide.with(mContext).load("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=Could%20not%20download%20glide.jar%20(com.github.bumptech.glide%3Aglide%3A3.7.0)&step_word=&hs=0&pn=0&spn=0&di=26180&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=601259477%2C1860829817&os=27426474%2C2438573747&simid=3576802120%2C648319558&adpicid=0&lpn=0&ln=128&fr=&fmq=1571227758296_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg.newmotor.com.cn%2FUploadFiles%2F2013-07%2Flq%2F2013072514111290371.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgjo45p56_z%26e3Bv54_z%26e3BvgAzdH3F45p5AzdH3FSp6jjpGst1j6j289clAzdH3Fkw53tw_z%26e3Bfip4s%3Frw2j%3D8&gsm=&rpstart=0&rpnum=0&islist=&querylist=&force=undefined").into(holder.imageView);


        return convertView;

    }
}
