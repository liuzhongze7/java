public class Test6 {
     public static void main(String[] args) {
         Cat cat = new Cat();
         Dog dog = new Dog();
 
         cat.setAge(6);            
         cat.setName("小猫咪");
         //继承会继承属性和方法
         
         dog.setAge(8);
         dog.setName("大黑狗");
         
         cat.voice();
         cat.eat();
         cat.leg();//调用父类的方法
         cat.act();
         cat.age();
         System.out.printf("\n");
         dog.voice();
         dog.eat();
         dog.leg();//调用父类的方法
         dog.act();
         dog.like();//子类特有的方法
         dog.age();
     }
 }
 
 class Animal { //动物类               
     //创建一个Animal类，封装属性，保留接口
     private String name;
     private int age;

      // 构造方法
      // 无参构造
     public Animal() {
          super();
     }
     public void leg() {
        System.out.println(this.getName() + "四条腿");
   }

     // 有参构造
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
         System.out.println(this.getName() + age + "岁");
     }
     
 }
 
 class Cat extends Animal {     // 猫类
     //继承Animal类，extends关键字
     public void voice() {
         System.out.println(this.getName() + "喵喵叫");
     }
 
     public void eat() {
         System.out.println(this.getName() + "爱吃鱼");
     }
     public void act() {
          System.out.println(this.getName() + "抓老鼠");
     }
 }
 
 class Dog extends Animal {     // 狗类
     //继承Animal类，extends关键字
     public void voice() {
         System.out.println(this.getName() + "汪汪叫");
     }
 
     public void eat() {
         System.out.println(this.getName() + "爱吃肉");
     }


     public void act() {
          System.out.println(this.getName() + "看大门");
     }
     public void like() {
          System.out.println("大黑狗爱捡飞盘");
     }
 }
 