package com.example.testscreensexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.example.testscreensexam.databinding.ActivityExplorerBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ExplorerActivity extends AppCompatActivity {
 ActivityExplorerBinding binding;
    TabLayout tabLayout;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityExplorerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.refineTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ited = new Intent(ExplorerActivity.this,Refine.class);
                startActivity(ited);
            }
        });

        binding.refineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ExplorerActivity.this,Refine.class);
                startActivity(in);
            }
        });


        tabLayout=findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Personal"));
        tabLayout.addTab(tabLayout.newTab().setText("Merchant"));
        tabLayout.addTab(tabLayout.newTab().setText("Business"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        adapter=new ViewPagerAdapter(ExplorerActivity.this);
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        binding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                binding.tabLayout.getTabAt(position).select();
            }
        });




    }
}