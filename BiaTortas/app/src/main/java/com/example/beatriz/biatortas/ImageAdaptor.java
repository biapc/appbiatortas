package com.example.beatriz.biatortas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdaptor extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds;
    //private LayoutInflater layoutInflater;

    public ImageAdaptor(Context context, int[] images) {
        mContext = context;
        mImageIds = images;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        /*layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imview = (ImageView) view.findViewById(R.id.imageView);
        imview.setImageResource(mImageIds[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);
        return view;*/

        ImageView imageview = new ImageView(mContext);
        imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageview.setImageResource(mImageIds[position]);
        container.addView(imageview, 0);
        return imageview;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        /*ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);*/
        container.removeView((ImageView) object);
    }
}
