package com.company;

public class Rectangle extends Figure{  //Прямоугольник
    private double odna;
    private double vtor;

    public Rectangle(String name, double odna, double vtor) {
        super.setName(name);
        this.odna = odna;
        this.vtor = vtor;
    }

    public double getOdna() {
        return odna;
    }

    public double getVtor() {
        return vtor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (odna + vtor);
    }

    @Override
    public String draw() {
        return "\u2B1B\u2818";
    }
}
