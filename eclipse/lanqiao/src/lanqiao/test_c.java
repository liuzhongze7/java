package lanqiao;

import java.util.Scanner;

public class test_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[26];
		for(int i = 0;i < s.length();i++) {
			arr[s.charAt(i) - 'A']++;
		}
		int max = Integer.MAX_VALUE;
		for(int i = 0;i < 26;i++) {
			max = Math.max(max, arr[i]);
		}
		for (int i = 0; i < 26; i++) {
	           if(arr[i] == max) System.out.print((char) (i+'A'));
	       }

	}
}
