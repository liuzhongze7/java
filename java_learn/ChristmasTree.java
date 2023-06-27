import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChristmasTree extends JPanel {
  public void paint(Graphics g) {
    // 设置背景色
    setBackground(Color.WHITE);
    
    // 设置画笔颜色
    g.setColor(Color.GREEN);
    
    // 画出圣诞树的三角形轮廓
    int[] xPoints = {200, 100, 300};
    int[] yPoints = {100, 300, 300};
    int nPoints = 3;
    g.fillPolygon(xPoints, yPoints, nPoints);
    
    // 画出圣诞树的圆形轮廓
    g.setColor(Color.RED);
    g.fillOval(180, 280, 40, 40);
    g.fillOval(220, 280, 40, 40);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new ChristmasTree());
    frame.setVisible(true);
  }
}
