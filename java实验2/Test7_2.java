
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
		//ʹ�ø�����Ϊ�������β�
		showEat(person2);
		//�ֱ����showEat()����

		Chinese c=(Chinese)person1;
		c.shadowBoxing();

		English e=(English)person2;
		e.horseRiding();
		//ͨ��ǿ������ת�����ø��������еķ���
	}

    public static void showEat(Person person){
		//����һ��showEat()����
        person.eat();
    }
}


abstract class Person {
	//����һ��������Person
	private String name;
	private String sex;
	private int age;
	//��װ����name��sex��age
	public abstract void eat();
	//�������󷽷�eat()
	public Person(String name,String sex,int age){
		//����һ���������������Ĺ��캯��
        
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
    //����һ��Chinese�࣬�̳���Person��

	public Chinese(String name, String sex, int age) {
		super(name, sex, age);

	}
	public void eat(){
		//��д�����eat()����
		System.out.println("������"+getName()+"���Ա�"+getSex()+"�����䣺"+getAge()+"����ϲ���Է���");
	}
	public void shadowBoxing(){
		System.out.println(getName()+"�ڴ�̫����");
		//����һ���Լ����еķ���shadowBoxing()
	}

}

class English extends Person {
	//����һ��English�࣬�̳���Person��

	English(String name,String sex,int age){
		super(name, sex, age);
	}
	public void eat(){
		//��д�����eat()����
		System.out.println("������"+getName()+"���Ա�"+getSex()+"�����䣺"+getAge()+"����ϲ���������");
	}
	public void horseRiding(){
		//����һ���Լ����еķ���horseRiding()
		System.out.println(getName()+"������");

	}

}
