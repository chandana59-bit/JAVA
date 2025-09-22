package com.tnsif.Constructors;
  class Student {
	Student(int a,int b){
		System.out.println("This is Constructor");
	}
       public void show() {
    	   System.out.println("This is Method");     
    	   }
      }

public class ParameterisedConstructor {

	public static void main(String[] args) {
		Student obj =new Student(10,20);
		obj.show();

	}
}



