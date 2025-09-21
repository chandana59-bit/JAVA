package com.tnsif.Abstraction;
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

