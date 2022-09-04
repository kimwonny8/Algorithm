package Silver;

import java.util.Scanner;

public class Q9613 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		StringBuilder sb=new StringBuilder();
		
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			long sum=0;
			
			for(int i=0; i<n; i++) arr[i]=sc.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=i; j<n; j++) {
					if(i!=j) sum+=gcd(arr[i],arr[j]);
				}
			}
			sb.append(sum+"\n");
		}
		System.out.print(sb);
		
	}
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
}
