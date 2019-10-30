package com.company;


import static java.lang.Math.PI;

public class Circle {
    double r;
    double cx;
    double cy;
    double dis;

    public Circle(double cxx,double cyy,double crr){
        r = crr;
        cx = cxx;
        cy = cyy;
    }

    public double CalArea(){
        return r*r*PI;
    }
    public void IsInCircle(double xx,double yy){
        Point point = new Point(xx,yy);
        dis = Math.sqrt(((point.x-cx)*(point.x-cx)+(point.y-cy)*(point.y-cy)));
        if(dis == r){
            System.out.println("Point is on the Circle.");
        }
        else if(dis>r){
            System.out.println("Point is out of the Circle.");
        }
        else{
            System.out.println("Point is in the Circle.");
        }
    }
}
