package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q11931 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		for(int i=n-1; i>=0; i--) sb.append(arr[i]).append("\n");
		System.out.println(sb);
	}
}