import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//�����һ������
        System.out.println("���������1��ʵ��");
        double r1 = in.nextDouble();
        System.out.println("���������1���鲿");
        double im1 = in.nextDouble();

        System.out.println("���������2��ʵ��");//����ڶ�������
        double r2 = in.nextDouble();
        System.out.println("���������2���鲿");
        double im2 = in.nextDouble();

        Complex c1 = new Complex(r1, im1);
        Complex c2 = new Complex(r2, im2);

        System.out.println("����1Ϊ: "+c1);
        System.out.println("����2Ϊ: "+c2);
        System.out.println("(c1 + c2) = " + c1.add(c2));
        System.out.println("(c1 - c2) = " + c1.sub(c2));
        System.out.println("(c1 * c2) = " + c1.mul(c2));

    }
}
class Complex {
    private double real, imaginary;
    //�вι���
    Complex(double r, double i) {
        this.imaginary = i;
        this.real = r;
    }

    public Complex add(Complex c2) {//ʵ�������������
        Complex ans = new Complex(0, 0);
        ans.real = this.real + c2.real;
        ans.imaginary = this.imaginary + c2.imaginary;
        return ans;
    }
    public Complex sub(Complex c2) {//ʵ�������������
        Complex ans = new Complex(0, 0);
        ans.real = this.real - c2.real;
        ans.imaginary = this.imaginary - c2.imaginary;
        return ans;
    }
    public Complex mul(Complex c2) {//ʵ�������������
        Complex ans = new Complex(0, 0);
        ans.real = this.real * c2.real - this.imaginary * c2.imaginary;
        ans.imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        return c2;
    }
    public String toString() {//ʵ�ָ����Ĵ�ӡ
        return " ( "+ real +" , "  + imaginary + " ) ";
        //�����Ŀԭ��a��b���ĸ�ʽ
        //��Ҫע�⸴�����鲿������i
    }
}
