import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        System.out.printf("\033[H  \033[2J");//这里是实现清屏指令
        //\033[H：将光标移动到屏幕或控制台的左上角。
        //\033[2J：从光标处清屏到屏幕末尾。
        //此处的清屏时为了之后如需做图形页面更方便
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个点的空间坐标：");
        Ponit p1= new Ponit(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("请输入第二个点的空间坐标：");
        Ponit p2= new Ponit(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("\033[H  \033[2J");
        while (true) {
        System.out.println
("--------------------------------------------------");
        System.out.println
("--------------1、输出点1到原点的距离----------------");
        System.out.println
("--------------2、输出点2到原点的距离----------------");
        System.out.println
("--------------3、两点到原点的距离都输出-------------");
        System.out.println
("--------------0、退出系统(quit)--------------------");
        System.out.println
("--------------------------------------------------");
        Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {//用选择结构，进行图形界面的功能选择
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println
("--------------1、输出点1到原点的距离----------------");
                    p1.count1(p2);
                    break;
                case 2:
                    System.out.println
("--------------2、输出点2到原点的距离----------------");
                    p2.count1(p1);
                    break;
                case 3:
                    System.out.println
("--------------3、两点到原点的距离都输出-------------");
                    p1.count1(p2);
                    p2.count1(p1);
                    break;
                default:
                    System.out.println("您的选择有误！请重新选择");
                    break;
            }
        }
    }
    
}
class Ponit {
    private double x;//创建私有变量
    private double y;
    private double z;

    public Ponit(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }
    public double getX() {
        return x;
    }
    public void setX(double a) {
        x = a;
    }
    public double getY() {
        return y;
    }
    public void setY(double b) {
        y = b;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double c) {
        z = c;
    }

    public void count1(Ponit p) {
        double m = Math.sqrt((x - p.x) * (x - p.x)
 + (y - p.y) * (y - p.y)+ (z - p.z) * (z - p.z));
    //数学公式两点距离
        System.out.println("两点的距离：" + m);
        double distance = Math.sqrt(x * x + y * y + z * z);
        System.out.println("点1到原点的距离：" + distance);
    }
    public void count2(Ponit p) {
        double m = Math.sqrt((x - p.x) * (x - p.x)
 + (y - p.y) * (y - p.y)+ (z - p.z) * (z - p.z));
        System.out.println("两点的距离：" + m);
        double distance = Math.sqrt(x * x + y * y + z * z);
        System.out.println("点2到原点的距离：" + distance);
    }

    
}
