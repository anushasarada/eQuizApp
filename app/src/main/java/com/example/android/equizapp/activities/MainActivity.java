package com.example.android.equizapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.equizapp.adapters.MainTabsAdapter;
import com.example.android.equizapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sarada on 5/16/2018.
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabLayoutId)
    TabLayout tabLayout;
    @BindView(R.id.viewPagerId)
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tabLayout.addTab(tabLayout.newTab().setText("Quiz List"));
        tabLayout.addTab(tabLayout.newTab().setText("Social"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        MainTabsAdapter mainTabsAdapter = new MainTabsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(mainTabsAdapter);

        viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(Tab tab) {

            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });
    }
}
