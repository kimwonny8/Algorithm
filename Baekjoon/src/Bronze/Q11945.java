package Bronze;

import java.util.Scanner;

public class Q11945 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt(), m=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(m!=0) {
				char [] arr=new char[m];
				String s=sc.next();
				for(int j=0; j<m; j++) arr[j]=s.charAt(j);
				for(int j=m-1; j>=0; j--) sb.append(arr[j]);
				sb.append("\n");
			}
		}
		System.out.println(sb);
		
	}
 
}