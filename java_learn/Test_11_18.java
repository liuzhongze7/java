// /*	范例名称：Frame 应用举例
//  * 	源文件名称：TestFrame.java
//  *	要  点：Frame组件的创建及显示设置，组件的添加方式
//  */

// import java.awt.*;
// public class Test_11_18 {
// public static void main(String[] args) {	//创建容器和设置布局
	

//     Frame frm=new Frame("理解AWT");
// 	frm.setLayout(null);
//     frm.setBounds(200, 100, 800, 600);
//     //frm.setLayout(new BorderLayout());	//创建组件，并添加到容器中 
// 	frm.setVisible(true);
    
//     try {
//             Thread.sleep(5000);
//         } catch (InterruptedException e) {
            
//                 e.printStackTrace();
//             }
//             Button myBtn1=new Button("按钮1");
//             myBtn1.setBounds(200, 100, 50, 30);
//             //Button myBtn2=new Button("按钮2");
//             //frm.add(myBtn1,"West");
//             frm.add(myBtn1);
//             //frm.add(myBtn2);
            
//             //frm.add(myBtn1,BorderLayout.WEST);
//             //frm.add(myBtn2,"East");
            
//             //设置结构(Frame)的位置与大小并显示
//             frm.setBounds(400, 200, 400,200);
//             //frm.setVisible(true);
//         }
//     }
    
// /*	范例名称：Frame 应用举例
//  * 	源文件名称：TestFrame.java
//  *	要  点：Frame组件的创建及显示设置，组件的添加方式
//  */

// import java.awt.*;

// public class Test_11_18{
// 	public static void main(String[] args) {//创建容器和设置布局
// 		int x = 0,y = 0,width = 100,height = 50;
		
// 		Frame frm = new Frame("理解AWT");
// 		frm.setLayout(null);
// 		frm.setBounds(200, 100, 800, 600);
//         frm.setVisible(true);
// 		Button btn=new Button("按钮1");

//         // while(x<600){//从左向右动
//         //     btn.setBounds(x, 300, 100, 30);
//         //     frm.add(btn);
//         //     x++;
//         // 	try {
// 		// 		Thread.sleep(5);
// 		// 	} catch (InterruptedException e) {
// 		// 		e.printStackTrace();
// 		// 	}
//         // }
//         while(y<600){//从上向下动
//             btn.setBounds(400, y, 100, 50);
//             frm.add(btn);
//             y++;
//         	try {
// 				Thread.sleep(0);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
//         }

//         while(y>0){//从下向上动
//             btn.setBounds(400, y, width, height);
//             frm.add(btn);
//             y--;
//         }
//         if(width<200){
//             width+=2;
//             height++;
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
		
		
// 		// while(x<500){
// 		// 	frm.setLocation(x, 100);
// 		// 	x++;
// 		// 	try {
// 		// 		Thread.sleep(10);
// 		// 	} catch (InterruptedException e) {
// 		// 		e.printStackTrace();
// 		// 	}
// 		// }

// 	}
//     }


// /*	范例名称：Frame 应用举例
//  * 	源文件名称：TestFrame.java
//  *	要  点：Frame组件的创建及显示设置，组件的添加方式
//  */

// import java.awt.*;

// public class Test_11_18{
// 	public static void main(String[] args) {//创建容器和设置布局
//         boolean fx = true;
//         int y=0;
        
// 		Frame frm = new Frame("理解AWT");
// 		frm.setLayout(null);
// 		frm.setBounds(200, 100, 800, 600);
		
// 		Button btn=new Button("按钮1");
// 		btn.setBounds(400, 0, 100, 30);
		
// 		frm.add(btn);
		
// 		frm.setVisible(true);

// 		while(true){
			
// 			if(fx){//解决移动方向
// 				if(y<570)
// 					y++;
// 				else
// 					fx = false;
// 			}
// 			else{
// 				if(y>30)
// 					y--;
// 				else
// 					fx = true;
// 			}
			
