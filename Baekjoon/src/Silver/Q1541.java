package Silver;

import java.util.Scanner;

public class Q1541 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String [] arr=str.split("-");
		int value=0;
		
		for(int i=0; i<arr.length; i++) {
			String[] arr2=arr[i].split("\\+");
			
			int sum=0;
			for(int j=0; j<arr2.length; j++) {
				if(i==0) value+=Integer.parseInt(arr2[j]);
				else value-=Integer.parseInt(arr2[j]);
			}
		}
		System.out.println(value);
	}
}
