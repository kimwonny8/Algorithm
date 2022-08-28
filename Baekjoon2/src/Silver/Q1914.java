package Silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1914 {
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        BigInteger K=new BigInteger("2").pow(N).subtract(BigInteger.ONE); //원반 옮기는 횟수는 2의 N제곱-1
        sb.append(K+"\n");
        
        if(N<=20) hanoi(N, 1, 2, 3);
        System.out.print(sb);
        
    }
	public static void hanoi(int num, int from, int by, int to) {
        if(num==1) sb.append(from+" "+to+"\n");
        else {
            hanoi(num-1,from,to,by); // 1번에서 2번으로
            sb.append(from+" "+to+"\n");
            hanoi(num-1,by,from,to); // 2번에서 3번으로
        }
	}
}
