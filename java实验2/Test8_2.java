import java.util.Scanner;
public class Test8_2{
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
            //控制输入一个字符

            System.out.print("请输入工作单位:");
            String c=in.nextLine();

            stu[i]=new Student(n,a,s,c);
            //将输入的数据导入Student方法
            System.out.println();
        }
        for(int i=0;i<10;i++){
            System.out.println(stu[i].toString());
            //重写toString方法打印数据
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


