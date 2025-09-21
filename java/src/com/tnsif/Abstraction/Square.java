package com.tnsif.Abstraction;
class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    @Override
    void calculateArea() {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }
}

