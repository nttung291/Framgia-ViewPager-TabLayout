package com.framgia.framgia_viewpager_tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nttungg on 1/25/18.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new MainFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
