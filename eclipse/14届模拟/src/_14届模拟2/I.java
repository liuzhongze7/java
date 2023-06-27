package _14½ìÄ£Äâ2;
 
import java.util.Scanner;
 
public class I {
    static int n;
    static int m;
    static char a[][];
    static int res=0;
    public static boolean check(int r,int c,int l){
        if(r-l<0||r+l>=n||c-l<0||c+l>=m){
            return false;
        }
        for(int i=1;i<=l;i++){
            if(a[r-i][c-i]!=a[r][c]||a[r-i][c+i]!=a[r][c]||a[r+i][c-i]!=a[r][c]||a[r+i][c+i]!=a[r][c])
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=new char[n][m];
        for(int i=0;i<n;i++){
            a[i]=sc.next().toCharArray();
        }
        int x= Math.min((n-1)/2,(m-1)/2);
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                for(int k=1;k<=x;k++){
                    if(check(i,j,k))
                        res++;
                }
            }
        }
        System.out.println(res);
    }
}