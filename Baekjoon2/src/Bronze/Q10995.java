package Bronze;

import java.util.Scanner;

public class Q10995 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();		
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n*2; j++) {
				if(i%2==0) {
					if(j%2==0) sb.append("*");
					else sb.append(" ");	
				}
				else {
					if(j%2==0) sb.append(" ");
					else sb.append("*");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	
	}
}