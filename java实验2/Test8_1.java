import java.util.*;

public class Test8_1 {
    public static void main(String[] args) {
        
        System.out.print("请输入一维值:");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        //一维由用户控制
        int a[][]=new int[x][];
    
        for(int i=0;i<x;i++){
            int y=(int) (Math.random()*9+1);
            a[i]=new int[y];
            //二维由系统随机

            for(int j=0;j<y;j++){
                a[i][j]=(int) (Math.random()*90+10);
                //生成数组数据为两位整数
                System.out.print(a[i][j]+"    ");
                //生成数据后能够按数组格式输出
            }
            System.out.println();
      
        }
    }
}