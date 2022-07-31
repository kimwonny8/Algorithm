package Silver;

import java.util.Arrays;
import java.util.Scanner;

// 숫자카드
public class Q10816 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		arr=new int[n];
		
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		Arrays.sort(arr);

		int m=sc.nextInt();
		for(int i=0; i<m; i++) {
			int a=sc.nextInt(), cnt=0;
			int low=lower(a), high=upper(a);
			if(low!=-1) cnt+=high-low;
			sb.append(cnt+" ");
		}
		System.out.println(sb);
		

	}
	static int lower(int num) {
		int start = 0, last = arr.length, mid;
		while(start<last) {
			mid = start + (last-start)/2;
			if(num <= arr[mid]) last = mid;
			else start = mid+1;	
		}
		return start;
	}
	
	static int upper(int num) {
		int start = 0, last = arr.length, mid;
		while(start < last) {
			mid = start + (last-start)/2;
			if(num >=arr[mid]) start = mid +1;
			else last = mid;
		}
		return start;
	}
}
