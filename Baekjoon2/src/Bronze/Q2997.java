package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Q2997 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[3];
		for(int i=0; i<3; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int n=arr[1]-arr[0];
		int m=arr[2]-arr[1];
		
		if(n==m) {
			System.out.println(arr[2]+n);
		} else if(n<m) {
			System.out.println(arr[1]+n);
		} else {
			System.out.println(arr[0]+m);
		}
	}
}