package com.rays.bank;

import java.sql.SQLException;

public class TestBank {
 
  public static void main(String[] args) throws SQLException {
         
	    //testcreate();
       //testinsert();
	  //testupdate();
	 //testdelete();
	  findbypk();
  }

  private static void findbypk() throws SQLException {
	  BankModule b = new BankModule();
      BankBean k = new BankBean ();
        k.setId(1);
        b.Search(k);
        System.out.println(k.getAccountno());
        System.out.println(k.getBalance());
        System.out.println(k.getBranch());
        System.out.println(k.getHoldername());
        System.out.println(k.getId());
        
    }

private static void testdelete()throws SQLException {
        BankModule b = new BankModule();
        BankBean k = new BankBean ();
 
          k.setId(6);
        b.delete(k);
        
}

private static void testupdate() {
     BankModule b = new BankModule();
     BankBean k = new BankBean();
     k.setBalance(10000180);
     k.setBalance(7800.88);
     k.setBranch("USA");
     k.setHoldername("ayan");
     k.setId(5);
}

private static void testinsert() throws SQLException{
	BankModule b = new BankModule();
	BankBean k = new BankBean();
	    k.setId(6);
	    k.setAccountno(10010008);
	    k.setHoldername("tom");
	    k.setBalance(98000.75);
	    k.setBranch("US");
	    b.insert(k);
}

   private static void testcreate() throws SQLException {
	  BankModule b = new BankModule();
      	b.create();
	
   }	
}