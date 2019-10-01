package com.example.assignmenttest.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "rate")
public class RatesData {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo (name = "id")
    int id;

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

    @ColumnInfo(name="BRL")
    private String bRL;

    public int getId() {
        return id;
    }

    public String getCHF() {
        return cHF;
    }

    public String getSAR() {
        return sAR;
    }

    public String getZAR() {
        return zAR;
    }

    public String getINR() {
        return iNR;
    }

    public String getVND() {
        return vND;
    }

    public String getCNY() {
        return cNY;
    }

    public String getTHB() {
        return tHB;
    }

    public String getAUD() {
        return aUD;
    }

    public String getKRW() {
        return kRW;
    }

    public String getILS() {
        return iLS;
    }

    public String getMPR() {
        return nPR;
    }

    public String getJPY() {
        return jPY;
    }

    public String geBDT() {
        return bDT;
    }

    public String getGBP() {
        return gBP;
    }

    public String getKHR() {
        return kHR;
    }

    public String getIDR() {
        return iDR;
    }

    public String getPHP() {
        return pHP;
    }

    public String getKWD() {
        return kWD;
    }

    public String getRUB() {
        return rUB;
    }

    public String getHKD() {
        return hKD;
    }

    public String getRSD() {
        return rSD;
    }

    public String getEUR() {
        return eUR;
    }

    public String getDKK() {
        return dKK;
    }

    public String getUSD() {
        return uSD;
    }

    public String getMYR() {
        return mYR;
    }

    public String getCAD() {
        return cAD;
    }

    public String getNOK() {
        return nOK;
    }

    public String getEGP() {
        return eGP;
    }

    public String getSGD() {
        return sGD;
    }

    public String getLKR() {
        return lKR;
    }

    public String getCZK() {
        return cZK;
    }

    public String getPKR() {
        return pKR;
    }

    public String getLAK() {
        return lAK;
    }

    public String getSEK() {
        return sEK;
    }

    public String getKES() {
        return kES;
    }

    public String getNZD() {
        return nZD;
    }

    public String getBND() {
        return bND;
    }

    public String getBRL() {
        return bRL;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setcHF(String cHF) {
        this.cHF = cHF;
    }

    public void setsAR(String sAR) {
        this.sAR = sAR;
    }

    public void setzAR(String zAR) {
        this.zAR = zAR;
    }

    public void setiNR(String iNR) {
        this.iNR = iNR;
    }

    public void setvND(String vND) {
        this.vND = vND;
    }

    public void setcNY(String cNY) {
        this.cNY = cNY;
    }

    public void settHB(String tHB) {
        this.tHB = tHB;
    }

    public void setaUD(String aUD) {
        this.aUD = aUD;
    }

    public void setkRW(String kRW) {
        this.kRW = kRW;
    }

    public void setiLS(String iLS) {
        this.iLS = iLS;
    }

    public void setnPR(String nPR) {
        this.nPR = nPR;
    }

    public void setjPY(String jPY) {
        this.jPY = jPY;
    }

    public void setbDT(String bDT) {
        this.bDT = bDT;
    }

    public void setgBP(String gBP) {
        this.gBP = gBP;
    }

    public void setkHR(String kHR) {
        this.kHR = kHR;
    }

    public void setiDR(String iDR) {
        this.iDR = iDR;
    }

    public void setpHP(String pHP) {
        this.pHP = pHP;
    }

    public void setkWD(String kWD) {
        this.kWD = kWD;
    }

    public void setrUB(String rUB) {
        this.rUB = rUB;
    }

    public void sethKD(String hKD) {
        this.hKD = hKD;
    }

    public void setrSD(String rSD) {
        this.rSD = rSD;
    }

    public void seteUR(String eUR) {
        this.eUR = eUR;
    }

    public void setdKK(String dKK) {
        this.dKK = dKK;
    }

    public void setuSD(String uSD) {
        this.uSD = uSD;
    }

    public void setmYR(String mYR) {
        this.mYR = mYR;
    }

    public void setcAD(String cAD) {
        this.cAD = cAD;
    }

    public void setnOK(String nOK) {
        this.nOK = nOK;
    }

    public void seteGP(String eGP) {
        this.eGP = eGP;
    }

    public void setsGD(String sGD) {
        this.sGD = sGD;
    }

    public void setlKR(String lKR) {
        this.lKR = lKR;
    }

    public void setcZK(String cZK) {
        this.cZK = cZK;
    }

    public void setpKR(String pKR) {
        this.pKR = pKR;
    }

    public void setlAK(String lAK) {
        this.lAK = lAK;
    }

    public void setsEK(String sEK) {
        this.sEK = sEK;
    }

    public void setkES(String kES) {
        this.kES = kES;
    }

    public void setnZD(String nZD) {
        this.nZD = nZD;
    }

    public void setbND(String bND) {
        this.bND = bND;
    }

    public void setbRL(String bRL) {
        this.bRL = bRL;
    }
    
}
