package com.company;

public class Rectangle {
    protected point P1;
    protected point P2;

    public Rectangle(point P1, point P2){
        this.P1 = P1;
        this.P2 = P2;
    }

    public point getP1() {
        return P1;
    }

    public point getP2() {
        return P2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "RightTop=" + P1 +
                ", LeftBottom=" + P2 +
                '}';
    }
}

class point {

    protected int x;
    protected int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x) {
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

interface movable {
    public void move(int x, int y);
}

class pointMovable extends point implements movable {
    public pointMovable(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }
}

class MovableRectangle extends Rectangle implements movable {
    public MovableRectangle(point P1, point P2) {
        super(P1, P2);
    }

    @Override
    public void move(int x, int y) {
        try {
            ((pointMovable) getP1()).move(x, y);
            ((pointMovable) getP2()).move(x, y);
        }
        catch (Exception e){
            getP1().x += x;
            getP2().x += x;
            getP1().y += y;
            getP2().y += y;
        }
    }
}

 class Main6 {
    public static void main(String[] args) {
        Rectangle Rectangle1=new Rectangle(new point(1,1),new point(4,4));
        System.out.println(Rectangle1);
        MovableRectangle Rectangle2=new MovableRectangle(new point(1,1),new point(4,4));
        Rectangle2.move(10,10);
        System.out.println(Rectangle2);
    }
}
