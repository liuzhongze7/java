
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.printf("\033[H  \033[2J");//������ʵ������ָ��
        //\033[H��������ƶ�����Ļ�����̨�����Ͻǡ�
        //\033[2J���ӹ�괦��������Ļĩβ��
        //�˴�������ʱΪ��֮��������ͼ��ҳ�������

        
        System.out.printf("����¼���һ����Ϣ\n�����˻�id�����������룬���\n");
        Scanner sc1 = new Scanner(System.in);//�����˻���Ϣ
        Account acc = new Account(sc1.nextInt(), sc1.next(), sc1.nextInt(), sc1.nextInt());
        Balance bal = new Balance(acc.getId(),acc.name, acc.getPassword(), acc.getNumber());
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-------------��ӭ���������˻�����ϵͳ-------------");
            System.out.println("--welcome to the Bank Account Operating System--");
            System.out.println("--------------1��ѯ���(getbalance)--------------");
            System.out.println("--------------2ȡ�����(withdraw)----------------");
            System.out.println("--------------3������(withdraw)----------------");
            System.out.println("--------------4¼����Ϣ(enterInformation)--------");
            System.out.println("--------------0�˳�ϵͳ(quit)--------------------");
            System.out.println("------------------------------------------------");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {//��ѡ��ṹ������ͼ�ν���Ĺ���ѡ��
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("--------------1��ѯ���(getbalance)--------------");
                    bal.getbalance();
                    break;
                case 2:
                    System.out.println("--------------2ȡ�����(withdraw)----------------");
                    bal.withdraw();
                    break;
                case 3:
                    System.out.println("--------------3������(withdraw)----------------");
                    int inNum = sc1.nextInt();
                    bal.deposit(inNum);
                    break;
                case 4:                   
                    System.out.println("--------------4¼����Ϣ(enterInformation)--------");
                    acc.enterInformation();
                    break;
                default:
                    System.out.println("����ѡ������������ѡ��");
                    break;
            }
        }
    }
}
class Account {
	private int id;//ʹ��private������Ա����
	public String name;
    private int number;
    private int password;

	
    public Account(int id, String name, int password, int number) {
        this.setId(id);//ʹ��get/set��ʵ�ֵ���
        this.name = name;
        this.setPassword(password);
        this.setNumber(number);
    }

    public void enterInformation() {//ʵ��¼����Ϣ
        System.out.printf("�����˻�id�����������룬���\n");
        Scanner sc = new Scanner(System.in);//�����˻���Ϣ
        setId(sc.nextInt());
        name = sc.next();
        setPassword(sc.nextInt());
        setNumber(sc.nextInt());
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
class Balance extends Account{
    public Balance(int id, String name, int password, int number) {
        super(id, name, password, number);
    }
    public void getbalance() {//ʵ�ֲ�ѯ����
        System.out.println("�˺ţ�" + getId());
        System.out.println("������" + name);
        System.out.println("��" + getNumber());
    }
    public void withdraw() {//ʵ�ִ�Ǯ����
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("���������������֤��");
            int pass = sc.nextInt();
            if (pass == getPassword()) {
                System.out.println("��������Ҫȡ��Ľ�");
                int withdrawals = sc.nextInt();
                if (withdrawals <= getNumber()) {
                    setNumber(getNumber() - withdrawals);
                    System.out.println("�˻���" + getNumber());
                } else {
                    System.out.println("��ǰ���㣡");
                }
                break;
            } else {
                
                System.out.println("������������������������룡");
            }
            
        }
    }
    public void deposit(int inmoney) {//ʵ��ȡǮ����
        setNumber(getNumber() + inmoney);
        System.out.println("�˴δ��Ϊ��" + inmoney);
        System.out.println("�˻���" + getNumber());
    }

}