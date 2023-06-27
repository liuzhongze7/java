public class Test_11_6 {
    
    
}

class Point{
    public double x;
    public double y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(Point p){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public static void main(String[] args){

    }
}
class Line{
    public Point x = new Point();
    
}