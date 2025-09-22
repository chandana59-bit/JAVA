package com.tnsif.AccessModifiers;

public class PrivateDemo {

	    private String name;
	    private int age;

	    private void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    
	    public void setData(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	
	    public void showData() {
	        displayInfo(); 
	    }

	    public static void main(String[] args) {
	        PrivateDemo person = new PrivateDemo();


	        
	        person.setData("D Chandana", 22);
	        person.showData();  
	    }
	}


