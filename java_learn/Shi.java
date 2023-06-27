import java.util.Scanner;

public class Shi {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("input c1:");//对第一个复数进行赋值
  double r1 = in.nextDouble();
  double ima1 = in.nextDouble();
  System.out.println("input c2:"); //对第二个复数进行赋值

  double r2 = in.nextDouble();
  double ima2 = in.nextDouble();
  Complex c1 = new Complex(r1, ima1);
  Complex c2 = new Complex(r2, ima2);
  System.out.println("ComplexNumber a: "+c1);
  System.out.println("ComplexNumber b: "+c2);
  System.out.println("(a + b) = " + c1.add(c2));
//c1去调用add方法，其中参数是对象名
  System.out.println("(a - b) = " + c1.sub(c2));
//c1去调用sub方法，其中参数是对象名

  System.out.println("(a * b) = " + c1.mul(c2));
//c1去调用mul方法，其中参数是对象名


 }
}

class Complex {
 private double real, imaginary;

 Complex(double r, double i) {//有参的构造方法
  this.imaginary = i;
  this.real = r;
 }

 Complex() {//无参的构造方法


 }

 public Complex add(Complex other) {//一般方法的有参两个复数的加法
  Complex t = new Complex(0, 0);
  t.real = this.real + other.real;
  t.imaginary = this.imaginary + other.imaginary;
  return t;//返回的对象t包含两个加起来以后的实部和虚部两个变量
 }
  public Complex sub(Complex other) {//一般方法的两个复数的减法
  Complex t = new Complex(0, 0);
  t.real = this.real - other.real;
  t.imaginary = this.imaginary - other.imaginary;
  return t;
 }

 public Complex mul(Complex other) {//一般方法的两个复数的乘法
              Complex t=new Complex(0,0);
			  t.real=this.real*other.real-this.imaginary*other.imaginary;
			  t.imaginary=this.real*other.imaginary+this.imaginary*other.real;
			  return  t;}
public String toString(){
     return real+"+"+imaginary+"i";//
	 }
}
