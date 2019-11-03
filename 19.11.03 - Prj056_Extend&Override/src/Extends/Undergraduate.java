package Extends;

public class Undergraduate extends Student {

    String degree;
    public Undergraduate(int id, String name,String degree) {
        //
        /*
        this.id = id;
        this.name = name;
        this.degree = degree;

         */
        super(id,name);
        this.degree = degree;
    }

    // 方法重写
    public void study(){
        System.out.println("本科生在学习");
    }

    public void show(){
        System.out.println("我的名字是：" + name + ",我的学位是：" + degree );
    }

    public static void main(String[] arg){
        Undergraduate u = new Undergraduate(001,"张三","工学硕士");
        u.study();
        u.show();
    }
}
