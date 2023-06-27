package test_10_27;

public class Test_10_27 {

		    public static void main(String[] args) {
		 
		        Account wang = new Account(01,10000);
		  
		        wang.inquire();        
		        System.out.println();

		        wang.deposit(5000);      
		        System.out.println();

		        wang .deposit(20000);     
		        System.out.println();

		        wang .withdraw(3000.0);    
		        System.out.println();
		  }
		    
		}

		class Test_10_27{
		    private int ID;
		    private double number;
		    public Test_10_27(int name, int number) {
		        this.ID = name;
		      this.number = number;
		    }
		  public void setID(int a){
		   ID=a;
		  }
		  public int getID(){
		    return ID;
		  }
		  public void  setNumber(double b){
		  number=b;
		  
		  }
		 public  double getNumber() {
		  return number;
		 }

		    public void inquire() {
		        System.out.println("余额" + this.number);
		    }

		    public void deposit(int a) {
		        if(this.number - a >= 0) {
		            System.out.println("取款成功");
		            this.number -= a;
		            System.out.println(this.number);
		        }
		        else
		            System.out.println("余额不足");
		    }
		    public void withdraw(double d){
		     System.out.println("存款成功");
		        this.number -= d;
		        System.out.println(this.number);
		    }
		}

