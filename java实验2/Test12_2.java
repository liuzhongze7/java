import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  
public class Test12_2 {  
    static Boolean flag;  
    //创建flag记录点击
    public static void main(String[] args) {  
        flag =true;  
        JFrame frame =new JFrame ("山西工学院");  
        frame.setLayout(null);   
        //设置窗体的相关属性，默认布局为setLayout  

        frame.setBounds(60,100,400,200);  
        //设置窗体大小
        frame.setVisible(true);  
        //设置对象的可见状态。

        final JButton btn1=new JButton ("click me !"); 
        //设置初始标签click me !
        btn1.setBounds(100, 80, 200, 30);
        //设置按钮的位置大小
        frame.add(btn1);  
        //放置按钮
        
        btn1.addActionListener(new ActionListener() {  
        //对按钮进行监听
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