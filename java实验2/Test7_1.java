import java.util.Scanner;

public class Test7_1 {
    //编写测试类
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogName = sc.next();
        String dogSex = sc.next();
        String dogColor = sc.next();

        String catName = sc.next();
        String catSex = sc.next();
        double catWeight = sc.nextDouble();

        Dog dog=new Dog(dogSex,dogName,dogColor);
        //通过有参构造函数实例化Dog类对象
        dog.talk();
        dog.eat();
        //调用talk()方法和eat()方法
        Cat cat=new Cat(catSex,catName,catWeight);
        //通过有参构造函数实例化Cat类对象
        cat.talk();
        cat.eat();
        //调用talk()方法和eat()方法
    }
}

abstract class Pet {
    //声明一个抽象类Pet
    private String sex;
    private String name;
    //封装属性name和sex
    public Pet(String name,String sex){
        //声明一个带有两个参数的构造函数
       this.setName(name);
       this.setSex(sex);
    }
    abstract void talk();
    abstract void eat();
    //声明抽象方法

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
    //声明一个Dog类继承自Pet
    private String color;
    //封装属性color
    public Dog(String name, String sex,String color) {
        super(name, sex);
        this.color=color;
        //声明带有三个参数的构造函数
    }
    public void talk(){
        System.out.println
        ("名称："+getName()+"，性别："+getSex()+"，颜色："+color+"，汪汪叫");
    }
    public void eat(){
        System.out.println(""+getName()+"吃骨头！");
    }
    //重写talk()和eat()方法

}

class Cat extends Pet {
    //声明一个Cat类继承自Pet
    private double weight;
    public Cat(String name, String sex,double weight) {
        super(name, sex);
        this.weight=weight;
        //声明带有三个参数的构造函数
    }
    public void talk(){
        System.out.println
        ("名称："+getName()+"，性别："+getSex()+"，体重："+weight+"kg，喵喵叫");
    }
    public void eat(){
        System.out.println(""+getName()+"吃鱼！");
    }
    //重写talk()和eat()方法
}
