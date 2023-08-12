package com.example.testscreensexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;

import com.example.testscreensexam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        init_UI();
    }

    private void init_UI() {

        binding.personalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.personalCardsmall.getVisibility()==View.VISIBLE);

                binding.personalCardsmall.setVisibility(View.GONE);
                binding.personalBigLayout.setVisibility(View.VISIBLE);

                binding.suitcaseCardLayout.setVisibility(View.VISIBLE);
                binding.suitcaseBigLayout.setVisibility(View.GONE);

                binding.merchantCardLayout.setVisibility(View.VISIBLE);
                binding.merchantBigLayout.setVisibility(View.GONE);
            }
        });

        binding.personConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ExplorerActivity.class));
            }
        });


        binding.merchantMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.merchantCardLayout.getVisibility()==View.VISIBLE);

                binding.merchantCardLayout.setVisibility(View.GONE);
                binding.merchantBigLayout.setVisibility(View.VISIBLE);

                binding.personalBigLayout.setVisibility(View.GONE);
                binding.personalCardsmall.setVisibility(View.VISIBLE);

                binding.suitcaseCardLayout.setVisibility(View.VISIBLE);
                binding.suitcaseBigLayout.setVisibility(View.GONE);
            }
        });

        binding.merchantConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ExplorerActivity.class));
            }
        });



        binding.suitcaseMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.suitcaseCardLayout.getVisibility()==View.VISIBLE);

                binding.suitcaseCardLayout.setVisibility(View.GONE);
                binding.suitcaseBigLayout.setVisibility(View.VISIBLE);
                binding.merchantBigLayout.setVisibility(View.GONE);
                binding.merchantCardLayout.setVisibility(View.VISIBLE);
                binding.personalBigLayout.setVisibility(View.GONE);
                binding.personalCardsmall.setVisibility(View.VISIBLE);
            }
        });

        binding.suitcaseConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ExplorerActivity.class));
            }
        });


    }
}