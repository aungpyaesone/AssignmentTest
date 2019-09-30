package com.example.assignmenttest.activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.assignmenttest.R;
import com.example.assignmenttest.adapter.MyAdapter;
import com.example.assignmenttest.data.CurrencyResponse;
import com.example.assignmenttest.data.Rates;
import com.example.assignmenttest.data.model.CurrencyModel;
import com.example.assignmenttest.delegate.ItemTap;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements ItemTap {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    private List<CurrencyResponse> currencyResponses;
    private List<Rates>  ratesList;
    private MyAdapter adapter;
    private CurrencyModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        init();
        setUpRecycler();
    }

    private void init() {
        model = CurrencyModel.getObjInstance();
        currencyResponses = new ArrayList<>();
        ratesList = new ArrayList<>();
    }

    private void setUpRecycler() {
        adapter = new MyAdapter(this,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onResume() {
        currencyResponses.clear();
        isFetch();
        super.onResume();
    }

    private void isFetch() {
        model.getData();
    }

    @Subscribe(sticky = true,threadMode = ThreadMode.MAIN)
    public void loadData(CurrencyResponse response) {
        ratesList.clear();
        ratesList.addAll(response.getRates());
        Log.d("data",ratesList.size()+"");
        adapter.bindData(ratesList);


        CurrencyResponse stickyEvent = EventBus.getDefault().getStickyEvent(CurrencyResponse.class);
        if(stickyEvent != null)
        {
            EventBus.getDefault().removeStickyEvent(stickyEvent);
        }
    }
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onErrorLoadedEvent(String message) {
        String stickyEvent = EventBus.getDefault().getStickyEvent(String.class);
        if (stickyEvent != null) {
            EventBus.getDefault().removeStickyEvent(stickyEvent);
        }
    }

    @Override
    public void touchItem(Rates rateData,int position) {
        Toast.makeText(this, rateData.getAUD(), Toast.LENGTH_SHORT).show();
    }
}
