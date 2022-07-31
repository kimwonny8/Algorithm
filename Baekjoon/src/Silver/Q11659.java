package Silver;

import java.util.Scanner;

public class Q11659 {	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt(), m=sc.nextInt();
			int []arr=new int[n+1];
			for(int i=1; i<=n; i++) arr[i]=arr[i-1]+sc.nextInt(); 
			
			for(int i=0; i<m; i++) {
				int sum=0;
				int a=sc.nextInt(), b=sc.nextInt();
				sum=arr[b]-arr[a-1];
				sb.append(sum+"\n");
			}
			System.out.println(sb);
	}
}

