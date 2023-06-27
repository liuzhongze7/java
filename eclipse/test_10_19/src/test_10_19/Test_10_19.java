package test_10_19;

public class Test_10_19 {


	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
		int a= (int) (Math.random() * 80+10);
        int b = (int) (Math.random() * (90-a)+10);
		int c = a+b;
		 System.out.printf("0.%d + 0.%d = 0.%d\n",a,b,c);
		}
	}

}
