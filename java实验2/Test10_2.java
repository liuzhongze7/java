import java.io.*;
public class Test10_2{
    void getprime(int m,int n,int a[]){
        //�ж��Ƿ�Ϊ����
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
        //ʵ����һ������p
        int a[]=new int[50];
        //����һ���Ƚϴ������
        int i=0,c;
        
        p.getprime(2,200,a);
        
        File file=new File("prime.dat");
        //�����ļ�prime.dat


        try{  
            DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
            DataInputStream in=new DataInputStream(new FileInputStream(file));
            while(a[i]!=0){
                out.write(a[i]);
                i++;
            }
            //ѭ��д������

            System.out.println("�ļ���д��");

            while((c=in.read())!=-1){
                System.out.print(c+"\t");
            }//��ȡ�ļ����ݲ����

            out.close();
            in.close();
            //�ر����������
        }
        catch(IOException e){
            System.out.println("�ļ�д�����"); System.exit(-1);
            //�쳣����
        }
    }

}
