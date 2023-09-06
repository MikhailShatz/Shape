package org.example;

import shapes.Circle;
import shapes.Square;

public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle(10, 5, "blue", true, 12);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        circle.drawing();
        circle.drawingRed();

        Square square = new Square(15,8,"white", false,50);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        square.drawing();
        square.drawingRed();
    }
}