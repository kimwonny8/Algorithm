package Bronze;

import java.util.Scanner;

public class Q10990 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j=0; j<2*i-1; j++) {
				sb.append(" ");
			}
			if(i>0) sb.append("*");

			sb.append("\n");
		}
		System.out.print(sb);
	}
}