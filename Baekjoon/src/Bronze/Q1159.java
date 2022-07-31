package Bronze;

import java.util.Scanner;

public class Q1159 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[26];
		
		for(int i=0; i<n; i++) {
			String s=sc.next();
			char a=s.charAt(0);
			arr[a-97]++;
		}
		
		boolean sign=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=5) {
				sign=true;
				System.out.print((char)(i+97));
			}
		}
		if(!sign) System.out.println("PREDAJA");
	}

}
