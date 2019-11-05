package test;

public class Tria extends test {
    private double a;
    private double b;
    private double c;

    Tria(double a, double b, double c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(double a,double b,double c){
        double s = (a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
