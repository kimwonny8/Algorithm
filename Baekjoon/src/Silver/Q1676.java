package Silver;

import java.util.Scanner;

public class Q1676 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1; i<=n; i++) {
			cnt+=n/5;
			n/=5;
		}
		System.out.println(cnt);
	}

}
