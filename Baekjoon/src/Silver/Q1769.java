package Silver;

import java.util.Scanner;

public class Q1769 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int sum, cnt=0;
		while(true) {
			sum=0;
			if(n.length()==1) break;
			for(int i=0; i<n.length(); i++) {
			    sum+=Integer.parseInt(String.valueOf(n.charAt(i)));
			}
			cnt++;
			n=String.valueOf(sum);
		}
		System.out.println(cnt);
		if((Integer.parseInt(String.valueOf(n))%3==0)) System.out.println("YES");
		else System.out.println("NO");
	}
}
