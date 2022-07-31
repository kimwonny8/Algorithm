package Silver;

import java.util.Scanner;

public class Q3036 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			int b=sc.nextInt();
			int gcd=gcd(a,b);
			System.out.println((a/gcd)+"/"+(b / gcd));
		}
	}

	static int gcd(int a, int b){ // 최대공약수
		int r;
		while(b!=0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}