package com.ivkovic.hnlinfo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class StatisticsPagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 3;

    public StatisticsPagerAdapter(FragmentManager fm)
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
                fragment = new StatisticsFragStandings();
                break;
            case 1:
                fragment = new StatisticsFragGoalscorers();
                break;
            case 2:
                fragment = new StatisticsFragCards();
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
            case 0: return "Ljestvica";
            case 1: return "Strijelci";
            case 2: return "Kartoni";
        }
        return  null;
    }

    @Override
    public int getCount()
    {
        return NUM_PAGES;
    }
}
