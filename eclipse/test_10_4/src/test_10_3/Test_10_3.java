package test_10_3;

import java.util.Scanner;

public class Test_10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println((int)((foot + inch /12)*0.3048*100) + "cm");
					
	}

}
