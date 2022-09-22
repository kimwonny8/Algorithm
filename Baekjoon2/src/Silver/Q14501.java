package Silver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q14501 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n=sc.nextInt();
        int max=0;
        int[] t=new int[n+15];
        int[] p=new int[n+15];
        int[] dp=new int[n+15];
        
        for(int i=0; i<n; i++) {
        	t[i]=sc.nextInt();
        	p[i]=sc.nextInt();
        }
        
        for(int i=0; i<=n; i++) {
        	dp[i]=Math.max(dp[i], max);
        	// 지금까지 계산한 값 vs 지금 해야 할 계산 중 큰 값을 해당 dp에 넣어줌
        	dp[t[i]+i]=Math.max(dp[t[i]+i], p[i]+dp[i]);
			
        	max=Math.max(max,dp[i]);
        }
        
        bw.write(String.valueOf(max));
        bw.flush();
    }
}