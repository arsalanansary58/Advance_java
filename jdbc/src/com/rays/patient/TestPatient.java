package com.rays.patient;

import java.sql.SQLException;

public class TestPatient {
public static void main(String[] args) throws SQLException  {

	//Testcreate();
    //Testadd();	
	//testupdate();
	//testdelete();
	testsearch();
         }

           private static void testsearch() throws SQLException {
        	   PatientModule p = new PatientModule();
               PatientBean b = new PatientBean();
           b.setId(2);
           p.search(b);
}

		private static void testdelete() throws SQLException{
               PatientModule p = new PatientModule();
               PatientBean b = new PatientBean();
               b.setId(4);
            p.delete(b);
}

		private static void testupdate() throws SQLException {
        	   PatientModule a = new PatientModule();
        	    PatientBean j = new PatientBean();
        	    j.setId(5);
        	     j.setAge(99);
        	     j.setBloodgroup("S");
        	  
        	     j.setName("ayan");
        	    a.update(j);
        	    
     }

private static void Testadd() throws SQLException {
	  PatientModule a = new PatientModule();	  
 	    PatientBean b = new PatientBean();
       b.setId(5);
       b.setName("anil");
       b.setAge(25);
       b.setBloodgroup("S");
       b.setDisease("cancer");
       a.add(b);
   }

		private static void Testcreate() throws SQLException {
             PatientModule a = new PatientModule();
        a.create();
     }
}
