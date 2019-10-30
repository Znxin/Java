package writing;

import java.io.IOException;
import java.util.Scanner;

public class write{

    String wt,wb;
    public void writeletter() throws IOException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入称谓：");
        wt=sc.nextLine();
        System.out.println("请输入内容：");
        wb=sc.nextLine();

        Homeletterlmpl h1=new Homeletterlmpl();
        System.out.println(h1.writeTitle(wt));
        System.out.println(h1.writeHello());
        System.out.println(h1.writeBody(wb));
        System.out.println(h1.writeGreeting());
        System.out.println(h1.writeSelft());
    }
}
