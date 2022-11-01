package Bronze;

import java.util.Scanner;

public class Q25893 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		while(n-- > 0) {
			int cnt=0;
			for(int i=0; i<3; i++) {
				int num=sc.nextInt();
				sb.append(num+" ");
				if(num >= 10) cnt++;
			}
			if(cnt == 1) sb.append("\ndouble");
			else if(cnt == 2) sb.append("\ndouble-double");
			else if(cnt == 3) sb.append("\ntriple-double");
			else sb.append("\nzilch");
			
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}