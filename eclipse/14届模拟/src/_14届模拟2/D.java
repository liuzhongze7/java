package _14½ìÄ£Äâ2;
 
import java.util.Scanner;
 
public class D {
    static int a[][];
    static int n;
    static int m;
    static int res=0;
 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]+= Math.max(a[i-1][j],a[i][j-1]);
            }
        }
        System.out.println(a[n][m]);
    }
}
