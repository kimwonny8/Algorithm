package Bronze;

import java.util.Scanner;

public class Q15814 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		String S=sc.next();
		int T=sc.nextInt();
		char [] arr=S.toCharArray();
				
		while(T-->0) {
			int A=sc.nextInt(), B=sc.nextInt();
			char tmp=arr[A];
			arr[A]=arr[B];
			arr[B]=tmp;
		}
		for(int i=0; i<arr.length; i++) sb.append(arr[i]);
		
		System.out.print(sb);
	}
}
