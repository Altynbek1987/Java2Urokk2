package com.company;

public class Square extends Figure{  //Квадрат
    private double sideA;

    public Square(String name, double sideA) {
        super.setName(name);
        this.sideA = sideA;
    }

    public Square(double sideA) {
        this.sideA=sideA;
    }


    public double getSideA() {
        return sideA;
    }

    @Override
    public double calculatePerimeter() {
        return sideA * 4;
    }

    @Override
    public String draw() {
        return null;
    }
}
