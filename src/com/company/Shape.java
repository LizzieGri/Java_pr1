package com.company;

public class Shape {
    String type;
    int angles;
    int area;
    int perimeter;
    Shape(String type, int angles, int perimeter, int area) {
        this.type = type;
        this.angles = angles;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String toString(){
        return type + " " + angles + " " + perimeter + " " + area;
    }
}
