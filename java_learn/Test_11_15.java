// public class Test_11_15 {
//     public static void main(String[] args) {
//    }
// }
// abstract class Monster{
//     private String name;

//     public Monster(String name){
//         this.name = name;
//     }
    
//     public abstract String attack();
// }

// class WaterMonster extends Monster{
//     public WaterMonster(String name){
//         super(name);
//     }
    
//     public String attack(){
//         return "Attack with water!";
//     }
// }
// class FireMonster extends Monster{
//     public FireMonster(String name){
//         super(name);
//     }
    
//     public String attack(){
//         return "Attack with fire!";
//     }
// }

// class StoneMonster extends Monster{
//     public StoneMonster(String name){
//         super(name);
//     }
    
//     public String attack(){
//         return "Attack with stones!";
//     }
// }

// public class Test_11_15 {
//     public static void main(String[] args) {
//    }
// }

// abstract class Motovehicle{
//     private String brand,no;

//     public Motovehicle(String no,String brand){
//         this.no = no;
//         this.brand = brand;
//     } 

//     public String getBrand() {
//         return brand;
//     }

//     public String getNo() {
//         return no;
//     }

//     public abstract int calRent(int days);
// }

// class Bus extends Motovehicle{

//     private int money = 0,seatCount;
    
//     public Bus(String no, String brand,int seatCount) {
//         super(no, brand);
//         this.seatCount = seatCount;
//     }

//     public int calRent(int days) {
//          if(seatCount == 29){
//             money = 800*days;
//          }
//          if(seatCount == 34){
//             money = 1000*days;
//          }
//         return money;
//     }
    
// }

// class Car extends Motovehicle{
//     private int money = 0;
//     private String type;

//     public Car(String no, String brand,String type) {
//         super(no, brand);
//         this.type = type;
//     }
//     public int calRent(int days) {
//         if(type.equals("越野")){
//             money= 2000*days;
//         }
//         if(type.equals("商务")){
//             money = 2200*days;
//         }
//         return money;
//     }
// }

// class Customer{
//     public String id;
//     public String name;

//     public Customer(String id,String name){
//         this.id = id;
//         this.name = name ;
//     }

//     public int calcTotalRent(Motovehicle[] motos,int days){
//         int sum = 0;
//         for(int i = 0 ; i < motos.length;i++){
//             sum += motos[i].calRent(days);
//         }
//         return sum;
//     }
// }

// import java.util.Scanner;
// public class Test_11_15 {
//    public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < 2 * i - 1; j++)
//             System.out.print("*");
//             System.out.println();
//         }
//         for (int i = n; i > 0; i--) {
//             for (int j = 0; j < 2 * i - 1; j++)
//             System.out.print("*");
//             System.out.println();
//         }

//    }
// }


// interface Mycomparable{
//     abstract int compareTo(Object other);
// }

// class Point implements MyComparable {

//     private int x;
//     private int y;
//     public Point(int x,int y){
//         this.x = x;
//         this.y = y;
//     }
//     public double distance(){
//         return Math.sqrt(x*x+y*y);
//     }

//     public int compareTo(Object other) {
//         if(!(other instanceof Point)){
//             throw new IllegalArgumentException();
//         }
//         Point otherPoint = (Point) other;
//         double delta = distance() - otherPoint.distance();
//         if(delta<0){
//             System.out.println(delta);
//             return -1;
//         }else if (delta>0){
//             System.out.println(delta);
//             return 1;
//         }else {
//             System.out.println(delta);
//             return 0;
//         }
//     }

//     public static void main(String[] args) {
//         MyComparable p = new Point(8,5);
//         MyComparable p2 = new Point(3,5);
//         System.out.println(p.compareTo(p2));
//     }

// }


public interface Movable{
    public int moveDown();
    public int moveLeft();
    public int moveRight();
    public int moveUp();
}
class MovablePoint implements Movable{
    public int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int moveUp() {
        return y - ySpeed; 
    }

    public int moveDown() {
        return y + ySpeed;
    }

    public int moveLeft() {
        return x - xSpeed;
    }

    public int moveRight() {
        return x + xSpeed;
    }
}

class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed, radius);
    }
    public int moveUp() {
        return center.y - center.ySpeed;
    }


    public int moveDown() {
        return center.y + center.ySpeed;
    }


    public int moveLeft() {
        return center.x - center.xSpeed;
    }

    public int moveRight() {
        return center.x + center.xSpeed;

    }
}