package Multiply_AbstractWithImplement;

interface Human{
    abstract void intro();
}

interface Teacher extends Human{
    void work();
}

abstract class Student implements Human{
    String name;
    String sex;

    Student(String name,String sex){
        this.name = name;
        this.sex = sex;
    }

    abstract void study();
    public void intro(){
        System.out.println("我是一名学生。");
        System.out.println("我的职责是认真学习科学文化知识。");
    }
}

class Graduate extends Student{
    Graduate(String name,String sex){
        super(name, sex);
    }

    void study(){
        System.out.println("在学校学习各门科学知识");
        int score [] = {80,95,65,55,88};
        System.out.println("他的成绩是:");
        for(int i = score.length - 1; i >= 0; i--) {
            System.out.print(score[i] + " ");
        }
    }
}

class TeacherOn implements Human,Teacher{
    String name,sex;
    TeacherOn(String name,String sex){
        this.name = name;
        this.sex = sex;
    }

    @Override
    public void intro() {
        System.out.println("我是一名教师。");
        System.out.println("我的职责是教书育人。");

    }

    @Override
    public void work() {
        System.out.println("此人是老师，教授Java课，工作认真。");
    }
}

class Teacher_Graduate extends Graduate implements Teacher{
    Teacher_Graduate(String name,String sex){
        super(name, sex);
    }

    @Override
    public void intro() {
        System.out.println("我既是老师又是学生，我具有双重身份。");
        System.out.println("我的职责是既服务学生，又服务老师。");
    }

    @Override
    public void work() {
        System.out.println("此人具有老师和学生的职责，是名负责学生工作的老师。");
    }
}


public class TestHuman {
    public static void main(String args[]){
        Graduate stu = new Graduate("王阳","男");
        System.out.println("姓名：" + stu.name + ",性别：" + stu.sex);
        stu.intro();
        stu.study();
        System.out.println();
        System.out.println();
        TeacherOn teach = new TeacherOn("李芳","女");
        System.out.println("姓名：" + teach.name + ",性别：" + teach.sex);
        teach.intro();
        teach.work();
        System.out.println();
        System.out.println();
        Teacher_Graduate teach_ = new Teacher_Graduate("赵旭","男");
        System.out.println("姓名：" + teach_.name + ",性别：" + teach_.sex);
        teach_.intro();
        teach_.work();
        teach_.study();
    }
}
