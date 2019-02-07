package com.example.masud.mess_manage.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.masud.mess_manage.tab_Item.ReleaseFragment2;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 12;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ReleaseFragment2.newInstance();
            case 1:
                return ReleaseFragment2.newInstance();
            case 2:
                return ReleaseFragment2.newInstance();
            case 3:
                return ReleaseFragment2.newInstance();
            case 4:
                return ReleaseFragment2.newInstance();
            case 5:
                return ReleaseFragment2.newInstance();
            case 6:
                return ReleaseFragment2.newInstance();
            case 7:
                return ReleaseFragment2.newInstance();
            case 8:
                return ReleaseFragment2.newInstance();
            case 9:
                return ReleaseFragment2.newInstance();
            case 10:
                return ReleaseFragment2.newInstance();
            case 11:
                return ReleaseFragment2.newInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Jan";
            case 1:
                return "Fab";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "Sep";
            case 9:
                return "Oct";
            case 10:
                return "Nov";
            case 11:
                return "Dec";
        }
        return super.getPageTitle(position);
    }



}
