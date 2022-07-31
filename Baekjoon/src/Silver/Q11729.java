package Silver;

import java.util.Scanner;

public class Q11729 {
	static StringBuilder sb=new StringBuilder();
	static int cnt=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Move(n,1,2,3);
		sb.insert(0,cnt+"\n");
		System.out.println(sb);
	}
	
	public static void Move(int num, int start, int mid, int end) {
		cnt++;
		if(num==1) {
			sb.append(start+" "+end).append("\n");
		}
		else {
			Move(num-1, start, end, mid);
			sb.append(start+" "+end).append("\n");
			Move(num-1, mid, start, end);
		}
	}
}
