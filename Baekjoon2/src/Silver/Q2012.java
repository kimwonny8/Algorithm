package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q2012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		long sum=0;
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			sum+=Math.abs(arr[i]-(i+1));
		}
		System.out.println(sum);
	}
}