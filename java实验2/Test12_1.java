import java.awt.*;

public class Test12_1 {
	public static void main(String[] args) {
		Frame frame=new Frame("Java Frame");
		//Ĭ��ʹ��GridLayout����
		frame.setBounds(100, 100, 500, 300);
		//���ô����С
		//frame.pack();

		frame.setVisible(true);
		//���ö���Ŀɼ�״̬

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
		//��ʼ��10����ť

		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		Panel p5=new Panel();
		//����5������

		p1.setLayout(new GridLayout(2,1));
		//��һ����������һ��
		//�Ҳ�
		p1.add(b1);
		p1.add(b2);

		p2.setLayout(new GridLayout(2,1));
		//�ڶ�����������һ��
		//����
		p2.add(b3);
		p2.add(b4);

		p3.setLayout(new GridLayout(2,2));
		//������������������
		//����
		p3.add(b5);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		
		p4.setLayout(new GridLayout(2,1));
		//�󲿷���
		p4.add(b9);
		p4.add(b10);

		p5.setLayout(new GridLayout(2,1));
		//�ϲ�P2 P3��������Ϊ�в�����
		p5.add(p2);
		p5.add(p3);

		frame.setLayout(new GridLayout());
		//�ڴ����з�����������������
		frame.add(p4);//��
		frame.add(p5);//��
		frame.add(p1);//��
		
	}
}