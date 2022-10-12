package Bronze;

import java.util.Scanner;

public class Q25494 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T-->0) {
			int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
			int cnt=0;
			for(int i=1; i<=a; i++) {
				for(int j=1; j<=b; j++) {
					for(int k=1; k<=c; k++) {
						if(i%j == j%k && j%k == k%i) cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
