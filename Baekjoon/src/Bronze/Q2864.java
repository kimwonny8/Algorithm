package Bronze;

import java.util.Scanner;

public class Q2864 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		int max=a+b, min=a+b;
		int t=1;
		
		while(a>0) {
			if(a%10==5)	max+=t;
			if(a%10==6) min-=t;
			a/=10;
			t*=10;
		}
		t=1;
		while(b>0) {
			if(b%10==5) max+=t;
			if(b%10==6) min-=t;
			b/=10;
			t*=10;
		}
		System.out.println(min+" "+max);
	}

}
