package com.example.assignmenttest.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.assignmenttest.data.Rates;

import java.util.List;

@Dao
public interface RateDao {
    @Query("select * from rate")
    RatesData getAllRateData();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRate(Rates rateData);
}
