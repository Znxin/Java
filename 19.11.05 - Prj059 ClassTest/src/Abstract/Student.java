package Abstract;

public abstract class Student {
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    //抽象方法 子类必须实现
    public abstract void study();
}

