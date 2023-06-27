public class Testcat {
    public static void main(String[] args) {
        Animal animal = new Animal("动物", 4);
        Dog dog = new Dog("哈士奇", 4);
        Cat cat = new Cat("英短", 4);
        System.out.println("animal:" + animal);
        System.out.println("dog:" + dog);
        System.out.println("cat:" + cat);
    }
}

class Animal {
    private String name;
    private int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}

class Dog extends Animal {
    public Dog(String name, int legs) {
        super(name, legs);
    }
}

class Cat extends Animal {
    public Cat(String name, int legs) {
        super(name, legs);
    }
}
