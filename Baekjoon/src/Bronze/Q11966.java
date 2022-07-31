package Bronze;

import java.util.Scanner;

public class Q11966 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans = -1;
		for(int i=0; i<=30; i++) {
			if(n==Math.pow(2, i)) {
				ans=1;
				break;
			}	
			else ans=0;
		}
		System.out.println(ans);
		
	}
}
