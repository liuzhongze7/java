package lanqiao_test;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class eg2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    //在此输入您的代码...
	    int num = scan.nextInt();
	    double yx = 0;
	    double jg = 0;
	    for(int i = 0; i < num; i++){
	        int a = scan.nextInt();
	        if(a >= 60){
	        	if(a >= 85){
	        		yx++;
	        	}
	            jg++;
	          }
	        }
	        System.out.println(Math.round(jg*100/num) + "%");
	        System.out.println(Math.round(yx*100/num) + "%");
	        scan.close();
	    }
	}
