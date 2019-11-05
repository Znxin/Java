package test;

public class Circle extends test{

    private double r;
    Circle(double r){
        super();
        this.r = r;
    }

    public double area(double r){
        return r*r*3.14;
    }
}
