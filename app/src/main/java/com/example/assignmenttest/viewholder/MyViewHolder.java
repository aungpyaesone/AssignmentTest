package com.example.assignmenttest.viewholder;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignmenttest.R;
import com.example.assignmenttest.data.Rates;
import com.example.assignmenttest.database.RatesData;
import com.example.assignmenttest.delegate.ItemTap;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_rate)
    TextView tvRate;

    @BindView(R.id.tv_value)
    TextView tvValue;

    private ItemTap delegate;
    public MyViewHolder(@NonNull View itemView, ItemTap delegate) {
        super(itemView);
        this.delegate = delegate;
        ButterKnife.bind(this,itemView);
    }

    public void bindData(String str){
     tvValue.setText(str);

    }
}
