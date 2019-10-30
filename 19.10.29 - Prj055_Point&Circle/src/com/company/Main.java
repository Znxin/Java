package com.company;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(1.0,2.0);
        Circle c = new Circle(2.0,3.0,5.0);

        c.IsInCircle(p.x,p.y);
        System.out.println("Circle's Area is："+c.CalArea());
        return;

    }
}
