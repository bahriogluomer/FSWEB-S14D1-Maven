package com.workintech.cylinder;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
