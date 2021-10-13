package com.lab;

public class CreditCard {
	private String accountName;
	private long accountNumber;
	private String cardType="master";
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(String accountName, long accountNumber, String cardType) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.cardType = cardType;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CreditCard [accountName=" + accountName + ", accountNumber=" + accountNumber + ", cardType=" + cardType
				+ "]";
	}
	

}
