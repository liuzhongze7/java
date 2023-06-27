// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

  
// public class Test_11_22 {  
//     static Boolean flag;  
//     //创建flag记录点击
//     public static void main(String[] args) {  
//         flag =true;  
//         JFrame frame =new JFrame ("山西工学院");  
//         frame.setLayout(null);   
//         //设置窗体的相关属性，默认布局为setLayout  

//         frame.setBounds(60,100,400,200);  
//         //设置窗体大小
//         frame.setVisible(true);  
//         //设置对象的可见状态。

//         final JButton btn1=new JButton ("click me !"); 
//         //设置初始标签click me !
//         btn1.setBounds(100, 80, 200, 30);
//         //设置按钮的位置大小
//         frame.add(btn1);  
//         //放置按钮
        
//         btn1.addActionListener(new ActionListener() {  
//         //对按钮进行监听
//             public void actionPerformed(ActionEvent e) {  
//                 if (flag){  
//                     btn1.setText("click me again ! ");
//                     flag=false;  
//                 }  
//                 else{  
//                     btn1.setText("click me !"); 
//                     flag=true;  
//                 }  
//             }  
//         } );
//     }     
// } 


// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.JButton;

// public class Test_11_22 {
//     static Boolean flag;  
//     public static void main(String[] args) {
//         Frame frame=new Frame("流式布局");
//         //组件——按钮
//         final JButton btn1=new JButton("click me !");

//         //设置流式布局
//         frame.setLayout(new FlowLayout(FlowLayout.LEFT));   
//         //设置组件的添加方式

//         frame.setBounds(60,100,500,300);
//         //把按钮添加进去
//         frame.add(btn1);
//         btn1.addActionListener(new ActionListener() {  
          
//             public void actionPerformed(ActionEvent e) {  
//                 if (flag){  
//                     btn1.setText("click me again ! "); //A行 
//                     flag=false;  
//                 }  
//                 else{  
//                     btn1.setText("click me !"); //B行 
//                     flag=true;  
//                 }  
//             }  
//       });  
//         frame.setVisible(true);
//     }
// }


// import java.awt.*;

// public class Test_11_22 {
//     public static void main(String[] args) {
//         Frame frame = new Frame();

//         frame.setVisible(true);
//         frame.setSize(400,300);
//         frame.setLocation(300,400);
//         frame.setBackground(Color.green);

//         frame.setLayout(new GridLayout(2,1));

//         //四个面板
//         Panel p1 = new Panel(new BorderLayout());
//         Panel p2 = new Panel(new GridLayout(2,1));
//         Panel p3 = new Panel(new BorderLayout());
//         Panel p4 = new Panel(new GridLayout(2,2));
// //上面ok
//         p1.add(new Button("East-1"),BorderLayout.EAST);
//         p1.add(new Button("West-1"),BorderLayout.WEST);


//         p2.add(new Button("p2-btn-1"));
//         p2.add(new Button("p2-btn-2"));
//         p1.add(p2,BorderLayout.CENTER);
// //下面
//         p3.add(new Button("East-2"),BorderLayout.EAST);
//         p3.add(new Button("West-2"),BorderLayout.WEST);
// //中间4个
//         for (int i = 0; i < 4; i++) {
//             p4.add(new Button("for-"+i));
//         }
//         p3.add(p4,BorderLayout.CENTER);

//         frame.add(p1);
//         frame.add(p3);

//     }
// }

// import java.io.*;
// public class Test_11_22{
//     public static void main(String args[]){
//         for(int i=0;i<4;i++){
//             int k;
//             try{
//                 switch(i){
                    
//                     case 0: //divided by zero
//                     int zero=0;
//                     k=911; //zero
//                     break;
                    
//                     case 1://null pointer
//                     int b[]=null;
//                     k=b[0];
//                     break;

//                     case 2: //array index out of bound
//                     int c[]=new int[2];
//                     k=c[9];
//                     break;

