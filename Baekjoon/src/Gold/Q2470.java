package Gold;

import java.util.Arrays;
import java.util.Scanner;
 
public class Q2470 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        
        int max=Integer.MAX_VALUE, start=0, end=n-1;
        int ans1=-1, ans2=-1;
        
        Arrays.sort(arr);
        
        while(start<end) {
        	int sum=arr[start]+arr[end];
        	if(Math.abs(sum) < max) {
        		max=Math.abs(sum);
        		ans1=arr[start];
        		ans2=arr[end];
        	}
        	if(sum>0) end--;
        	else start++;
        }
        System.out.println(ans1+" "+ans2);
    }
}    
