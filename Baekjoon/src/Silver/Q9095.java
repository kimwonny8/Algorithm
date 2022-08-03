package Silver;

import java.util.Scanner;

public class Q9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int T=sc.nextInt();

		for(int i=0; i<T; i++) {
			int n=sc.nextInt();
			
			int a=1, b=2, c=4;
			int sum=0;
			
			if(n==1) sb.append(a+"\n");
			else if(n==2) sb.append(b+"\n");
			else if(n==3) sb.append(c+"\n");
			else {
			for(int j=4; j<=n; j++) {
				sum=a+b+c;
				a=b; b=c; c=sum;
			}
			sb.append(sum+"\n");
		}
		}
		System.out.println(sb);
	}

}
