package Silver;

import java.util.Scanner;

public class Q11653 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
				n=n/i;
				i=1;
			}
		}
	}
}
