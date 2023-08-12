package com.example.testscreensexam;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testscreensexam.databinding.FragmentPersonalBinding;

import java.util.ArrayList;


public class PersonalFragment extends Fragment {


   FragmentPersonalBinding binding;



    @Nullable
    @Override
    public View onCreateView( @Nullable LayoutInflater inflater,@Nullable ViewGroup container,
                              @Nullable  Bundle savedInstanceState) {

        binding =FragmentPersonalBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        init_UI();
        return view;
    }

    private void init_UI() {

        ArrayList<String> profileHolder = new ArrayList<>();
        profileHolder.add("1");
        profileHolder.add("1");
        profileHolder.add("1");
        profileHolder.add("1");
        profileHolder.add("1");
        profileHolder.add("1");

        profileHolder.add("1");

        binding.recyclerP.setAdapter(new RecyclerProfileAdapter((ArrayList<String>) profileHolder));



    }
}