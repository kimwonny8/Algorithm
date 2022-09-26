package Silver;

import java.util.Scanner;

public class Q9507 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		long[] dp=new long[68];
		int t=sc.nextInt();
		dp[0]=dp[1]=1; 
        dp[2]=2; 
        dp[3]=4;
		while(t-->0) {
			int n=sc.nextInt();
			if(dp[n]==0)
				for(int i=4; i<=n; i++)
					dp[i]=dp[i-2]+dp[i-3]+dp[i-4]+dp[i-1];
			sb.append(dp[n]+"\n");
		}
        System.out.print(sb);
	}
}