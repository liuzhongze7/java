import java.util.Calendar; 
public class Test9_3 { 
    public static void main(String args[]) { 
        myThread t1= new myThread("�߳�1"); 
        myThread t2= new myThread("�߳�2"); 
        myThread t3= new myThread("�߳�3"); 
        t1.start(); 
        //��ʹ��run�����������߳�2�߳�3��ʱΪ0
        t2.start(); 
        //�߳�ͬʱ����
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
        //setTimeInMillis(long)�����Դ���long����
        time1 = Calendar.getInstance().getTimeInMillis(); 
        //��¼�߳̿�ʼʱ��ʱ��
        time2 = Calendar.getInstance().getTimeInMillis(); 
        //��¼�߳̽���ʱ��ʱ��
        System.out .println(name+"�������!��ʱ:"+(time2-time1)+"ms"); 
        //����֮��Ϊ�̵߳�����ʱ��
    } 
}    


