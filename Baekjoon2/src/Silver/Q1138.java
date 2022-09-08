package Silver;

import java.util.Scanner;

public class Q1138 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		int [] arr=new int[n];
		int [] arr2=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int num=arr[i];
			for(int j=0; j<=num; j++) {
				if(arr2[j]!=0 && arr2[j]<i+1) num++;
			}
			arr2[num]=i+1;
		}
		for(int i: arr2) sb.append(i+" ");
		System.out.println(sb);
	}
}
