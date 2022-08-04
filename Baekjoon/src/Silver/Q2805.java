package Silver;

import java.util.Scanner;

public class Q2805 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(), m=sc.nextInt();
		int [] arr=new int[n];
		int max=-1, min=0;
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) max=arr[i];
		}
		
		// 이분 탐색
		while(min<max) {
			int mid=(min+max)/2;
			long sum=0;
			for(int i:arr) {
				if(i-mid>0) sum+=i-mid;
			}
			if(sum>=m) min=mid+1; // 자른 나무들의 합이 가져가야 할 길이보다 크면 ++
			else max=mid; 
		}
		System.out.println(min-1);
	}
}