//                     case 3: //string index out of bound
//                     char ch="abc".charAt(99);
//                     break;
//                 }
//             }catch(Exception e){
//                 System.out.println("\nTestcase#"+i+"\n");
//                 System.out.println(e);
//             }
//         }
//     }
// }









// import java.util.*;
// class Test_Thread extends Thread {
//     int pauseTime;
//     String name;
//     public Test_Thread (int x,String n){
//     pauseTime=x;
//     name=n;
// }
// public void run(){
//     while(true){
//     try{
//         System.out.println(name+":"+new Date(System.currentTimeMillis()));
//         Thread.sleep(pauseTime);
//     }catch(Exception e){System.out.println(e);}
//     }
// }
// static public void main(String srgs[]){
//     Test_Thread tp1=new Test_Thread (1000,"Fast");
//     tp1.start();
//     Test_Thread tp2=new Test_Thread (3000,"Slow");
//     tp2.start();
//     }
// }

// import java.util.*;
// class Test_Thread implements Runnable {
//     int pauseTime;
//     String name;
//     public Test_Thread (int x,String n){
//     pauseTime=x;
//     name=n;
//     }
// public void run(){
//     while(true){
//     try{
//         System.out.println(name+":"+new Date(System.currentTimeMillis()));
//         Thread.sleep(pauseTime);
//     }catch(Exception e){System.out.println(e);}
//     }
// }
// static public void main(String srgs[]){
//     Thread t1=new Thread(new Test_Thread (1000,"Fast"));
//     t1.start();
//     Thread t2=new Thread(new Test_Thread (3000,"Slow"));
//     t2.start(); 
//     }
// }


// import java.util.Calendar; 
// public class Test_11_22 { 
//     public static void main(String args[]) { 
//         myThread t1= new myThread("线程1"); 
//         myThread t2= new myThread("线程2"); 
//         myThread t3= new myThread("线程3"); 
//         t1.start(); 
//         //若使用run方法则会出现线程2线程3用时为0
//         t2.start(); 
//         //线程同时运行
//         t3.start(); 
//     }
// } 

// class myThread extends Thread {
//     String name; 
//     public myThread(String name) { 
//         this.name = name;   
//     } 
//     public void run() { 
//         long time1,time2; 
//         //setTimeInMillis(long)，所以创建long类型
//         time1 = Calendar.getInstance().getTimeInMillis(); 
//         //记录线程开始时的时间
//         time2 = Calendar.getInstance().getTimeInMillis(); 
//         //记录线程结束时的时间
//         System.out .println(name+"运行完毕!用时:"+(time2-time1)+"ms"); 
//         //二者之差为线程的运行时间
//     } 
// }    



import java.io.*;
public class Test_11_22{
    void getprime(int m,int n,int a[]){
        //判断是否为素数
        int i,j,k;
        for(i=m,k=0;i<=n;i++){
            for(j=2;j<=i/2;j++){
                if(i%j==0) break;  
            }
            if(j>i/2) a[k++]=i;
        } 
    }
    public static void main(String[] args){
        
        Test_11_22 p = new Test_11_22();
        //实例化一个对象p
        int a[]=new int[50];
        //创建一个比较大的数组
        int i=0,c;
        
        p.getprime(2,200,a);
        
        File file=new File("prime.dat");
        //创建文件prime.dat

        try{  
            DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
            DataInputStream in=new DataInputStream(new FileInputStream(file));
            while(a[i]!=0){
                out.write(a[i]);
                i++;
            }
            //循环写入素数

            System.out.println("文件已写入");

            while((c=in.read())!=-1){
                System.out.print(c+"\t");
            }//读取文件内容并输出

            out.close();
            in.close();
            //关闭输入输出流
        }
        catch(IOException e){
            System.out.println("文件写入错误"); System.exit(-1);
            //异常处理
        }
    }

}
