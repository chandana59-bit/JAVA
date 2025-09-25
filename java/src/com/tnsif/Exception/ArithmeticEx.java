package com.tnsif.Exception;

public class ArithmeticEx {
	
	   public static void main(String[] args) {
		  //int a=4,b=0;
		   //int c=a/b;
		  // System.out.println(c);
		   //Arithmatic Exception//
		   int a=4,b=0;
		   try {
			   int c=a/b;
			   System.out.println(c);
			   }catch(NullPointerException e) {
				   System.out.println("Block 1");
			   }catch(ArithmeticException e) {
				   System.out.println("Division is not possible");  
			   }
	   }
	   
	}


