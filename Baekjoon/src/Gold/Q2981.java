package Gold;

import java.util.Arrays;
import java.util.Scanner;

public class Q2981 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		int value=arr[1]-arr[0];
		for(int i=2; i<n; i++) value=gcd(value, arr[i]-arr[i-1]);

		// 최대공약수 약수 찾기
		for(int i=2; i<=value; i++) {
			if(value%i==0) sb.append(i+" ");
		}
		System.out.println(sb);
	}
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}