package _14½ìÄ£Äâ2;
 
public class A {
    public static boolean check(int i){
        String s=Integer.toBinaryString(i);
        for(int j=s.length()-1;j>=s.length()-6;j--){
            if(s.charAt(j)!='0')
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        for(int i=2023;;i++){
            if(check(i)){
                System.out.println(i);
                break;
            }
        }
    }
}