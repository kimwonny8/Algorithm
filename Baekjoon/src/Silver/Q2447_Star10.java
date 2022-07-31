package Silver;

import java.util.Scanner;
//Àç±Í º°Âï±â10
public class Q2447_Star10 {
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				test(i,j);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void test(int x, int y) {
		if(x<3 && y<3) {
			if(x%3==1 && y%3==1) sb.append(" ");
			else sb.append("*");
		} else {
			if(x%3==1 && y%3==1) sb.append(" ");
			else test(x/3,y/3);
			
		}
	}
}