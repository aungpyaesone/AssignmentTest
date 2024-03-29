package com.example.assignmenttest.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class CurrencyResponse implements Serializable {

	@SerializedName("rates")
	private Rates rates;

	@SerializedName("description")
	private String description;

	@SerializedName("info")
	private String info;

	@SerializedName("timestamp")
	private String timestamp;

    public CurrencyResponse(Rates rates, String description, String timestamp) {
        this.rates = rates;
        this.description = description;
        this.timestamp = timestamp;
    }

    public void setRates(Rates rates){
		this.rates = rates;
	}

	public Rates getRates(){
		return rates;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return info;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"CurrencyResponse{" + 
			"rates = '" + rates + '\'' + 
			",description = '" + description + '\'' + 
			",info = '" + info + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}