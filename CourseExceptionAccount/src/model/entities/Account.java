package model.entities;

import model.exception.BusinessException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		validateWithdraw(value);
		balance -= value;
	}
	
	public void validateWithdraw(double value) {
		if ( value > getBalance() ) {
			throw new BusinessException("Não é possivel sacar um valor maior que o saldo da conta.");
		}
		if ( value > getWithdrawLimit() ) {
			throw new BusinessException("Não é possivel sacar um valor maior que o limite de saque.");
		}
	}
}
