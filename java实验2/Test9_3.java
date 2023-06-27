import java.util.Calendar; 
public class Test9_3 { 
    public static void main(String args[]) { 
        myThread t1= new myThread("线程1"); 
        myThread t2= new myThread("线程2"); 
        myThread t3= new myThread("线程3"); 
        t1.start(); 
        //若使用run方法则会出现线程2线程3用时为0
        t2.start(); 
        //线程同时运行
        t3.start(); 
    }
} 

class myThread extends Thread {
    String name; 
    public myThread(String name) { 
        this.name = name;   
    } 
    public void run() { 
        long time1,time2; 
        //setTimeInMillis(long)，所以创建long类型
        time1 = Calendar.getInstance().getTimeInMillis(); 
        //记录线程开始时的时间
        time2 = Calendar.getInstance().getTimeInMillis(); 
        //记录线程结束时的时间
        System.out .println(name+"运行完毕!用时:"+(time2-time1)+"ms"); 
        //二者之差为线程的运行时间
    } 
}    


