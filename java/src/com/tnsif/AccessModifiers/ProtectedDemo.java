package com.tnsif.AccessModifiers;

public class ProtectedDemo {

	    protected String name;
	    protected int age;

	    protected void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        ProtectedDemo person = new ProtectedDemo();

	        person.name = "D Chandana";
	        person.age = 22;

	        person.displayInfo();  
	    }
	}


