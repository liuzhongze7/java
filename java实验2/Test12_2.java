import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  
public class Test12_2 {  
    static Boolean flag;  
    //����flag��¼���
    public static void main(String[] args) {  
        flag =true;  
        JFrame frame =new JFrame ("ɽ����ѧԺ");  
        frame.setLayout(null);   
        //���ô����������ԣ�Ĭ�ϲ���ΪsetLayout  

        frame.setBounds(60,100,400,200);  
        //���ô����С
        frame.setVisible(true);  
        //���ö���Ŀɼ�״̬��

        final JButton btn1=new JButton ("click me !"); 
        //���ó�ʼ��ǩclick me !
        btn1.setBounds(100, 80, 200, 30);
        //���ð�ť��λ�ô�С
        frame.add(btn1);  
        //���ð�ť
        
        btn1.addActionListener(new ActionListener() {  
        //�԰�ť���м���
            public void actionPerformed(ActionEvent e) {  
                if (flag){  
                    btn1.setText("click me again ! ");
                    flag=false;  
                }  
                else{  
                    btn1.setText("click me !"); 
                    flag=true;  
                }  
            }  
        } );
    }     
} 