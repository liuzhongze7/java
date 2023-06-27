
import java.util.Scanner;

public class Test3_2 {

    public static void main(String[] args) {
        System.out.printf("加法练习现在开始，共十题，每题有三次机会");
        try (Scanner sc = new Scanner(System.in)) {
            int x;
            int y;
            double answer;
            int score = 0;
            for (int i=0; i < 10; i++) {//进行10次循环表示共10题
                x = (int) (Math.random() * 80+10);//上限应为90下限为10
                y = (int) (Math.random() * (90-x)+10);//+号前面为随机范围0~（90-x）；+号后面为随机结束后增加数额
            
                System.out.printf("\033[H  \033[2J");//这里是实现清屏指令，为了实现进行下一题的操作
               //\033[H：将光标移动到屏幕或控制台的左上角。
               //\033[2J：从光标处清屏到屏幕末尾。
               //此处的清屏时为了之后如需做图形页面更方便
                System.out.printf("请输入第%d题0.%d+0.%d的答案：",i+1, x, y);
                for (int j=0; j < 3; j++) {//对应有三次机会
                    answer = sc.nextDouble();
                    if (answer*100 == x+y) {//检查答案正误
                        System.out.printf("回答正确，分数+10");
                        
                        try {//循环暂停，便于读题
                            Thread.sleep(1000);//此处为毫秒，1000毫秒=1秒
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        score += 10;
                        break;
                    } else if(2-j!=0){
                        score -= 3 ;
                        System.out.printf("回答错误，你还有%d次机会，请重新输入：",2-j);
                    }else if(2-j ==0){
                        score -= 3 ;
                        System.out.printf("你的三次回答都错误！！！\n正确结果应为0.%d+0.%d=0.%d",x,y,x+y);
                        try {//循环暂停，便于读题
                            Thread.sleep(5000);//此处为毫秒，1000毫秒=1秒
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }

                        System.out.printf("\033[H  \033[2J");
                    }

                }
            }
            System.out.printf("\033[H  \033[2J");
            System.out.println("考试结束，你的成绩为：" + score);
            switch (score/10) {
                case 10 -> System.out.println("满分");
                case 9 -> System.out.println("优秀");
                case 8 -> System.out.println("良好");
                case 7, 6 -> System.out.println("及格");
                default -> System.out.println("不及格");
            }
        }
        }
    }
