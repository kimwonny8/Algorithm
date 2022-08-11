package Bronze;

import java.util.Scanner;

public class Q1032 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		String[] arr=new String[n];
		boolean isSame=true;
		for(int i=0; i<n; i++) arr[i]=sc.next();	

		for(int i=0; i<arr[0].length(); i++) {
			char c=arr[0].charAt(i);
			isSame=true;
			
			for(int j=1; j<n; j++) {
				if(c!=arr[j].charAt(i)) {
					isSame=false;
					break;
				}
			}
			sb.append(isSame==true? c:'?');
		}
		System.out.println(sb);
	}
}
