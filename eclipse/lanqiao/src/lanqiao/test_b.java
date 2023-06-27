package lanqiao;

import java.util.Iterator;

public class test_b {
    public static void main(String[] args) {
    	long start = System.currentTimeMillis();
    	int count = 0;
    	for(int i = 2022;i <= 2022222022;i++) {
    		if(isPlindrome(i) && check(i)) {
    			count++;
    		}
    	}
    	long end = System.currentTimeMillis();
    	System.out.println(count);
    	System.out.println("����ʱ" + (end - start) / 1000 % 60 + "��");
    }
    private static boolean check(int num) {
    	String s = num + "";
    	for(int i = 0 ; i < s.length()/2 ;i++) {
    		if(s.charAt(i)>s.charAt(i+1))return false;
    	}
    	return true;
    }
    
    private static boolean isPlindrome(int num) {
		String s = num + "";
		int r = s.length() - 1;
		for(int l = 0 ;l < r;l++,r--) {
			if(s.charAt(l) != s.charAt(r))return false;
		}
		return true;
	}
}
