package Silver;

import java.util.Scanner;

public class Q14241 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();
		int[] arr=new int[cnt];
		
		for(int i=0; i<cnt; i++) arr[i]=sc.nextInt();
		
		int sum=0;
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				sum+=arr[i]*arr[j];
			}
		}
		System.out.println(sum);
	}
}
