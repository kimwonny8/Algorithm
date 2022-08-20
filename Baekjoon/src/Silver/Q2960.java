package Silver;

import java.util.Scanner;

public class Q2960 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		boolean[] prime=new boolean[N+1];
		int cnt=0;
		
		for(int i=2; i<=N; i++) {
			for(int j=i; j<=N; j+=i) {
				if(prime[j]==false) {
					prime[j]=true;
					cnt++;
				}
				if(cnt==K) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
	}
}