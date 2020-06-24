package com.e.mylibreryjohanmarinmontoya.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.e.mylibreryjohanmarinmontoya.onboarding.FaceDetectionFragment;
import com.e.mylibreryjohanmarinmontoya.onboarding.LoginFragment;
import com.e.mylibreryjohanmarinmontoya.onboarding.TextRecognitionFragment;
import com.e.mylibreryjohanmarinmontoya.onboarding.WelcomeFragment;


public class OnboardingAdapter extends FragmentPagerAdapter {

   /*constructor*/
    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WelcomeFragment();
            case 1:
                return new TextRecognitionFragment();
            case 2:
                return new FaceDetectionFragment();
            case 3:
                return new LoginFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
