import java.util.Scanner;

public class Test7_1 {
    //��д������
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogName = sc.next();
        String dogSex = sc.next();
        String dogColor = sc.next();

        String catName = sc.next();
        String catSex = sc.next();
        double catWeight = sc.nextDouble();

        Dog dog=new Dog(dogSex,dogName,dogColor);
        //ͨ���вι��캯��ʵ����Dog�����
        dog.talk();
        dog.eat();
        //����talk()������eat()����
        Cat cat=new Cat(catSex,catName,catWeight);
        //ͨ���вι��캯��ʵ����Cat�����
        cat.talk();
        cat.eat();
        //����talk()������eat()����
    }
}

abstract class Pet {
    //����һ��������Pet
    private String sex;
    private String name;
    //��װ����name��sex
    public Pet(String name,String sex){
        //����һ���������������Ĺ��캯��
       this.setName(name);
       this.setSex(sex);
    }
    abstract void talk();
    abstract void eat();
    //�������󷽷�

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Pet {
    //����һ��Dog��̳���Pet
    private String color;
    //��װ����color
    public Dog(String name, String sex,String color) {
        super(name, sex);
        this.color=color;
        //�����������������Ĺ��캯��
    }
    public void talk(){
        System.out.println
        ("���ƣ�"+getName()+"���Ա�"+getSex()+"����ɫ��"+color+"��������");
    }
    public void eat(){
        System.out.println(""+getName()+"�Թ�ͷ��");
    }
    //��дtalk()��eat()����

}

class Cat extends Pet {
    //����һ��Cat��̳���Pet
    private double weight;
    public Cat(String name, String sex,double weight) {
        super(name, sex);
        this.weight=weight;
        //�����������������Ĺ��캯��
    }
    public void talk(){
        System.out.println
        ("���ƣ�"+getName()+"���Ա�"+getSex()+"�����أ�"+weight+"kg��������");
    }
    public void eat(){
        System.out.println(""+getName()+"���㣡");
    }
    //��дtalk()��eat()����
}
