package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920_BinarySearch {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int m=sc.nextInt();
		for(int i=0; i<m; i++) {
			int key=sc.nextInt();
			System.out.println(binarySearch(key, 0, arr.length-1));
		}
	}
	public static int binarySearch(int key, int low, int high) {
		int mid;
		
		if(low <= high) {
			mid = (low+high)/2;

			if(key == arr[mid])  return 1;
			else if(key < arr[mid]) return binarySearch(key ,low, mid-1);  
			else return binarySearch(key, mid+1, high); 
		}
		return 0;
	}
}
