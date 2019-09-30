package com.example.assignmenttest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignmenttest.R;
import com.example.assignmenttest.data.MyData;
import com.example.assignmenttest.viewholder.MyViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<MyData> dataList = new ArrayList<>();
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(dataList!= null)
        {
            holder.bindData(dataList.get(position));
        }
    }

    public void bindData(ArrayList<MyData> data){
        this.dataList = data;

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
