package com.rays.bank;

public class BankBean {
    private int id;
    private long accountno;
    private String holdername;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	private double balance;
    private String branch;
    
       
}
 	