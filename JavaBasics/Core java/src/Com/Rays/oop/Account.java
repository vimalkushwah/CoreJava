package com.rays.oop;

public class Account {
	private String no = null;
	private String Account = null;
	private Double bal = 0.00;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public Double getBal() {
		return bal;
	}
	public void setBal(Double bal) {
		this.bal = bal;
	}
	public void deposit(double i) {
	double d= getBal();
	d+=i;
		setBal(d);
	}
	public void withdraw(double w) {
		double d= getBal();
		d-=w;
		setBal(d);
	}
	public void fundTransfer(double ft) {
		double d=getBal();
		d-=ft;
		setBal(d);
	}
	public void payBil(double pb) {
		double d=getBal();
		d-=pb;
		setBal(d);
	}

	}
