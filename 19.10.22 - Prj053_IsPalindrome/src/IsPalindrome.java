import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
/*
12、一个n位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
*/
        Scanner reader=new Scanner(System.in);
        int a=0;
        System.out.println("输入回文数a：");
        a=reader.nextInt();//回文数
        //计算输入数的位数
        int count=countNumbersOfBit(a);
        //求输入数字的最高位对应的基数
        int tens=cardinalNumber(count);
        //判断是不是回文数
        boolean ispalindrome=isaPalindrome(a,count,tens);
        //如果是回文数那就输出
        if(ispalindrome)
            System.out.println(a+"是回文数！");
        reader.close();
    }

    //统计数字的位数
    static int countNumbersOfBit(int n)
    {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    //计算最高位的基数
    static int cardinalNumber(int count)
    {
        int tens=1;
        for(int i=0;i<count-1;i++)
        {
            tens*=10;
        }
        return tens;
    }
    /*
    //判断是不是回文数
    参数为输入的数a,数a的长度count,数a最高位对应的基数(对应最高位为1其余位补零)
    */
    static boolean isaPalindrome(int a,int count,int tens)
    {
        int hight;//最高位
        int low;//最低位
        int aa=a;//复制a
        boolean isPalindrome=true;
        for(int i=0;i<count/2;i++)//求万位
        {
            hight=a/tens;//取得最高位
//			System.out.println("hight:"+hight);
            a=a-hight*tens;//减去最高位
            tens=tens/10;//位数减1
            //求最低位
            low=aa%10;
            aa=aa/10;
//			System.out.println("low:"+low);
            if(hight!=low)
            {
                isPalindrome=false;//如果不是回文数，让标志位假
                System.out.println("不是回文！");
                break;
            }
        }
        return isPalindrome;
    }
}