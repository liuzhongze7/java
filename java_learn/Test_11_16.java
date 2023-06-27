// public class Test_11_16 {
    
// }
// interface GeomettricObject{
//     public double getArea();
//     public double getPerimeter();

// }

// class Circle implements GeomettricObject{
//     public double radius;

//     public Circle(double radius){
//         this.radius = radius;
//     }


//     public double getArea() {
//         return radius*radius*Math.PI;
//     }

//     public double getPerimeter(){
//         return radius*Math.PI*2;
//     }
// }

// interface Resizable{
//     public double resize(int percent);
// }
// class ResizableCircle extends Circle implements Resizable{
//     public ResizableCircle(double radius){
//         super(radius);
//     }
//     public double resize(int percent){
//         return (percent*getArea())/100;
//     }
// }

// public class Test_11_16{
//     private int  a = 100;
//     public class Inner{
//         public String innerMethod(){
//             return "outer a"+a;
//         }
//     }
//     public static void main(String[] args) {
//         //可以自行在Main方法中进行调试
//     }
// }

class ExpDiv {
    public static int div(int n1,int n2){
        if(n2==0){
            throw new DivZeroException();
        }
        return n1/n2;
    }
}

public class Test_11_16 {
    public static void main(String[] args) {
        System.out.println(UseDiv.use(100,20));
        System.out.println(UseDiv.use(100,0));
    }
}

class UseDiv extends ExpDiv{
    public static String use(int a,int b){

        try{
            return "计算结果是"+div(a,b);
        }catch (DivZeroException e){
           return "除数不能为0";
        }
    }

}
class DivZeroException extends RuntimeException{

}