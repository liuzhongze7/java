import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//输入第一个复数
        System.out.println("请输出复数1的实部");
        double r1 = in.nextDouble();
        System.out.println("请输出复数1的虚部");
        double im1 = in.nextDouble();

        System.out.println("请输出复数2的实部");//输入第二个复数
        double r2 = in.nextDouble();
        System.out.println("请输出复数2的虚部");
        double im2 = in.nextDouble();

        Complex c1 = new Complex(r1, im1);
        Complex c2 = new Complex(r2, im2);

        System.out.println("复数1为: "+c1);
        System.out.println("复数2为: "+c2);
        System.out.println("(c1 + c2) = " + c1.add(c2));
        System.out.println("(c1 - c2) = " + c1.sub(c2));
        System.out.println("(c1 * c2) = " + c1.mul(c2));

    }
}
class Complex {
    private double real, imaginary;
    //有参构造
    Complex(double r, double i) {
        this.imaginary = i;
        this.real = r;
    }

    public Complex add(Complex c2) {//实现两个复数相加
        Complex ans = new Complex(0, 0);
        ans.real = this.real + c2.real;
        ans.imaginary = this.imaginary + c2.imaginary;
        return ans;
    }
    public Complex sub(Complex c2) {//实现两个复数相减
        Complex ans = new Complex(0, 0);
        ans.real = this.real - c2.real;
        ans.imaginary = this.imaginary - c2.imaginary;
        return ans;
    }
    public Complex mul(Complex c2) {//实现两个复数相乘
        Complex ans = new Complex(0, 0);
        ans.real = this.real * c2.real - this.imaginary * c2.imaginary;
        ans.imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        return c2;
    }
    public String toString() {//实现复数的打印
        return " ( "+ real +" , "  + imaginary + " ) ";
        //尊崇题目原则（a，b）的格式
        //需要注意复数的虚部不含有i
    }
}
