import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        System.out.printf("\033[H  \033[2J");//������ʵ������ָ��
        //\033[H��������ƶ�����Ļ�����̨�����Ͻǡ�
        //\033[2J���ӹ�괦��������Ļĩβ��
        //�˴�������ʱΪ��֮��������ͼ��ҳ�������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����Ŀռ����꣺");
        Ponit p1= new Ponit(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("������ڶ�����Ŀռ����꣺");
        Ponit p2= new Ponit(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("\033[H  \033[2J");
        while (true) {
        System.out.println
("--------------------------------------------------");
        System.out.println
("--------------1�������1��ԭ��ľ���----------------");
        System.out.println
("--------------2�������2��ԭ��ľ���----------------");
        System.out.println
("--------------3�����㵽ԭ��ľ��붼���-------------");
        System.out.println
("--------------0���˳�ϵͳ(quit)--------------------");
        System.out.println
("--------------------------------------------------");
        Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {//��ѡ��ṹ������ͼ�ν���Ĺ���ѡ��
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println
("--------------1�������1��ԭ��ľ���----------------");
                    p1.count1(p2);
                    break;
                case 2:
                    System.out.println
("--------------2�������2��ԭ��ľ���----------------");
                    p2.count1(p1);
                    break;
                case 3:
                    System.out.println
("--------------3�����㵽ԭ��ľ��붼���-------------");
                    p1.count1(p2);
                    p2.count1(p1);
                    break;
                default:
                    System.out.println("����ѡ������������ѡ��");
                    break;
            }
        }
    }
    
}
class Ponit {
    private double x;//����˽�б���
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
    //��ѧ��ʽ�������
        System.out.println("����ľ��룺" + m);
        double distance = Math.sqrt(x * x + y * y + z * z);
        System.out.println("��1��ԭ��ľ��룺" + distance);
    }
    public void count2(Ponit p) {
        double m = Math.sqrt((x - p.x) * (x - p.x)
 + (y - p.y) * (y - p.y)+ (z - p.z) * (z - p.z));
        System.out.println("����ľ��룺" + m);
        double distance = Math.sqrt(x * x + y * y + z * z);
        System.out.println("��2��ԭ��ľ��룺" + distance);
    }

    
}
