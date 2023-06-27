
// import java.io.*;
// public class Test_11_20 {
  
//  public static void main(String[] args)throws Exception {
    //   FileWriter writer = new FileWriter("prime.dat");
    //   for(int i=2;i<=200;i++){
        //           for(int j=2;j<=Math.sqrt(i);j++)
        //           if(i%j!=0)
        //           { writer.write(i);
            //             break;
            //           } 
            //          }
            
            //             writer.close();
            //             FileReader reader = new FileReader("prime.dat");
            //             int value;
            //             int k=0;
            //             while((value=reader.read())!=-1)  //从文件输入流读数据，也就是从文件读
            //             {
                //              System.out.print(value+"   ");  
                //              k++;
                //                if(k%10==0)
                //                 System.out.println(); 
                //             }
                //             reader.close(); //关闭文件输入流，即关闭文件
                //  }
                // }
                
                
                
                // import java.io.IOException;
                // import java.util.*;
                // public class Test_11_20 {
//     public static void main(String[] args) {
    //         String a;
    //         int b;
    //         char c;
//         String d;
//         Scanner sc=new Scanner(System.in);
//         Test_11_20 aa[]=new Test_11_20[2];

//         for(int i=0;i<2;i++){
    //             System.out.println("请输入姓名");
    //             a=sc.nextLine();
    //             System.out.println("请输入年龄");
    //             b=sc.nextInt();
    //             System.out.println("请输入性别");
    //             try {
        //                 c = (char)System.in.read();
        //                 System.out.println("请输入工作单位");
//                 d=sc.nextLine();
//                 sc.close();
//                 aa[i]=new Student(a,b,c,d);
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//        for(int i=0;i<2;i++){
    //             System.out.println(aa[i]);
    //         }
    //     //    try {
        //     //  c=(char)System.in.read();
        //     // } catch (IOException e) {
            //     //  e.printStackTrace();
            //     // }
            //  }
            
            // }
            
            // class Student extends Test_11_20{
//     private String name;
//     private char sex;
//     private int age;
//     private String collage;

//      public String getName() {
//          return name;
//         }

//         public void setName(String name) {
    //             this.name = name;
    //         }
    
//         public char getSex() {
    //             return sex;
    //         }
    
    //         public void setSex(char sex) {
        //             this.sex = sex;
//         }

//         public int getAge() {
    //             return age;
    //         }
    
    //         public void setAge(int age) {
        //             this.age = age;
        //         }
        //         public String getCollage() {
            //             return collage;
            //         }
            
            //         public void setCollage(String collage) {
                //             this.collage = collage;
                //         }
                
                //             public Student(String name,int age,char sex,String collage){
                    //                 this.name=name;
                    //                 this.age=age;
                    //                 this.sex=sex;
                    //                 this.collage=collage;
//             }
        
//         public String toString(){
    
    //             return "个人信息：姓名是："+this.name+","+"年龄是："+this.age+","+"性别是："+this.sex+","+"工作单位是"+this.collage;
    //         }
    //     }
    
    
    
import java.util.Scanner;
public class Test_11_20{
    //测试方法
        
    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        Student stu[]=new Student[10];
        //定义一个储存10个学生的数组
        
        
        for(int i=0;i<10;i++){
            System.out.print("请输入姓名:");
            String n = in.nextLine();

            System.out.print("请输入年龄:");
            int a = sc.nextInt();

            System.out.print("请输入性别:");
            char s = sc.next().charAt(0);

            System.out.print("请输入工作单位:");
            String c=in.nextLine();

            stu[i]=new Student(n,a,s,c);
            //将输入的数据导入Student方法
            System.out.println();
        }
        for(int i=0;i<10;i++){
            System.out.println(stu[i].toString());
        }
        //显示整体数据
        

        
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private String collage;
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }
    
    public Student(String name,int age,char sex,String collage){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.collage=collage;
    }

    public String toString(){

        return "个人信息：姓名是："+this.name+","+"年龄是："+this.age+","+"性别是："+this.sex+","+"工作单位是："+this.collage;
    }

}