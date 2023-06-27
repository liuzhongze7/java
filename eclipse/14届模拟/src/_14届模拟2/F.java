package _14½ìÄ£Äâ2;
 
import java.util.Scanner;
 
public class F {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=sc.nextInt();
        int s=sc.nextInt();
        double v=c*1.0/t;
        double res=(s-c)/v;
        System.out.printf("%.0f",res);
    }
}