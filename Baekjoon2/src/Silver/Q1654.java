package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q1654 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int k=sc.nextInt(), n=sc.nextInt();
		int []arr=new int[k];
		
		for(int i=0; i<k; i++) 	arr[i]=sc.nextInt();
		Arrays.sort(arr);
		long max=arr[k-1], min=1, mid=0; 

		while(max>=min) { 
			mid=(max+min)/2;
			long cnt=0;
			for(int i=0; i<k; i++) {
				cnt+=(arr[i]/mid);
			}
			if(cnt<n) max=mid-1;
			else min=mid+1;
		}
		System.out.println(max);
	}
}
