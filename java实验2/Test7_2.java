
import java.util.Scanner;


public class Test7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cName = sc.next();
		String cSex = sc.next();
		int cAge = sc.nextInt();

		String eName = sc.next();
		String eSex = sc.next();
		int eAge = sc.nextInt();
	


		Person person1=new Chinese(cName,cSex,cAge);
		showEat(person1);

		Person person2=new English(eName,eSex,eAge);
		//使用父类作为方法的形参
		showEat(person2);
		//分别调用showEat()方法

		Chinese c=(Chinese)person1;
		c.shadowBoxing();

		English e=(English)person2;
		e.horseRiding();
		//通过强制类型转换调用各自类特有的方法
	}

    public static void showEat(Person person){
		//定义一个showEat()方法
        person.eat();
    }
}


abstract class Person {
	//定义一个抽象类Person
	private String name;
	private String sex;
	private int age;
	//封装属性name、sex、age
	public abstract void eat();
	//包含抽象方法eat()
	public Person(String name,String sex,int age){
		//声明一个带有三个参数的构造函数
        
        this.setName(name);
		this.setSex(sex);
		this.setAge(age);
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}



class Chinese extends Person {
    //定义一个Chinese类，继承自Person类

	public Chinese(String name, String sex, int age) {
		super(name, sex, age);

	}
	public void eat(){
		//重写父类的eat()方法
		System.out.println("姓名："+getName()+"，性别："+getSex()+"，年龄："+getAge()+"，我喜欢吃饭！");
	}
	public void shadowBoxing(){
		System.out.println(getName()+"在打太极！");
		//定义一个自己特有的方法shadowBoxing()
	}

}

class English extends Person {
	//定义一个English类，继承自Person类

	English(String name,String sex,int age){
		super(name, sex, age);
	}
	public void eat(){
		//重写父类的eat()方法
		System.out.println("姓名："+getName()+"，性别："+getSex()+"，年龄："+getAge()+"，我喜欢吃面包！");
	}
	public void horseRiding(){
		//定义一个自己特有的方法horseRiding()
		System.out.println(getName()+"在骑马！");

	}

}
