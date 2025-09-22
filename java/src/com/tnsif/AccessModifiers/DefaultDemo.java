package com.tnsif.AccessModifiers;

class Person {  
    String name;  
    int age;     

    // Default access method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DefaultDemo{
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "D Chandana"; 
        p.age = 22;            
        p.displayInfo();     
    }
}



