package com.example.assignmenttest.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignmenttest.R;
import com.example.assignmenttest.activity.MainActivity;
import com.example.assignmenttest.data.Rates;
import com.example.assignmenttest.database.RatesData;
import com.example.assignmenttest.delegate.ItemTap;
import com.example.assignmenttest.viewholder.MyViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<String> dataList;
     Context context;
     ItemTap delegate;

    public MyAdapter(Context context, MainActivity delegate) {
        this.context = context;
        this.delegate = delegate;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewHolder(v,delegate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(dataList!= null)
        {
            holder.bindData( dataList.get(position));
        }
    }

    public void bindData(List<String> data){
        this.dataList = data;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        if(dataList!= null){
            return dataList.size();
        }
        return 5;

    }
}
