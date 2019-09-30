package com.example.assignmenttest.data.model;

public class CurrencyModel extends BaseModel {
    private static CurrencyModel objInstance;

    private CurrencyModel(){

    }
    public static CurrencyModel getObjInstance(){
        if(objInstance == null)
        {
            objInstance = new CurrencyModel();
        }
        return objInstance;
    }

    public void getData(){
        mDataAgent.getData();
    }
}
