package com.example.mahesworfragmentapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mahesworfragmentapplication.adapter.ViewPageAdapter;
import com.example.mahesworfragmentapplication.fragment.LoginFragment;
import com.example.mahesworfragmentapplication.fragment.RegisterFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = findViewById(R.id.viewactivity);
        tabLayout = findViewById(R.id.tabid);

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapter.addFragment(new LoginFragment(), "Login");
        viewPageAdapter.addFragment(new RegisterFragment(), "Register");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
