package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q5800 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int m=sc.nextInt();
			int [] arr=new int[m];
			for(int j=0; j<m; j++) {
				arr[j]=sc.nextInt();
			}
			 
			Arrays.sort(arr);
			
			int gap = 0;
			for(int j=0; j<m-1; j++) {
				gap = Math.max(gap, arr[j+1]-arr[j]);
			}
			
			sb.append("Class "+(i+1)).append("\n");
			sb.append("Max "+arr[m-1]+", Min "+arr[0]+", Largest gap "+gap+"\n");
		}
		System.out.println(sb);
	}

}
