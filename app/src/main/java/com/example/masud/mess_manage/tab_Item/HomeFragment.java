package com.example.masud.mess_manage.tab_Item;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.masud.mess_manage.adapter.ViewPagerAdapter;
import com.example.masud.mess_manage.R;

public class HomeFragment extends Fragment{

   // private RecyclerView recyclerview;

    private Context context;
    public static final String TITLE = "CATEGORY";
    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private ViewPagerAdapter mViewPagerAdapter;
    private TabLayout mTabLayout;
    private View view;

    private int postions;
    private int pstion = 0;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

         view = inflater.inflate(R.layout.fragment_home, container, false);

        setViewPager();
        return view;
    }
    private void setViewPager() {
        mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
        mViewPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        //String id = "5";
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout = (TabLayout) view.findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setCurrentItem(pstion);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(tabListener);
    }

    TabLayout.OnTabSelectedListener tabListener = new TabLayout.OnTabSelectedListener() {

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            mViewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getPosition();

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getPosition();
        }
    };


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
    }

}