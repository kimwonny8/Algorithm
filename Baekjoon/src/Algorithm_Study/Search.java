package Algorithm_Study;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=(int)(Math.random()*100);
		Arrays.sort(arr);
		System.out.println(BinarySearch(arr, 3));
	}
	
	static int BinarySearch(int[]arr, int target) {
		int mid, cnt=0;
		int first=0, last=arr.length-1;
		
		while(first<=last) {
			mid = (first+last)/2;
			
			System.out.printf("탐색횟수 %d번, first=%d, last=%d\n",cnt,first,last);
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) {
				cnt++; last=mid-1; 
			}
			else {
				cnt++; first=mid+1;
			}
			// -1, +1 안해주면 무한루프
		}
		return -1;
	}
}
