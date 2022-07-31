package Bronze;

import java.util.Scanner;

public class Q2592 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= new int[10];		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		int value=0;
		int [] index = new int[1001];
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			index[arr[i]]++;
		}
		
		for(int i=0; i<index.length; i++) {
			if(index[i]>max) {
				max=index[i];
				value=i;
			}
		}	
		System.out.println(sum/arr.length);
		System.out.println(value);
	}

}
