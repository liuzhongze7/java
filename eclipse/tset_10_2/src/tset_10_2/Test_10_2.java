package tset_10_2;

import java.util.Scanner;

public class Test_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("中文");
		Scanner in = new Scanner(System.in);
// 		System.out.println("刘钟泽" + in.nextLine());
		int prince;
		int amount;
		System.out.println("请输入被减数");
		amount = in.nextInt();
		System.out.println("请输入减数");
		prince = in.nextInt();
		System.out.println(amount + " - " + prince + " = " + (amount - prince));
		
	}

}
