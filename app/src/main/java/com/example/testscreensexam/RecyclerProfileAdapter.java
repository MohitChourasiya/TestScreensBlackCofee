package com.example.testscreensexam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerProfileAdapter extends RecyclerView.Adapter<RecyclerProfileAdapter.holder> {


    ArrayList<String> profileHolder = new ArrayList<>();

    public RecyclerProfileAdapter(ArrayList<String> profileHolder){
        this.profileHolder=profileHolder;
    }
    @NonNull
    @Override
    public RecyclerProfileAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_profile,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerProfileAdapter.holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return profileHolder.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
