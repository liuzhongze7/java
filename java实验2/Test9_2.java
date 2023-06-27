import java.util.*;
class Test_Thread implements Runnable {
    int pauseTime;
    String name;
    public Test_Thread (int x,String n){
    pauseTime=x;
    name=n;
    }
public void run(){
    while(true){
    try{
        System.out.println(name+":"+new Date(System.currentTimeMillis()));
        Thread.sleep(pauseTime);
    }catch(Exception e){System.out.println(e);}
    }
}
static public void main(String srgs[]){
    Thread t1=new Thread(new Test_Thread (1000,"Fast"));
    t1.start();
    Thread t2=new Thread(new Test_Thread (3000,"Slow"));
    t2.start(); 
    }
}
