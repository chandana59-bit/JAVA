package com.tnsif.Exception;

public class NestedTry {
	public static void main(String args[]) {
	 try {
		 try {
			 String n=null;
			 System.out.println(n.length());
			 
		 }catch(Exception e) {
			 System.out.println("We cannot read null values");
		 }finally {
			 System.out.println("This is nested try executed succesfully") ;
			 
		 }
	 }catch(Exception e) {
			 System.out.println("Outer Catch") ;
		   }
		 
	 
     }
  }

