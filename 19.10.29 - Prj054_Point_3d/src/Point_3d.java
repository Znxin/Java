
 ///设计Point类用来定义空间上的一个点，用构造方法传
//递坐标位置，方法有计算两点的距离。编写测试类，在该类中实现Point类的对象。
public class Point_3d {
    double  x1 ;
    double  x2 ;
    double  y1 ;
    double  y2 ;
    double  z1 ;
    double  z2 ;
    double  diss;
    double dis;
    public  Point_3d(double a,double b,double c,double d,double e,double f) {
        this.x1 =a;
        this.y1 =b;
        this.x2 =c;
        this.y2 =d;
        this.z1 =e;
        this.z2 =f;
    }

    /*
    * 	public  static double getCubeRoot(double input){
		if(input==0)
			return 0;
		double x0,x1;
		x0=input;
		x1=(2*x0/3)+(input/(x0*x0*3));//利用迭代法求解
		while(Math.abs(x1-x0)>0.000001){
			x0=x1;
			x1=(2*x0/3)+(input/(x0*x0*3));
		}
		return x1;
	}*/
    void distance() {
        diss=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2);
        dis=(2*diss/3)+(diss/(diss*diss*3));//利用迭代法求解
        while(Math.abs(x1-diss)>0.000001){
            diss=dis;
            dis=(2*diss/3)+(diss/(diss*diss*3));
        }
        System.out.println("第一个点坐标为"+"("+x1+","+y1+","+z1+")");
        System.out.println("第一个点坐标为"+"("+x2+","+y2+","+z2+")");
        System.out.println("x y两点之间距离为"+dis);
    }

}
 
 
 
