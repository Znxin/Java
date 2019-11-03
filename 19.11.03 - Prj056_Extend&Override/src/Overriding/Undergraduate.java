package Overriding;

public class Undergraduate extends Student {

    String degree;
    long id;

    public Undergraduate(long id, String name,String degree) {

        this.id = id;
        this.name = name;
        this.degree = degree;
    }

    public void show(){
        System.out.println("我的名字是：" + name + ",我的学位是：" + degree );
    }

    public static void main(String[] arg){
        Undergraduate u = new Undergraduate(001,"张三","工学硕士");
        System.out.println(u.id);
    }
}