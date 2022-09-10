package Silver;

import java.util.Scanner;

public class Q1057 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt(), y=sc.nextInt();
		int cnt=0;
		while(x!=y) {
			x=(x/2)+(x%2);
			y=(y/2)+(y%2);
			cnt++;
		}
		System.out.println(cnt);
	}
}
