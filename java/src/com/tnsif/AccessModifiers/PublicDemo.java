package com.tnsif.AccessModifiers;

public class PublicDemo {
	    public String name;
	    public int age;

	    // Public method
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	       
	        PublicDemo person = new PublicDemo();
	        person.name = "D Chandana";
	        person.age = 22;
	        person.displayInfo();
	    }
	}


