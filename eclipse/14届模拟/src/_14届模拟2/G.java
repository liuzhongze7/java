package _14½ìÄ£Äâ2;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class G {
    public static void main(String args[]){
        List<String>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(!list.contains(s))
                list.add(s);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}