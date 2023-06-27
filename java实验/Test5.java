
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.printf("\033[H  \033[2J");//这里是实现清屏指令
        //\033[H：将光标移动到屏幕或控制台的左上角。
        //\033[2J：从光标处清屏到屏幕末尾。
        //此处的清屏时为了之后如需做图形页面更方便

        
        System.out.printf("请先录入第一个信息\n输入账户id，姓名，密码，金额\n");
        Scanner sc1 = new Scanner(System.in);//输入账户信息
        Account acc = new Account(sc1.nextInt(), sc1.next(), sc1.nextInt(), sc1.nextInt());
        Balance bal = new Balance(acc.getId(),acc.name, acc.getPassword(), acc.getNumber());
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-------------欢迎进入银行账户操作系统-------------");
            System.out.println("--welcome to the Bank Account Operating System--");
            System.out.println("--------------1查询余额(getbalance)--------------");
            System.out.println("--------------2取款操作(withdraw)----------------");
            System.out.println("--------------3存款操作(withdraw)----------------");
            System.out.println("--------------4录入信息(enterInformation)--------");
            System.out.println("--------------0退出系统(quit)--------------------");
            System.out.println("------------------------------------------------");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {//用选择结构，进行图形界面的功能选择
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("--------------1查询余额(getbalance)--------------");
                    bal.getbalance();
                    break;
                case 2:
                    System.out.println("--------------2取款操作(withdraw)----------------");
                    bal.withdraw();
                    break;
                case 3:
                    System.out.println("--------------3存款操作(withdraw)----------------");
                    int inNum = sc1.nextInt();
                    bal.deposit(inNum);
                    break;
                case 4:                   
                    System.out.println("--------------4录入信息(enterInformation)--------");
                    acc.enterInformation();
                    break;
                default:
                    System.out.println("您的选择有误！请重新选择");
                    break;
            }
        }
    }
}
class Account {
	private int id;//使用private保护成员变量
	public String name;
    private int number;
    private int password;

	
    public Account(int id, String name, int password, int number) {
        this.setId(id);//使用get/set来实现调用
        this.name = name;
        this.setPassword(password);
        this.setNumber(number);
    }

    public void enterInformation() {//实现录入信息
        System.out.printf("输入账户id，姓名，密码，金额\n");
        Scanner sc = new Scanner(System.in);//输入账户信息
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
    public void getbalance() {//实现查询功能
        System.out.println("账号：" + getId());
        System.out.println("姓名：" + name);
        System.out.println("金额：" + getNumber());
    }
    public void withdraw() {//实现存钱功能
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码进行验证！");
            int pass = sc.nextInt();
            if (pass == getPassword()) {
                System.out.println("请输入需要取款的金额：");
                int withdrawals = sc.nextInt();
                if (withdrawals <= getNumber()) {
                    setNumber(getNumber() - withdrawals);
                    System.out.println("账户余额：" + getNumber());
                } else {
                    System.out.println("当前余额不足！");
                }
                break;
            } else {
                
                System.out.println("你输入的密码有误，请重新输入！");
            }
            
        }
    }
    public void deposit(int inmoney) {//实现取钱功能
        setNumber(getNumber() + inmoney);
        System.out.println("此次存款为：" + inmoney);
        System.out.println("账户余额：" + getNumber());
    }

}