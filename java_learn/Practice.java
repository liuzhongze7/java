import java.util.Scanner; 
public class Practice { 
    public static void main(String[] args) { 
        int count = 0;
        //统计正确次数 
        int wrong = 0;
        //统计错误次数 
        int num = 0;
        //记录当前题号 
        Scanner sc = new Scanner(System.in); 
        System.out.println("开始做加法练习："); 
        while(true){
            //产生两个两位整数 
            int a = (int)(10 + (Math.random() * 80)); 
            int b = (int)(10 + (Math.random() * 80));
            int result = a + b; 
            System.out.println("第" + (++num) + "题：" + a + "+" + b + "= ?"); 
            int answer = sc.nextInt(); 
            while(answer != result){ 
                System.out.println("回答错误，请重新输入：");
                wrong++; answer = sc.nextInt(); } 
                System.out.println("回答正确！"); 
                count++; System.out.println("是否继续？（y/n）"); 
                String flag = sc.next(); 
                if(flag.equals("n")){ 
                    break; 
                } 
            } 
            System.out.println("正确次数：" + count); 
            System.out.println("错误次数：" + wrong); 
            System.out.println("正确率：" + (count * 1.0 / num) * 100 + "%"); 
            if(count * 1.0 / num >= 0.8){ 
                System.out.println("评价：优秀！"); 
            }else if(count * 1.0 / num >= 0.6){ 
                System.out.println("评价：良好！"); 
            }else{ 
                System.out.println("评价：需要努力！"); 
            } 
        } 
    }
//实现两位小数的加法运算 