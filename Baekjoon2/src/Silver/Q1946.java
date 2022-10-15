package Silver;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1946 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int []arr=new int[n];
			int cnt=1; // 서류 1등은 무조건 통과므로
			
			for(int i=0; i<n; i++) {
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				arr[num1-1]=num2;
			}
			int value=arr[0];
			for(int i=1; i<=n; i++) {  // 2등부터 시작
				if(value>arr[i-1]) {
					cnt++;
					value=arr[i-1];
				}
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
	}
}
