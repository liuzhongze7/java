import java.util.*;

public class Test8_1 {
    public static void main(String[] args) {
        
        System.out.print("������һάֵ:");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        //һά���û�����
        int a[][]=new int[x][];
    
        for(int i=0;i<x;i++){
            int y=(int) (Math.random()*9+1);
            a[i]=new int[y];
            //��ά��ϵͳ���

            for(int j=0;j<y;j++){
                a[i][j]=(int) (Math.random()*90+10);
                //������������Ϊ��λ����
                System.out.print(a[i][j]+"    ");
                //�������ݺ��ܹ��������ʽ���
            }
            System.out.println();
      
        }
    }
}