package Abstract;

public class Postgraduate extends Student{
    String degree;

    public Postgraduate(int id, String name) {
        super(id, name);
    }


    @Override

    public void study(){
        System.out.println("研究生在学习");
    }
}
