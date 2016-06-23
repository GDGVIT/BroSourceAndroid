package com.gdgvitvellore.android.brosource.WalkThroughScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
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


    ViewPager viewPager;
    ViewPagerAdapter adapter;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv1g;
    ImageView iv2g;
    ImageView iv3g;
    Button login, signUp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_activity);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        iv1=(ImageView)findViewById(R.id.white_indicator1);
        iv2=(ImageView)findViewById(R.id.white_indicator2);
        iv3=(ImageView)findViewById(R.id.white_indicator3);
        iv1g=(ImageView)findViewById(R.id.green_indicator1);
        iv2g=(ImageView)findViewById(R.id.green_indicator2);
        iv3g=(ImageView)findViewById(R.id.green_indicator3);

        iv1.setVisibility(View.INVISIBLE);
        iv1g.setVisibility(View.VISIBLE);
        iv2g.setVisibility(View.INVISIBLE);
        iv3g.setVisibility(View.INVISIBLE);

        login = (Button) findViewById(R.id.login_button);
        signUp = (Button) findViewById(R.id.sign_up_button);

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
                    iv1g.setVisibility(View.VISIBLE);
                    iv2g.setVisibility(View.INVISIBLE);
                    iv3g.setVisibility(View.INVISIBLE);
                }
                else if(position==1)
                {
                    iv1.setVisibility(View.VISIBLE);
                    iv1g.setVisibility(View.INVISIBLE);
                    iv2g.setVisibility(View.VISIBLE);
                    iv3g.setVisibility(View.INVISIBLE);
                }
                else
                {
                    iv3g.setVisibility(View.VISIBLE);
                    iv2g.setVisibility(View.INVISIBLE);
                    iv1g.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
