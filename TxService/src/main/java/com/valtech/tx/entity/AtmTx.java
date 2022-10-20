package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atmTx")
public class AtmTx extends Tx{
	 private int atmNumber;
	 private String location;
	 
	 public AtmTx(){}
	 
	public AtmTx(float amount, boolean debit, LocalDateTime txTime, long accountId,int atmNumber, String location) {
		super(amount,debit,txTime,accountId);
		this.atmNumber = atmNumber;
		this.location = location;
	}

	public int getAtmNumber() {
		return atmNumber;
	}
	public void setAtmNumber(int atmNumber) {
		this.atmNumber = atmNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	 
}
