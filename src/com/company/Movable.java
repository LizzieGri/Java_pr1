package com.company;

public interface Movable {
    public void move(int x, int y);
}

class Point{
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle {
    private Point center;
    private double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        double diameter = 2 * radius;
        return diameter;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        double square = Math.PI * Math.pow(radius, 2.0);
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

class PointMovable extends Point implements Movable {

    public PointMovable(int x, int y) {
        super(x, y);
    }

    public void move(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }
}

 class MovableCircle extends Circle implements Movable {
     public MovableCircle(Point center, double radius) {
         super(center, radius);
     }

     @Override
     public void move(int x, int y) {
         try {
             ((PointMovable)getCenter()).move(x, y);
         }
         catch (Exception e){
             getCenter().x += x;
             getCenter().y += y;
         }
     }
 }

class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1,1), 5f);

        System.out.println(circle);

        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(15,25);
        System.out.println(pointMovable);
    }
}
