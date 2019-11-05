package Abstract;

public class Undergraduate extends Student{
    String degree;

    public Undergraduate(int id,String name){
        super(id,name);
    }

    @Override
    public void study() {
        System.out.println("研究生在学习");
    }



}
