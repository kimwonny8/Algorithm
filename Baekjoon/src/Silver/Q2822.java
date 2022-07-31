package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q2822 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[8];
		int [] arr2=new int[8];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			arr2[i]=arr[i];
		}
		Arrays.sort(arr2);
		int sum=arr2[3]+arr2[4]+arr2[5]+arr2[6]+arr2[7];
		System.out.println(sum);
		
		int [] result=new int[5];
		int cnt=0;
		
		for(int i=3; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==arr2[i]) {
					result[cnt] = j+1;
					cnt++;	
				}
					
			}
		}
		Arrays.sort(result);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
