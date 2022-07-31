package Silver;

import java.util.Scanner;
import java.util.Stack;

public class Q1874 {

	public static void main(String[] args) {
		Stack <Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		int end=0;
		
		for(int i=0; i<n; i++) {
			int input=sc.nextInt();
			
			if(input>end) {
				// 담아둔 값+1부터 입력받은 값까지 출력
				for(int j=end+1; j<=input; j++) {
					st.push(j);
					sb.append("+").append("\n");
				}
				end=input;
			}
			// top과 같지않을 때 No
			else if(st.peek()!=input) {
					System.out.println("NO");
					return;
			}
			st.pop();
			sb.append("-").append("\n");
			
		}
		System.out.println(sb);
	}

}
