package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("transferTx")
public class TransferTx extends Tx{
	 private int fromAcc;
	 private int toAcc;
	 public TransferTx(){}
	public TransferTx(float amount, boolean debit, LocalDateTime txTime, long accountId,int fromAcc, int toAcc) {
		super(amount,debit,txTime,accountId);
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
	}
	public int getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(int fromAcc) {
		this.fromAcc = fromAcc;
	}
	public int getToAcc() {
		return toAcc;
	}
	public void setToAcc(int toAcc) {
		this.toAcc = toAcc;
	}
	
	 
}
