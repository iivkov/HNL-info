package com.ivkovic.hnlinfo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class HistoryPagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 2;

    public HistoryPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new HistoryFragOverview();
                break;
            case 1:
                fragment = new HistoryFragChampions();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0: return "Pregled";
            case 1: return "Prvaci";
        }
        return  null;
    }

    @Override
    public int getCount()
    {
        return NUM_PAGES;
    }
}
