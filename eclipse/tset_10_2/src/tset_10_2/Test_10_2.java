package tset_10_2;

import java.util.Scanner;

public class Test_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("����");
		Scanner in = new Scanner(System.in);
// 		System.out.println("������" + in.nextLine());
		int prince;
		int amount;
		System.out.println("�����뱻����");
		amount = in.nextInt();
		System.out.println("���������");
		prince = in.nextInt();
		System.out.println(amount + " - " + prince + " = " + (amount - prince));
		
	}

}
