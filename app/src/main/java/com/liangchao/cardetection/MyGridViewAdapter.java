package com.liangchao.cardetection;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 自定义Adapter
 * Created by Spring on 2015/11/28.
 */
public class MyGridViewAdapter extends BaseAdapter {
    private Context context;
    //12星座图片
    private int [] imgs = {R.drawable.huan1,R.drawable.huan1,R.drawable.huan1,
            R.drawable.huan1,R.drawable.huan1,R.drawable.huan1,R.drawable.huan1,
            R.drawable.huan1,R.drawable.huan1,R.drawable.huan1,R.drawable.huan1,
            R.drawable.huan1
    };

    //12星座文字
    private  String [] strs = {"白羊座","金牛座","双子座","巨蟹座","狮子座",
            "处女座","天秤座","天蝎座","射手座","摩羯座","水瓶座","双鱼座",
    };


    public MyGridViewAdapter(Context context) {
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.main_item,parent,false);
            holder = new ViewHolder();
            holder.imageView = (ImageView)convertView.findViewById(R.id.item_img);
            holder.textView = (TextView)convertView.findViewById(R.id.item_txt);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.imageView.setBackgroundResource(imgs[position]);
        holder.textView.setText(strs[position]);

        return convertView;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}