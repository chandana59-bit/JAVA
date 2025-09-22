package com.tnsif.Constructors;
class Sample{
	//Default constructor
	Sample(){
		System.out.println("This is Constructor");
	}
       public void show() {
    	   System.out.println("This is Method");     
    	   }
      }

public class DefaultConstructor {

	public static void main(String[] args) {
		Sample obj =new Sample ();
		obj.show();

	}
}

