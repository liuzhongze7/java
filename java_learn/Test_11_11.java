// import java.awt.*;

// import javax.swing.*;



// public class Test_11_11 {
// 	public static void main(String[] args) {
// 		JFrame frm = new JFrame("理解GUI编程"); // 创建容器
// 		frm.setBounds(500, 200, 800, 600);
// 		frm.setLayout(null);

// 		JLabel lb1=new JLabel("标签1");
// 		JLabel lb2=new JLabel("标签2");
// 		JLabel lb3=new JLabel("标签3");

// 		JTextField txt1 = new JTextField("");
// 		JTextField txt2 = new JTextField("");
// 		JTextField txt3 = new JTextField("");

// 		JButton myBtn = new JButton("出题");
// 		JButton myBtn1 = new JButton("计算");
// 		JButton myBtn2 = new JButton("结束");

		
// 		lb1.setBounds(200, 50, 60, 30);
// 		lb2.setBounds(300, 50, 60, 30);
// 		lb3.setBounds(400, 50, 60, 30);
		
// 		txt1.setBounds(200, 80, 60, 30);
// 		txt2.setBounds(300, 80, 60, 30);
// 		txt3.setBounds(400, 80, 60, 30);
		
// 		myBtn.setBounds(200, 110, 60, 30);
// 		myBtn1.setBounds(300, 110, 60, 30);
// 		myBtn2.setBounds(400, 110, 60, 30);


// 		frm.add(myBtn);
//         frm.add(myBtn1);
//         frm.add(myBtn2);

// 		frm.add(lb1);
// 		frm.add(lb2);
// 		frm.add(lb3);

// 		frm.add(txt1);
// 		frm.add(txt2);
// 		frm.add(txt3);

// 		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		frm.setVisible(true); 
// 	}
// }

// import java.awt.*;
// public class Test_11_11 {
// 	public static void main( String args[]) {
// 		Frame f = new Frame("山西工学院");
// 		f.setLocation(300, 300);
// 		f.setSize( 270,150);
// 		f.setBackground(Color.black);
// 		f.setBackground(Color.blue);
// 		//f.setBackground(new Color(255,255,0));
// 		f.setResizable(false);
// 		f.setVisible( true);
// 	}
// }

// /*	范例名称：Frame 应用举例
//  * 	源文件名称：TestMultiFrame.java
//  *	要  点：Frame组件的创建及显示设置
//  */
// import java.awt.*;

// public class Test_11_11 {
//     public static void main(String args[]) {
//         MyFrame f1 = new MyFrame(100,100,200,200,Color.BLUE);
//         MyFrame f2 = new MyFrame(300,100,200,200,Color.YELLOW);
//         MyFrame f3 = new MyFrame(100,300,200,200,Color.GREEN);
//         MyFrame f4 = new MyFrame(300,300,200,200,Color.MAGENTA);
//     }
// }

// class MyFrame extends Frame{
//     static int id = 0;
//     MyFrame(int x,int y,int w,int h,Color color){
//         super("MyFrame " + (++id));
//         setBackground(color);
//         setLayout(null);
//         setBounds(x,y,w,h);
//         setVisible(true);
//     }
// }


/*	范例名称：TestMultiPanel 应用举例
 * 	源文件名称：TestMultiPanel.java
 *	要  点：Panel组件的创建及显示设置
 */
import java.awt.*;
/*TestMultiPanel.java*/
public class Test_11_11 {
    public Test_11_11(String string) {
    }

    public Test_11_11() {
    }

    public static void main(String args[]) {
        new MyFrame2("MyFrameWithPanel",300,300,400,300);
    }
}


class MyFrame2 extends Frame{
    private Panel p1,p2,p3,p4;
    MyFrame2(String s,int x,int y,int w,int h){
        super(s);
        setLayout(null);
        
        p1 = new Panel(null);
        p2 = new Panel(null);
        p3 = new Panel(null);
        p4 = new Panel(null);
        
        p1.setBounds(0,0,w/2,h/2);
        p2.setBounds(0,h/2,w/2,h/2);
        p3.setBounds(w/2,0,w/2,h/2);
        p4.setBounds(w/2,h/2,w/2,h/2);
        
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.YELLOW);
        p4.setBackground(Color.MAGENTA);
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        
        setBounds(x,y,w,h);
        setVisible(true);
    }
}