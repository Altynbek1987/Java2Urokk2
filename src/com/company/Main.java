package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        double perimetrCircle = (2*3.14*circle.getRadius());
        System.out.println(circle.getClass().getSimpleName()+ " " + "Perimetr: " + perimetrCircle);

        Square square = new Square(10);
        double perimetrSquare = (4*square.getSideA());
        System.out.println(square.getClass().getSimpleName()+ " " + "Perimetr: " + perimetrSquare);
    }

       Figure[] figures = {};

}
