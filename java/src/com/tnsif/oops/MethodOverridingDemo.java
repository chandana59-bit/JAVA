package com.tnsif.oops;;

class Animal {
 void sound() {
     System.out.println("Animals make sound");
 }
}

class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

public class MethodOverridingDemo {
 public static void main(String[] args) {
     Animal a = new Animal();
     a.sound(); 

     Animal d = new Dog(); 
     d.sound(); 
 }
}




