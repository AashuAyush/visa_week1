package com.visa.prj.entity;
/**
 * This is an entity class to represent account business data
 * 
 * @author aaaashut
 * @version 1.0
 *
 */
public class Account {
	private double balance; // state of object [ instance variable ]
	private String accNo;
	private static int count; //state of class [one per class]
	
	public Account(String no) {
		count++;
		this.accNo = no;
	}
	@Override
	public boolean equals(Object obj) {
		Account other = (Account) obj;
		return this.accNo.equals(other.accNo);
	}

	/**
	 * method to credit amount into account
	 * 
	 * @param amt amount to be credited
	 * 
	 */
	public void deposit(double amt) { //deposit (Account this, double amt)
		this.balance += amt; // this.balance += amt; balance not a local variable
	}
	
	/**
	 * gives the status of current balance
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public String getAccno() {
		return accNo;
	}
	
	public static int getCount() {
		return count;
	}
}
