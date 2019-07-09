package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("SB1");
		Account sec = new Account("SB2");
		
		first.deposit(5000); //deposit(first, 5000) first is the context
		sec.deposit(2500); //deposit (sec, 2500) 
		
		System.out.println("first account");
		System.out.println("Balance : "+ first.getBalance());
		
		System.out.println("second account");
		System.out.println("Balance : "+ sec.getBalance());
		
		System.out.println("*************");
		
		Account rahul= new Account ("SB100");
		Account sweta = new Account ("SB100");
		
		Account ref = rahul;
		
		if (ref==rahul) {
			System.out.println("ref and Rahul point to same location");
		}
		if (rahul.equals(sweta) ) {
			System.out.println("Same content");
		}
		System.out.println("Count : " + Account.getCount());
		
	}
}
