package com.company;

public class Main {

    public static void main(String[] args) {
        Shape square = new Shape("square", 4, 4, 4);
        Shape rectangle = new Shape("rectangle", 4, 12, 8);
        Shape triangle = new Shape("triangle", 3,12,6);
        Shape circle = new Shape("circle", 0, 13,13);

        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        System.out.println(circle.toString());
    }
}
