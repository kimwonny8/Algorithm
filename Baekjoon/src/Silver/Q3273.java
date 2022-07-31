package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q3273 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		int num=sc.nextInt();
		int start=0, end=n-1, sum=0,cnt=0;
		
		Arrays.sort(arr);

		 while(start<end){
	            sum=arr[start]+arr[end];
	            if(sum==num)
	                cnt++;
	            if (sum<=num) start++;
	            else end--;
	        }
		System.out.println(cnt);
	}
}