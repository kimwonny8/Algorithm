package Silver;

import java.util.Scanner;

public class Q4948 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		boolean[] arr = new boolean[246913]; // n>123456 이므로 2n
		arr[0]=arr[1]=true;  // false 면 소수
		
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			for(int j=i*i; j<arr.length; j+=i) {
				arr[j]=true;
			}
		}
		
		while (true) {
			int n=sc.nextInt();
			if(n==0) break; 
			
			int cnt=0;
			for(int i=n+1; i<=2*n; i++) {
				if(!arr[i]) cnt++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}

}