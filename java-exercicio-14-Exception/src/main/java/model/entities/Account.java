package model.entities;

import model.exception.DomainException;

public class Account {

	private Integer accNumber;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer accNumber, String holder, Double balance, Double withdrawLimit) {
		this.accNumber = accNumber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(Integer accNumber) {
		this.accNumber = accNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount){
		this.balance += amount;
	}

	public void withdraw(Double amount) throws DomainException{
		if(withdrawLimit < amount){
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount > balance){
			throw new DomainException("Not enough balance");
		}
		this.balance -= amount;
	}

}
