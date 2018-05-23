package com.example.android.equizapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.equizapp.Fragments.QuizTypeListFragment;
import com.example.android.equizapp.Fragments.SocialFragment;

public class MainTabsAdapter extends FragmentStatePagerAdapter {

    int numOfTabs;

    public MainTabsAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        numOfTabs = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return(new QuizTypeListFragment());

            case 1:
                return(new SocialFragment());

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
