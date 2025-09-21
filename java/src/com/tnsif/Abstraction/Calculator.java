package com.tnsif.Abstraction;

public class Calculator {
	    public static void main(String[] args) {
	        Shape rect = new Rectangle(10, 5);
	        Shape sq = new Square(6);

	        rect.show();
	        rect.calculateArea();

	        sq.show();
	        sq.calculateArea();
	    }
	}

