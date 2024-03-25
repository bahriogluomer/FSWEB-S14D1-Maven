package com.workintech.pool;

public class Rectangle {

    private double width;
    private double length;


    public void setLength(double length) {
        this.length = (length < 0) ? 0 : length;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
