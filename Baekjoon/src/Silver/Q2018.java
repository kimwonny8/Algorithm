package Silver;

import java.util.Scanner;

public class Q2018 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		if(n<=2) System.out.println(1);
		else {
			int sum=0, cnt=1;
			for(int i=1; i<=n/2+1; i++) {
				sum=0;
				for(int j=i; sum<n; j++) {
					sum+=j;
					if(sum==n) cnt++;
				}
		}
		System.out.println(cnt);
		}
	}
}
