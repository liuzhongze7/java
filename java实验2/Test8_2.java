import java.util.Scanner;
public class Test8_2{
    //���Է���
        
    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        Student stu[]=new Student[10];
        //����һ������10��ѧ��������
        
        
        for(int i=0;i<10;i++){
            System.out.print("����������:");
            String n = in.nextLine();

            System.out.print("����������:");
            int a = sc.nextInt();

            System.out.print("�������Ա�:");
            char s = sc.next().charAt(0);
            //��������һ���ַ�

            System.out.print("�����빤����λ:");
            String c=in.nextLine();

            stu[i]=new Student(n,a,s,c);
            //����������ݵ���Student����
            System.out.println();
        }
        for(int i=0;i<10;i++){
            System.out.println(stu[i].toString());
            //��дtoString������ӡ����
        }
        //��ʾ��������
        

        
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

        return "������Ϣ�������ǣ�"+this.name+","+"�����ǣ�"+this.age+","+"�Ա��ǣ�"+this.sex+","+"������λ�ǣ�"+this.collage;
    }

}


