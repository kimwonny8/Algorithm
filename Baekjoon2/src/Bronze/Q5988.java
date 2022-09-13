package Bronze;

import java.util.Scanner;

public class Q5988 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		if(n!=0) {
			for(int i=0; i<n; i++) {
				String[] arr=sc.next().split("");
				sb.append(Integer.parseInt(arr[arr.length-1])%2==0?"even\n":"odd\n");
			}
		}
		System.out.println(sb);
	}

}