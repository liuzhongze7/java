package _14½ìÄ£Äâ2;
 
public class E {
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        int res=0;
        for(int i=2;i<=2022;i++){
            for(int j=i+1;j<=2022;j++){
                if(isprime(i)&&isprime(j)&&i+j==2022){
                    res++;
//                    System.out.println(i+"+"+j+"="+2022);
                }
            }
        }
        System.out.println(res);
    }
}