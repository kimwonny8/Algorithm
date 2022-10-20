package Bronze;

import java.util.Scanner;

public class Q5524 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		while(n-- > 0) {
			String str=sc.next();
			sb.append(str.toLowerCase()+"\n");
		}
		System.out.print(sb);
	}
}