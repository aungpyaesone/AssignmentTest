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
import com.example.assignmenttest.database.AppDatabase;
import com.example.assignmenttest.database.RatesData;
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
    private Rates rateData;
    private RatesData data;
    private MyAdapter adapter;
    private CurrencyModel model;
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
       // ratesList = new ArrayList<>();
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
       // adapter.bindData(setData(response.getRates()));
        rateData = response.getRates();
        data = new RatesData();
        data.setcHF(rateData.getCHF());
        data.setzAR(rateData.getZAR());
        data.setsAR(rateData.getSAR());
        data.setiNR(rateData.getINR());
        data.setvND(rateData.getVND());
        data.setcNY(rateData.getCNY());
        data.settHB(rateData.getTHB());
        data.setaUD(rateData.getAUD());
        data.setkRW(rateData.getKRW());
        data.setiLS(rateData.getILS());
        data.setnPR(rateData.getNPR());
        data.setjPY(rateData.getJPY());
        data.setbDT(rateData.getBDT());
        data.setgBP(rateData.getGBP());
        data.setkHR(rateData.getKHR());
        data.setiDR( rateData.getIDR());
        data.setpHP(rateData.getPHP());
        data.setkRW(rateData.getKRW());
        data.setrUB(rateData.getRUB());
        data.sethKD(rateData.getHKD());
        data.setrSD(rateData.getRSD());
        data.seteUR(rateData.getEUR());
        data.setdKK(rateData.getDKK());
        data.setuSD(rateData.getUSD());
        data.setmYR(rateData.getMYR());
        data.setcAD(rateData.getCAD());
        data.setnOK(rateData.getNOK());
        data.seteGP(rateData.getEGP());
        data.setsGD(rateData.getSGD());
        data.setlKR(rateData.getLKR());
        data.setcZK(rateData.getCZK());
        data.setpKR(rateData.getPKR());
        data.setlAK(rateData.getLAK());
        data.setsEK(rateData.getSEK());
        data.setkES(rateData.getKES());
        data.setnZD(rateData.getNZD());
        data.setbND(rateData.getBND());
        data.setbRL(rateData.getBRL());

        AppDatabase.getInstance(this).rateDao().insertRate(rateData);

        RatesData rateList = AppDatabase.getInstance(this).rateDao().getAllRateData();
        adapter.bindData(setData(rateList));


        CurrencyResponse stickyEvent = EventBus.getDefault().getStickyEvent(CurrencyResponse.class);
        if(stickyEvent != null)
        {
            EventBus.getDefault().removeStickyEvent(stickyEvent);
        }
    }

    private List<String> setData(RatesData rateData) {
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
        list.add(rateData.getMPR()+" MPR");
        list.add(rateData.getJPY()+" JPY");
      //  list.add(rateData.getBDT()+" BDT");
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
        Toast.makeText(this,rateData.getAUD(), Toast.LENGTH_SHORT).show();
    }
}
