package Bronze;

import java.util.Scanner;

public class Q14659 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			int cnt=0;
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) cnt++;
				else break;
			}
			max=Math.max(max, cnt);	
		}
		System.out.println(max);
		
	}
}