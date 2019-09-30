package com.example.assignmenttest.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "rate")
public class Rate {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "CHF")
    private String cHF;

    @ColumnInfo(name = "SAR")
    private String sAR;

    @ColumnInfo(name = "ZAR")
    private String zAR;

    @ColumnInfo(name = "INR")
    private String iNR;

    @ColumnInfo(name = "VND")
    private String vND;

    @ColumnInfo(name = "CNY")
    private String cNY;

    @ColumnInfo(name = "THB")
    private String tHB;

    @ColumnInfo(name = "AUD")
    private String aUD;

    @ColumnInfo(name = "KRW")
    private String kRW;

    @ColumnInfo(name = "ILS")
    private String iLS;

    @ColumnInfo(name = "NPR")
    private String nPR;

    @ColumnInfo(name = "JPY")
    private String jPY;

    @ColumnInfo(name = "BDT")
    private String bDT;

    @ColumnInfo(name = "GBP")
    private String gBP;

    @ColumnInfo(name = "KHR")
    private String kHR;

    @ColumnInfo(name = "IDR")
    private String iDR;

    @ColumnInfo(name = "PHP")
    private String pHP;

    @ColumnInfo(name = "KWD")
    private String kWD;

    @ColumnInfo(name = "RUB")
    private String rUB;

    @ColumnInfo(name = "HKD")
    private String hKD;

    @ColumnInfo(name = "RSD")
    private String rSD;

    @ColumnInfo(name = "EUR")
    private String eUR;

    @ColumnInfo(name = "DKK")
    private String dKK;

    @ColumnInfo(name = "USD")
    private String uSD;

    @ColumnInfo(name = "MYR")
    private String mYR;

    @ColumnInfo(name = "CAD")
    private String cAD;

    @ColumnInfo(name = "NOK")
    private String nOK;

    @ColumnInfo(name = "EGP")
    private String eGP;

    @ColumnInfo(name = "SGD")
    private String sGD;

    @ColumnInfo(name = "LKR")
    private String lKR;

    @ColumnInfo(name = "CZK")
    private String cZK;

    @ColumnInfo(name = "PKR")
    private String pKR;

    @ColumnInfo(name = "LAK")
    private String lAK;

    @ColumnInfo(name = "SEK")
    private String sEK;

    @ColumnInfo(name = "KES")
    private String kES;

    @ColumnInfo(name = "NZD")
    private String nZD;

    @ColumnInfo(name = "BND")
    private String bND;

    @ColumnInfo(name = "BRL")
    private String bRL;


}
