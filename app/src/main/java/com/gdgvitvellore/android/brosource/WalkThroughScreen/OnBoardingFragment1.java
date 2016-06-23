package com.gdgvitvellore.android.brosource.WalkThroughScreen;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gdgvitvellore.android.brosource.R;

/**
 * Created by Shuvam Ghosh on 6/23/2016.
 */

public class OnBoardingFragment1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView;
        rootView=inflater.inflate(R.layout.onboarding_screen1,container,false);
        return rootView;
    }


}
