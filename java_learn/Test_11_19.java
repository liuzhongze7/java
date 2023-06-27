

// import java.awt.*;
// import java.awt.event.*;
// public class Test_11_19 {
// 	public static void main(String args[]) {
//     new MyFrame55("MyFrame");
//   }
// }

// class MyFrame55 extends Frame {
// 	MyFrame55(String s) {
// 		super(s);
// 		setLayout(null);
// 		setBounds(300, 300, 400, 300);
// 		this.setBackground(new Color(204, 204, 255));
// 		setVisible(true);
		
// 		this.addWindowListener(new MyWindowMonitor());
		
//     /*
//     this.addWindowListener(
//     new WindowAdapter() {
//       public void windowClosing(WindowEvent e) {
//         setVisible(false);
//         System.exit(-1);
//       }
//     });
//     */
	
// 	}
  
// 	class MyWindowMonitor extends WindowAdapter {
// 		public void windowClosing(WindowEvent e) {
// 			setVisible(false);
// 			System.exit(0);
// 		}
// 	}
  
// }


// /*	范例名称：Graphics 应用举例
//  * 	源文件名称：TestPaint.java
//  *	要  点：Graphics中自动执行的概念
//  */
// import java.awt.*;

// public class Test_11_19 {
// 	public static void main(String[] args) {
// 		new PaintFrame().launchFrame();
// 	}
// }

// class PaintFrame extends Frame {
	
// 	public void launchFrame() {
// 		setBounds(200,200,640,480);
// 		setVisible(true);
// 	}
	
// 	public void paint(Graphics g) {
// 		Color c = g.getColor();
// 		g.setColor(Color.red);
// 		g.fillOval(50, 50, 30, 30);
// 		g.setColor(Color.green);
// 		g.fillRect(80,80,40,40);
// 		g.setColor(c);
// 	}
	
// }


// import java.util.Scanner;
// public class Test_11_19{   
// 	public static void main(String[] args){
// 	Scanner sc=new Scanner(System.in);
// 	System.out.println("请输入内容:");
// 	String s= sc.nextLine();
// 	System.out.println("您输入了:"+ s); 
// 	}

// }



// import java.io.*;

// class prime{
//     void getprime(int m,int n,int a[]){
//         int i,j,k;
//         for(i=m,k=0;i<=n;i++){
//             for(j=2;j<=i/2;j++){
//                 if(i%j==0) break;  
//             }
//             if(j>i/2) a[k++]=i;
//         } 
//     }
//     public static void main(String[] args){

//         File primefile=new File("prime1.dat");
//         prime p=new prime();
//         int a[]=new int[50];
//         int i=0,c;
//         p.getprime(2,200,a);

//         try{  
//             DataOutputStream out=new DataOutputStream(new FileOutputStream("prime1.dat")); //创建文件输出字节流
//             DataInputStream in=new DataInputStream(new FileInputStream("prime1.dat"));//创建文件输入字节流  
//             while(a[i]!=0){
//                 out.write(a[i]); //写数据
//                 i++;//缺少这句，程序出现死循环
//             }
//             while((c=in.read())!=-1){
//                 System.out.print(c+"\t");
//             }
//             in.close();
//             out.close();
//         }
//         catch(IOException e){
//             e.printStackTrace();
//         }
//     }

// }



// import java.io.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Test_11_19 {
// 	public static void main(String[] args) {
// 		Judge j=new Judge();
// 		System.out.println(Arrays.toString(j.judge()));
// 		File file=new File("prime.dat");
// 		try{
// 			file.createNewFile(); 
// 			}
// 		catch(Exception e){
// 		}
// 		try{
// 			Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
// 			fw.write(Arrays.toString(j.judge()));
// 			System.out.println("文件已写入");
// 			fw.close();	
// 		}
// 		catch(IOException e){
//             e.printStackTrace();
//       }
// 	}
// }
// class Judge{
// 	Integer[] judge(){
// 	List<Integer> list=new ArrayList<Integer>();
// 	for(int i=2;i<=200;i++) {
// 			boolean flag=true;
// 			for(int j=2;j<i;j++) {
// 				if(i%j == 0) {
// 					flag=false;
// 					break;					
// 				}								
// 			}
// 			if(flag) {
// 				list.add(i);			
// 			}
// 		}
// 	Integer[] nsz=new Integer[list.size()];
// 	list.toArray(nsz);
// 	return nsz;
// 	}
// }

// import java.io.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Test_11_19 {
// 	public static void main(String[] args) {
// 		Judge j=new Judge();//调用Judge类来判断是否为复数
// 		System.out.println(Arrays.toString(j.judge()));
//         //将复数屏幕上显示出来

// 		File file=new File("prime.dat");
//         //创建文件prime.dat

// 		try {
//             file.createNewFile();
//             //创建一个新的空文件
//         } catch (IOException e) {
//             e.printStackTrace();
//             //打印异常信息在程序中出错的位置及原因
//         } 

// 		try{
// 			Writer p = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
//             //创建使用指定charset的OutputStreamWriter。

// 			p.write(Arrays.toString(j.judge()));
//             //写一个字符串。
// 			System.out.println("文件已写入");
// 			p.close();	
//             //关闭流。
// 		}
// 		catch(IOException e){
//             e.printStackTrace();
//             //打印异常信息在程序中出错的位置及原因
//       }
// 	}
// }
// class Judge{
// 	Integer[] judge(){
// 	List<Integer> list=new ArrayList<Integer>();
// 	for(int i=2;i<=200;i++) {
// 			boolean flag=true;
// 			for(int j=2;j<i;j++) {
// 				if(i%j == 0) {
// 					flag=false;
// 					break;					
// 				}								
// 			}
// 			if(flag) {
// 				list.add(i);			
// 			}
// 		}
// 	Integer[] nsz=new Integer[list.size()];
// 	list.toArray(nsz);
// 	return nsz;
// 	}
// }

import java.io.*;

public class Test_11_19 {

private Isprim sushu = null;

FileOutputStream fos = null;

public Test_11_19() {

try {

fos = new FileOutputStream("F://prime.dat");

sushu = new Isprim();

for(int i=2;i<=200;i++)

{

if(sushu.isPrim(i)){

fos.write(i);

System.out.println(i);

}

}

fos.close();

} catch (FileNotFoundException e) {

// TODO Auto-generated catch block

System.out.println("找不到指定文件"); System.exit(-1);

}catch (IOException e){

System.out.println("文件写入错误"); System.exit(-1);

}

System.out.println("文件写入完毕！");

}

public static void main(String[] args) {

Test_11_19 tip = new Test_11_19();

}

//定义Isprime类用于判断一个数是否是素数
