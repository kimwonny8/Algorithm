package Bronze;

import java.util.Scanner;

public class Q25377 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=Integer.MAX_VALUE;
		
		while (n-- > 0) {
			int x=sc.nextInt(), y=sc.nextInt();
			if(x <= y) {
				ans = Math.min(ans, y);
			}
		}
		if(ans == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(ans);
		
	}

}