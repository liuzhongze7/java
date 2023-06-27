package 实验八;

import java.io.IOException;
import java.util.*;

public class Student {
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
       return "个人信息：姓名是："+this.name+","+"年龄是："+this.age+","+"性别是："+this.sex+","+"工作单位是"+this.collage;
    }
    public static void main(String[] args) {
        String a,d;
        int b;
        char c=0;
        Scanner sc=new Scanner(System.in);
        Student aa[]=new Student[2];
  
        for(int i=0;i<2;i++){
            System.out.println("请输入姓名");
            a=sc.nextLine();
            System.out.println("请输入年龄");
            b=sc.nextInt();
            System.out.println("请输入性别");
            try {
                c=(char)System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("请输入工作单位");
            d=sc.nextLine();
            aa[i]=new Student(a,b,c,d);
            // sc.nextLine();
            // sc.nextLine();
        }
        for(int i=0;i<2;i++){
            System.out.println(aa[i]);
        }
    }
}