// 			try {//时间处理
// 				Thread.sleep(5);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}			
// 			btn.setLocation(400, y);
// 		}//循环功能,实现移动效果 
// 	}//main方法
// }//类的定义

// import java.awt.*;

// public class Test_11_18 {
//     public static void main(String args[]) {
	
//         MyFrame f1 = new MyFrame(100,100,200,200,Color.BLUE);
// 		Thread f11 = new Thread(f1);
// 		//f11.start();
// 		f11.run();
		
//         MyFrame f2 = new MyFrame(300,100,200,200,Color.YELLOW);
// 		Thread f12 = new Thread(f2);
// 		//f12.start();
// 		f12.run();
		
//         MyFrame f3 = new MyFrame(100,300,200,200,Color.GREEN);
// 		Thread f13 = new Thread(f3);
// 		//f13.start();
// 		f13.run();
		
//         MyFrame f4 = new MyFrame(300,300,200,200,Color.MAGENTA);
// 		Thread f14 = new Thread(f4);
// 		//f14.start();
// 		f14.run();
// 		}
// }


// class MyFrame extends Frame implements Runnable {
//     static int id = 0;
//     MyFrame(int x,int y,int w,int h,Color color){
//         super("MyFrame " + (++id));
//         setBackground(color);
//         setLayout(null);
//         setBounds(x,y,w,h);
//         setVisible(true);
//     }
	
// 	public void run(){
// 		try{
// 			Thread.sleep(1000);			
// 		}catch(InterruptedException e){
// 			return;
// 		}
// 	}
// }

// import java.awt.*;
// public class Test_11_18 {
// 	public static void main(String args[]) {
// 		Frame f;
// 		f = new Frame("Border Layout");
// 		Button bn = new Button("BN");
// 		Button bs = new Button("BS");
// 		Button bw = new Button("BW");
// 		Button be = new Button("BE");
// 		Button bc = new Button("BC");
		
// 		// f.add(bn, "North");
// 		// f.add(bs, "South");
// 		// f.add(bw, "West");
// 		// f.add(be, "East");
// 		// f.add(bc, "Center");
		
		
// 		// 也可使用下述语句
		
// 		f.add(bn, BorderLayout.NORTH);
// 		f.add(bs, BorderLayout.SOUTH);
// 		f.add(bw, BorderLayout.WEST);
// 		f.add(be, BorderLayout.EAST);
// 		f.add(bc, BorderLayout.CENTER);
		
		
// 		f.setSize(200,200);
// 		f.setVisible(true);
// 	}
// }

// import java.awt.*;
// public class Test_11_18 {
// 	public static void main(String args[]) {
//         Frame f = new Frame("GridLayout Example");
//         Button b1 = new Button("b1");
//         Button b2 = new Button("b2");
//         Button b3 = new Button("b3");
//         Button b4 = new Button("b4");
//         Button b5 = new Button("b5");
//         Button b6 = new Button("b6");
//         f.setLayout (new GridLayout(3,2));
//         f.add(b1);        
//         f.add(b2);
//         f.add(b3);        
//         f.add(b4);
//         f.add(b5);        
//         f.add(b6);
//         f.pack();          
//         f.setVisible(true);
// 	}
// }

public class Test_11_18 {
	public static void main(String[] args) {
		Lady missLiu= new Lady();
		missLiu.pet = new Dog2();
		missLiu.petEnjoy();		
		Lady missWang= new Lady();
		missWang.pet = new Bird();
		missWang.petEnjoy();		
	}
}
class Lady{
	Pet pet;
	void petEnjoy(){
		pet.enjoy();
	}
}
class Pet{
	int name;
	void enjoy(){
		System.out.println("宠物高兴");
	}
}
class Bird extends Pet{
	void enjoy(){
		System.out.println("喳喳......");
	}	
}
class Dog2 extends Pet{
	void enjoy(){
		System.out.println("汪汪.....");
	}
	
}