package com.java.unit1;

import java.text.SimpleDateFormat;


public class Banking {
	public static void main(String[] args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd"); 
        
        
		Account fromAcc = new Account();
		fromAcc.setAccNo(1);
		fromAcc.setAccType("savings");
		fromAcc.setDob(formatter.parse("2001/05/26") );
		fromAcc.setFirstName("Pavan");
		fromAcc.setLastName("Varanasi");
		
		Account toAcc = new Account();
		toAcc.setAccNo(420);
		toAcc.setAccType("debit");
		toAcc.setDob(formatter.parse("1983/01/11"));
		toAcc.setFirstName("Chandu");
		toAcc.setLastName("Varanasi");
		
		
		Transaction tx = new Transaction();
		tx.setTransId(123);
		tx.setCreateDate(formatter.parse("2020/02/01"));
		tx.setFromAcc(fromAcc);
		tx.setToAcc(toAcc);
		tx.setUpDate(formatter.parse("2019/04/11"));
		tx.setCash(200000);
		
		System.out.println(tx);
		
	}

}
