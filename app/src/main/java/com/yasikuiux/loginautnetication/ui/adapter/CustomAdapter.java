package com.yasikuiux.loginautnetication.ui.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

import com.yasikuiux.loginautnetication.R;

public class CustomAdapter extends PagerAdapter {

    private Activity activity;
    private Integer[] imagesArray;
    private String[] namesArray;

    public CustomAdapter(Activity activity,Integer[] imagesArray,String[] namesArray){

        this.activity = activity;
        this.imagesArray = imagesArray;
        this.namesArray = namesArray;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = (activity).getLayoutInflater();
        //creating  xml file for custom viewpager
        View viewItem = inflater.inflate(R.layout.content_customadapter, container, false);
        //finding id
        ImageView imageView =  viewItem.findViewById(R.id.imageView);
        //setting data
        imageView.setBackgroundResource(imagesArray[position]);

        container.addView(viewItem);

        return viewItem;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return imagesArray.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        // TODO Auto-generated method stub
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        container.removeView((View) object);
    }
}