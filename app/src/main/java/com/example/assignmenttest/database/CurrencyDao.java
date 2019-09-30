package com.example.assignmenttest.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CurrencyDao {

    @Query("select * from rate")
    List<Rate> getAllRates();

    @Insert
    void insertData(Rate rate);

}
