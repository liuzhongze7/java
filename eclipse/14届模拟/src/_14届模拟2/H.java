package _14½ìÄ£Äâ2;
 
import java.util.Scanner;
 
public class H {
    public static boolean isHuiwen(String s){
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(isHuiwen(s)){
            System.out.println(s);
            return;
        }
        else{
            String s1="";
            String res="";
            for(int i=s.length()-1;i>=0;i--){
                s1+=s.charAt(i);
            }
            for(int i=0;i<s.length();i++){
                int j=s.length()-1-i;
                String x=s.substring(i+1);
                String y=s1.substring(0,j);
                if(x.equals(y)){
                    res=s+s1.substring(j);
                    break;
                }
            }
            System.out.println(res);
        }
    }
}