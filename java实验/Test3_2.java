
import java.util.Scanner;

public class Test3_2 {

    public static void main(String[] args) {
        System.out.printf("�ӷ���ϰ���ڿ�ʼ����ʮ�⣬ÿ�������λ���");
        try (Scanner sc = new Scanner(System.in)) {
            int x;
            int y;
            double answer;
            int score = 0;
            for (int i=0; i < 10; i++) {//����10��ѭ����ʾ��10��
                x = (int) (Math.random() * 80+10);//����ӦΪ90����Ϊ10
                y = (int) (Math.random() * (90-x)+10);//+��ǰ��Ϊ�����Χ0~��90-x����+�ź���Ϊ�����������������
            
                System.out.printf("\033[H  \033[2J");//������ʵ������ָ�Ϊ��ʵ�ֽ�����һ��Ĳ���
               //\033[H��������ƶ�����Ļ�����̨�����Ͻǡ�
               //\033[2J���ӹ�괦��������Ļĩβ��
               //�˴�������ʱΪ��֮��������ͼ��ҳ�������
                System.out.printf("�������%d��0.%d+0.%d�Ĵ𰸣�",i+1, x, y);
                for (int j=0; j < 3; j++) {//��Ӧ�����λ���
                    answer = sc.nextDouble();
                    if (answer*100 == x+y) {//��������
                        System.out.printf("�ش���ȷ������+10");
                        
                        try {//ѭ����ͣ�����ڶ���
                            Thread.sleep(1000);//�˴�Ϊ���룬1000����=1��
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        score += 10;
                        break;
                    } else if(2-j!=0){
                        score -= 3 ;
                        System.out.printf("�ش�����㻹��%d�λ��ᣬ���������룺",2-j);
                    }else if(2-j ==0){
                        score -= 3 ;
                        System.out.printf("������λش𶼴��󣡣���\n��ȷ���ӦΪ0.%d+0.%d=0.%d",x,y,x+y);
                        try {//ѭ����ͣ�����ڶ���
                            Thread.sleep(5000);//�˴�Ϊ���룬1000����=1��
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }

                        System.out.printf("\033[H  \033[2J");
                    }

                }
            }
            System.out.printf("\033[H  \033[2J");
            System.out.println("���Խ�������ĳɼ�Ϊ��" + score);
            switch (score/10) {
                case 10 -> System.out.println("����");
                case 9 -> System.out.println("����");
                case 8 -> System.out.println("����");
                case 7, 6 -> System.out.println("����");
                default -> System.out.println("������");
            }
        }
        }
    }
