package com.example.testscreensexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.testscreensexam.databinding.ActivityRefineBinding;
import com.google.android.material.slider.Slider;

public class Refine extends AppCompatActivity {

    ActivityRefineBinding binding;
    int i = 0;
    int b,c,d,e,f,g,h = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRefineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init_UI();
    }

    private void init_UI() {




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_items, // Array resource containing your items
                android.R.layout.simple_spinner_item


        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.spinner.setAdapter(adapter);

        // Set a listener to handle item selection
        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        binding.slider1.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                binding.km.setText(  value + "Km");
            }
        });

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Refine.this,ExplorerActivity.class));
            }
        });

        binding.swimCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i==1){

                    binding.swimTxt.setTextColor(getResources().getColor(R.color.netcalf));
                    binding.swimCard.setCardBackgroundColor(getResources().getColor(R.color.white));
                    i=0;

                }else{i=1;

                    binding.swimTxt.setTextColor(getResources().getColor(R.color.white));
                    binding.swimCard.setCardBackgroundColor(getResources().getColor(R.color.netcalf));
                }

            }
        });
        binding.photoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b==1){
                    binding.phototxt.setTextColor(getResources().getColor(R.color.netcalf));
                    binding.photoCard.setCardBackgroundColor(getResources().getColor(R.color.white));
                    b=0;
                }else{
                    b=1;

                    binding.phototxt.setTextColor(getResources().getColor(R.color.white));
                    binding.photoCard.setCardBackgroundColor(getResources().getColor(R.color.netcalf));
                }

            }
        });

        binding.shopCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c==1){

                    binding.shopTxt.setTextColor(getResources().getColor(R.color.netcalf));
                    binding.shopCard.setCardBackgroundColor(getResources().getColor(R.color.white));
                    c=0;
                }else{
                    c=1;

                    binding.shopTxt.setTextColor(getResources().getColor(R.color.white));
                    binding.shopCard.setCardBackgroundColor(getResources().getColor(R.color.netcalf));
                }

            }
        });
        binding.musicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d==1){

                    binding.musicTxt.setTextColor(getResources().getColor(R.color.netcalf));
                    binding.musicCard.setCardBackgroundColor(getResources().getColor(R.color.white));
                    d=0;

                }else{
                    d=1;

                    binding.musicTxt.setTextColor(getResources().getColor(R.color.white));
                    binding.musicCard.setCardBackgroundColor(getResources().getColor(R.color.netcalf));
                }
                i++;
            }
        });
        binding.yogaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e==1){
                    binding.yogaTxt.setTextColor(getColor(R.color.netcalf));
                    binding.yogaCard.setCardBackgroundColor(getColor(R.color.white));

                    e=0;
                }else{e=1;

                    binding.yogaTxt.setTextColor(getColor(R.color.white));
                    binding.yogaCard.setCardBackgroundColor(getColor(R.color.netcalf));
                }
                i++;
            }
        });
        binding.cookCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f==1){

                    binding.cookTxt.setTextColor(getResources().getColor(R.color.netcalf));
                    binding.cookCard.setCardBackgroundColor(getResources().getColor(R.color.white));
                    f=0;
                }else{f=1;

                    binding.cookTxt.setTextColor(getResources().getColor(R.color.white));
                    binding.cookCard.setCardBackgroundColor(getResources().getColor(R.color.netcalf));
                }
                i++;
            }
        });
        binding.Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (g==1){

                    binding.tennishTxt.setTextColor(getResources().getColor(R.color.netcalf));
                    binding.Card.setCardBackgroundColor(getResources().getColor(R.color.white));
                    g=0;
                }else{g=1;



                    binding.tennishTxt.setTextColor(getResources().getColor(R.color.white));
                    binding.Card.setCardBackgroundColor(getResources().getColor(R.color.netcalf));
                }

            }
        });
        binding.runCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (h==1){
                    binding.runTxt.setTextColor(getResources().getColor(R.color.black));
                    binding.runCard.setCardBackgroundColor(getResources().getColor(R.color.white));

                    h=0;
                }else{

                    h=1;
                    binding.runTxt.setTextColor(getResources().getColor(R.color.white));
                    binding.runCard.setCardBackgroundColor(getResources().getColor(R.color.netcalf));

                }
                i++;
            }
        });
    }
}