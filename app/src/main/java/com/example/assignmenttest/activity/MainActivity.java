package com.example.assignmenttest.activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.assignmenttest.R;
import com.example.assignmenttest.adapter.MyAdapter;
import com.example.assignmenttest.data.CurrencyResponse;
import com.example.assignmenttest.data.Rates;
import com.example.assignmenttest.data.model.CurrencyModel;
import com.example.assignmenttest.delegate.ItemTap;
import com.example.assignmenttest.network.ServiceImpl;

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

    private ServiceImpl service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        init();
        isFetch();
        setUpRecycler();

    }

    private void init() {
        model = CurrencyModel.getObjInstance();
        currencyResponses = new ArrayList<>();
        ratesList = new ArrayList<>();
        service = new ServiceImpl();
    }

    private void setUpRecycler() {
        adapter = new MyAdapter(this,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lll","onResume");
    }

    private void isFetch()
    {
        model.getData();
    }

    @Subscribe(sticky = true,threadMode = ThreadMode.MAIN)
    public void loadData(CurrencyResponse response) {
        adapter.bindData(setData(response.getRates()));


        CurrencyResponse stickyEvent = EventBus.getDefault().getStickyEvent(CurrencyResponse.class);
        if(stickyEvent != null)
        {
            EventBus.getDefault().removeStickyEvent(stickyEvent);
        }
    }

    private List<String> setData(Rates rateData) {
        List<String> list = new ArrayList<>();
        list.add(rateData.getCHF()+" CHF");
        list.add(rateData.getZAR()+" ZAR");
        list.add(rateData.getSAR()+" SAR");
        list.add(rateData.getINR()+" INR");
        list.add(rateData.getVND()+" VND");
        list.add(rateData.getCNY()+" CNY");
        list.add(rateData.getTHB()+" THB");
        list.add(rateData.getAUD()+" AUD");
        list.add(rateData.getKRW()+" KRW");
        list.add(rateData.getILS()+" ILS");
        list.add(rateData.getNPR()+" NPR");
        list.add(rateData.getJPY()+" JPY");
        list.add(rateData.getBDT()+" BDT");
        list.add(rateData.getGBP()+" GBP");
        list.add(rateData.getKHR()+" KHR");
        list.add( rateData.getIDR()+" IDR");
        list.add(rateData.getPHP()+" PHP");
        list.add(rateData.getKWD()+" KWD");
        list.add(rateData.getRUB()+" RUB");
        list.add(rateData.getHKD()+" HKD");
        list.add(rateData.getRSD()+" RSD");
        list.add(rateData.getEUR()+" EUR");
        list.add(rateData.getDKK()+" DKK");
        list.add(rateData.getUSD()+" USD");
        list.add(rateData.getMYR()+" MYR");
        list.add(rateData.getCAD()+" CAD");
        list.add(rateData.getNOK()+" NOK");
        list.add(rateData.getEGP()+" EGP");
        list.add(rateData.getSGD()+" SGD");
        list.add(rateData.getLKR()+" LKR");
        list.add(rateData.getCZK()+" CZK");
        list.add(rateData.getPKR()+" PKR");
        list.add(rateData.getLAK()+" LAK");
        list.add(rateData.getSEK()+" SEK");
        list.add(rateData.getKES()+" KES");
        list.add(rateData.getNZD()+" NZD");
        list.add(rateData.getBND()+" BND");
        list.add(rateData.getBRL()+" BRL");

        return list;
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
