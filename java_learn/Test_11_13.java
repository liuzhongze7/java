import java.util.function.DoubleToIntFunction;

import javax.print.DocFlavor.STRING;

// public class Test_11_13 {
    
// }
// class Point2D{
//     private int x;
//     private int y;

//     public Point2D(){
//         this.x=0;
//         this.y=0;
//     }
//     public Point2D(int x ,int y){
//         this.x = x;
//         this.y = y;
//     }
//     public int getX() {
//         return this.x;
//     }
//     public void setX(int x) {
//         this.x = x;
//     }
//     public int getY() {
//         return this.y;
//     }
//     public void setY(int y) {
//         this.y = y;
//     }
//     public String toString() {
//         return "(" + this.x + "," + this.y + ")";
//     }
// }
// class Point3D extends Point2D{
//     private int z;
//     public Point3D(){
//         super();
//         this.z = 0;
//     }
//     public Point3D(int x ,int y ,int z){
//         super(x, y);
//         this.z = z;
//     }
//     public int getZ() {
//         return this.z;
//     }
//     public void setZ(int z) {
//         this.z = z;
//     }
//     public String toString() {
//         return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
//     }
// }

class Circle{
    private double radius;
    private String color;

    public Circle(){
        this.radius = 0.00;
        this.color = "";
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Circle[radius="+radius+",color="+color+"]";
    }
}
class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 0.00;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius ,double height ,String color){
        super(radius,color);
        this.height = height;
    }

    public double setHeight(double height){
        return this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }
}
