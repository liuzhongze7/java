import java.util.*;
class Test_Thread extends Thread {
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
    Test_Thread tp1=new Test_Thread (1000,"Fast");
    tp1.start();
    Test_Thread tp2=new Test_Thread (3000,"Slow");
    tp2.start();
    }
}
