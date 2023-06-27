import java.io.*;
public class Test10_2{
    void getprime(int m,int n,int a[]){
        //判断是否为素数
        int i,j,k;
        for(i=m,k=0;i<=n;i++){
            for(j=2;j<=i/2;j++){
                if(i%j==0) break;  
            }
            if(j>i/2) a[k++]=i;
        } 
    }
    public static void main(String[] args){
        
        Test10_2 p = new Test10_2();
        //实例化一个对象p
        int a[]=new int[50];
        //创建一个比较大的数组
        int i=0,c;
        
        p.getprime(2,200,a);
        
        File file=new File("prime.dat");
        //创建文件prime.dat


        try{  
            DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
            DataInputStream in=new DataInputStream(new FileInputStream(file));
            while(a[i]!=0){
                out.write(a[i]);
                i++;
            }
            //循环写入素数

            System.out.println("文件已写入");

            while((c=in.read())!=-1){
                System.out.print(c+"\t");
            }//读取文件内容并输出

            out.close();
            in.close();
            //关闭输入输出流
        }
        catch(IOException e){
            System.out.println("文件写入错误"); System.exit(-1);
            //异常处理
        }
    }

}
