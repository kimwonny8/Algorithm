package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int result=0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			result += sum;
		}
		System.out.println(result);
	}

}
