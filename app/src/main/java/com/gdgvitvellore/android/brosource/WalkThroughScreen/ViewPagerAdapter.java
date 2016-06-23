package com.gdgvitvellore.android.brosource.WalkThroughScreen;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Shuvam Ghosh on 6/23/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {


    private int NO_OF_PAGES=3;
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        if(position==0)
        {
            OnBoardingFragment1 fragment1 = new OnBoardingFragment1();
            return fragment1;
        }

        else if(position==1)
        {
            OnBoardingFragment2 fragment2 = new OnBoardingFragment2();
            return fragment2;
        }
        else
        {
            OnBoardingFragment3 fragment3 = new OnBoardingFragment3();
            return fragment3;
        }


    }


    @Override
    public int getCount() {
        return NO_OF_PAGES;
    }
}
