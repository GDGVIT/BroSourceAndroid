package com.gdgvitvellore.android.brosource.WalkThroughScreen;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.gdgvitvellore.android.brosource.R;

/**
 * Created by Shuvam Ghosh on 6/23/2016.
 */

public class OnBoarding extends AppCompatActivity {


    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private ImageView iv1,iv2,iv3;
    private Button login, signUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_activity);

        init();
        setInit();
        setData();
    }

    private void init() {

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        iv1=(ImageView)findViewById(R.id.white_indicator1);
        iv2=(ImageView)findViewById(R.id.white_indicator2);
        iv3=(ImageView)findViewById(R.id.white_indicator3);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        login = (Button) findViewById(R.id.login_button);
        signUp = (Button) findViewById(R.id.sign_up_button);
    }

    private void setInit() {

        viewPager.setAdapter(adapter);
        iv1.setImageResource(R.drawable.green_indicator);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                if(position==0)
                {
                    iv1.setImageResource(R.drawable.green_indicator);
                    iv2.setImageResource(R.drawable.white_indicator);
                    iv3.setImageResource(R.drawable.white_indicator);
                }
                else if(position==1)
                {

                    iv2.setImageResource(R.drawable.green_indicator);
                    iv1.setImageResource(R.drawable.white_indicator);
                    iv3.setImageResource(R.drawable.white_indicator);
                }
                else
                {
                    iv3.setImageResource(R.drawable.green_indicator);
                    iv1.setImageResource(R.drawable.white_indicator);
                    iv2.setImageResource(R.drawable.white_indicator);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


    }
    private void setData() {
    }

    //Pager Adapter inner Class

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
}
