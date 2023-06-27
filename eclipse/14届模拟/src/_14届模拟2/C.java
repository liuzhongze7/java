package _14½ìÄ£Äâ2;
 
public class C {
    public static boolean check(String s){
        int x=Integer.parseInt(s,16);
        int x1=Integer.parseInt(s);
        if(x%x1==0)
            return true;
        return false;
    }
    public static void main(String args[]){
        for(int i=1;i<=10000;i++){
            String s=String.valueOf(i);
            if(check(s))
                if(s.length()!=1){
                    System.out.println(s);
                    break;
                }
                
        }
    }
}