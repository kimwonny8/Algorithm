package Silver;

import java.util.Scanner;

public class Q14494 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt(), m=sc.nextInt();
        long [][] dp=new long[n+1][m+1];
        long mod=1000000007;
        dp[1][1]=1;
        
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=m; j++) {
        		if(i*j!=1) {
        			dp[i][j]=((dp[i][j-1]%mod+dp[i-1][j]%mod+dp[i-1][j-1]%mod)%mod);
        		}
        	}
        }
        System.out.println(dp[n][m]%mod);
    }
}