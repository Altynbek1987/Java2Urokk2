package com.company;

public class Triangle extends Figure{ //Треугольник
    private double storona1;
    private double storona2;
    private double storona3;

    public Triangle(double storona1, double storona2, double storona3) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }
    public Triangle(String name, double storona1, double storona2, double storona3) {
        super.setName(name);
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    public double getStorona1() {
        return storona1;
    }

    public double getStorona2() {
        return storona2;
    }

    public double getStorona3() {
        return storona3;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public String draw() {
        return "\ud83d\udd3a";
    }
}
