package com.java.unit1;

import java.util.Date;

public class Transaction {
	private long transId;
	private Account fromAcc;
	private Account toAcc;
	private Date createDate;
	private Date upDate;
	private double cash;
	
	public Transaction(long transId, Account fromAcc, Account toAcc,
			Date createDate, Date upDate, double cash) {
		super();
		this.transId = transId;
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.createDate = createDate;
		this.upDate = upDate;
		this.cash = cash;
	}
	public long getTransId() {
		return transId;
	}
	public void setTransId(long transId) {
		this.transId = transId;
	}
	public Account getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(Account fromAcc) {
		this.fromAcc = fromAcc;
	}
	public Account getToAcc() {
		return toAcc;
	}
	public void setToAcc(Account toAcc) {
		this.toAcc = toAcc;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpDate() {
		return upDate;
	}
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public String toString() {
		return "\nTransaction [transId=" + transId + ", fromAcc=" + fromAcc
				+ ", toAcc=" + toAcc + ", createDate=" + createDate
				+ ", upDate=" + upDate + ", cash=" + cash + "]";
	}
}
