import java.awt.*;

public class Test12_1 {
	public static void main(String[] args) {
		Frame frame=new Frame("Java Frame");
		//默认使用GridLayout布局
		frame.setBounds(100, 100, 500, 300);
		//设置窗体大小
		//frame.pack();

		frame.setVisible(true);
		//设置对象的可见状态

		Button b1=new Button("BUTTON");
		Button b2=new Button("BUTTON");
		Button b3=new Button("BUTTON");
		Button b4=new Button("BUTTON");
		Button b5=new Button("BUTTON");
		Button b6=new Button("BUTTON");
		Button b7=new Button("BUTTON");
		Button b8=new Button("BUTTON");
		Button b9=new Button("BUTTON");
		Button b10=new Button("BUTTON");
		//初始化10个按钮

		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		Panel p5=new Panel();
		//设置5个分区

		p1.setLayout(new GridLayout(2,1));
		//第一个分区两行一列
		//右侧
		p1.add(b1);
		p1.add(b2);

		p2.setLayout(new GridLayout(2,1));
		//第二个分区两行一列
		//中上
		p2.add(b3);
		p2.add(b4);

		p3.setLayout(new GridLayout(2,2));
		//第三个分区两行两列
		//中下
		p3.add(b5);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		
		p4.setLayout(new GridLayout(2,1));
		//左部分区
		p4.add(b9);
		p4.add(b10);

		p5.setLayout(new GridLayout(2,1));
		//合并P2 P3两个分区为中部分区
		p5.add(p2);
		p5.add(p3);

		frame.setLayout(new GridLayout());
		//在窗口中放着左中右三个分区
		frame.add(p4);//左
		frame.add(p5);//中
		frame.add(p1);//右
		
	}
}