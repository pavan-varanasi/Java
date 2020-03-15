package com.java.unit1;

import java.text.SimpleDateFormat;


public class Banking {
	public static void main(String[] args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd"); 
        
        
		Account fromAcc = new Account(1,"Savings", "pavan", "varanasi",  formatter.parse("2001/05/26"));	
		Account toAcc = new Account(420,"Dbit", "chandu","Varanasi", formatter.parse("1983/01/11"));	
		
		Transaction tx = new Transaction(123, fromAcc, toAcc, formatter.parse("2020/02/01"), formatter.parse("2019/04/11"), 200000);
		System.out.println(tx);
		
	}

}
