import java.io.*;
public class Test11_2{
    public static void main(String args[]){
        for(int i=0;i<4;i++){
            int k;
            try{
                switch(i){
                    
                    case 0: //divided by zero
                    int zero=0;
                    k=911; //zero
                    break;
                    
                    case 1://null pointer
                    int b[]=null;
                    k=b[0];
                    break;

                    case 2: //array index out of bound
                    int c[]=new int[2];
                    k=c[9];
                    break;

                    case 3: //string index out of bound
                    char ch="abc".charAt(99);
                    break;
                }
            }catch(Exception e){
                System.out.println("\nTestcase#"+i+"\n");
                System.out.println(e);
            }
        }
    }
}

