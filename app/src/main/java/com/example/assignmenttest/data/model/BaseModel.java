package com.example.assignmenttest.data.model;

import com.example.assignmenttest.network.DataAgent;
import com.example.assignmenttest.network.ServiceImpl;

public class BaseModel {
    protected DataAgent mDataAgent;

    protected BaseModel() {
        mDataAgent = new ServiceImpl();
    }

}
