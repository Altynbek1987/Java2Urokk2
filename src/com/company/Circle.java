package com.company;

public class Circle extends Figure{//Круг
    private final double PI = 3.14;
    private double radius;

    public Circle(String name, double radius) {
        super.setName(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String draw() {
        return null;
    }
}
