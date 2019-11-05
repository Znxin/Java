package test;

abstract class Shapes{
    abstract public double area();
}

public class test extends Shapes{

    public double area(){
        return 100;
    }

    public static void main(String[] args){
        Tria x = new Tria(3.0,4.0,5.0);
        System.out.println(x.area());
        Circle y = new Circle(5.0);
        System.out.println(y.area());
    }
}
