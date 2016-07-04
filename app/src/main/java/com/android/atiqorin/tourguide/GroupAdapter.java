package com.android.atiqorin.tourguide;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by atiqorin on 7/3/16.
 */
public class GroupAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public GroupAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Attractions";
        } else if (position == 1){
            return "Food";
        } else if(position == 2){
            return "Restaurants";
        } else {
            return "Facts";
        }
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new FactsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
