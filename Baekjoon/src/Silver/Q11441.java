package Silver;

import java.util.Scanner;

public class Q11441 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		
		int m=sc.nextInt();
		for(int i=0; i<m; i++) {
			int p1=sc.nextInt()-1, p2=sc.nextInt()-1;
			int sum=0;
			while(p1<=p2) {
				sum+=arr[p1];
				p1++;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}