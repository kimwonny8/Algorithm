package Silver;

import java.util.Scanner;

public class Q1527 {
	static long a,b,cnt=0;
	
	public static void solve(long num) {
		if(num>b) return;
		if(num>=a) cnt++;
		
		// 4와 7이 있는 숫자는 4와 7에 10곱한 후 각 숫자 더한 값 확인
		solve(num*10+4);
		solve(num*10+7);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a=sc.nextLong();
		b=sc.nextLong();
		
		solve(4);
		solve(7);
		System.out.println(cnt);
		
	}

}