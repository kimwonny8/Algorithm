package Bronze;

import java.util.Scanner;

public class Q2292 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int n=sc.nextInt();
		int cnt=1, range=2;
 
		if(n==1) System.out.print(1);
		else {
			while(range<=n) {	
				range=range+(6*cnt);	 
				cnt++;	// cnt 1 Áõ°¡ 
			}
			System.out.print(cnt);
		}
	}
}