package Bronze;

import java.util.Scanner;

public class Q2810 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int cnt=1;
		for(int i=0; i<n; i++) {
			char s=str.charAt(i);
			if(s=='S') cnt++;
			else if(s=='L') {
				cnt++;
				i++;
			}
		}
		System.out.println(cnt>n? n: cnt);
	}
}
