public class Test6 {
     public static void main(String[] args) {
         Cat cat = new Cat();
         Dog dog = new Dog();
 
         cat.setAge(6);            
         cat.setName("Сè��");
         //�̳л�̳����Ժͷ���
         
         dog.setAge(8);
         dog.setName("��ڹ�");
         
         cat.voice();
         cat.eat();
         cat.leg();//���ø���ķ���
         cat.act();
         cat.age();
         System.out.printf("\n");
         dog.voice();
         dog.eat();
         dog.leg();//���ø���ķ���
         dog.act();
         dog.like();//�������еķ���
         dog.age();
     }
 }
 
 class Animal { //������               
     //����һ��Animal�࣬��װ���ԣ������ӿ�
     private String name;
     private int age;

      // ���췽��
      // �޲ι���
     public Animal() {
          super();
     }
     public void leg() {
        System.out.println(this.getName() + "������");
   }

     // �вι���
     public Animal(String name, int age) {
          super();
          this.name = name;
          this.age = age;
     }
     public void setName(String name) {
         this.name = name;
     }
 
     public String getName() {
         return name;
     }
 
     public void setAge(int age) {
         this.age = age;
     }
 
     public int getAge() {
         return age;
     }
 
     public void age() {
         System.out.println(this.getName() + age + "��");
     }
     
 }
 
 class Cat extends Animal {     // è��
     //�̳�Animal�࣬extends�ؼ���
     public void voice() {
         System.out.println(this.getName() + "������");
     }
 
     public void eat() {
         System.out.println(this.getName() + "������");
     }
     public void act() {
          System.out.println(this.getName() + "ץ����");
     }
 }
 
 class Dog extends Animal {     // ����
     //�̳�Animal�࣬extends�ؼ���
     public void voice() {
         System.out.println(this.getName() + "������");
     }
 
     public void eat() {
         System.out.println(this.getName() + "������");
     }


     public void act() {
          System.out.println(this.getName() + "������");
     }
     public void like() {
          System.out.println("��ڹ��������");
     }
 }
 