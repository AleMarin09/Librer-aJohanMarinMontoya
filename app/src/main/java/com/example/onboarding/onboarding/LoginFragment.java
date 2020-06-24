package com.example.onboarding.onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



import com.example.onboarding.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment
{
    private TextView textPrev, etPwd, etUsername;
    private ViewPager viewPager;
    private View view;


    public LoginFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        _addClickPrev();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textPrev = view.findViewById(R.id.textPrevLogin);
    }

    public void _addClickPrev()
    {

        textPrev.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(0);
            }
        });
    }
}
