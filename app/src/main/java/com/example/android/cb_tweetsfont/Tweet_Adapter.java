package com.example.android.cb_tweetsfont;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 6/13/2017.
 */

public class Tweet_Adapter extends BaseAdapter {

ArrayList<String> tweets;
    Context context;

    public Tweet_Adapter(ArrayList<String> tweets, Context context) {
        this.tweets = tweets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return tweets.size();
    }

    @Override
    public String getItem(int position) {
        return tweets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        String thistweet= (String) getItem(position);
        if(convertView==null){
            if(thistweet.length()>10){
                convertView=li.inflate(R.layout.small_size,null);
                ((TextView)convertView.findViewById(R.id.tv_smallsize)).setText(thistweet.toString());
            }
            else{
                convertView=li.inflate(R.layout.large_size,null);
                ((TextView)convertView.findViewById(R.id.large_size)).setText(thistweet.toString());
            }

        }
        return convertView;
    }
}
