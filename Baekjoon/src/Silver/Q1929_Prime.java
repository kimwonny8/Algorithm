package Silver;

import java.util.Scanner;

public class Q1929_Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		StringBuilder sb = new StringBuilder();
		
		int n=sc.nextInt(), m=sc.nextInt();
		boolean []arr=new boolean[m+1];
		// false 면 소수
		arr[0]=arr[1]=true;
		
		for(int i=2; i*i<=m; i++) {
			for(int j=i*i; j<=m; j+=i) {
				arr[j]=true;
			}
		}
		for(int i=n; i<=m; i++) {
			if(arr[i]==false)
				sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}
/* 2,3,5,7의 배수를 지우고 남은 수는 모두 소수 */