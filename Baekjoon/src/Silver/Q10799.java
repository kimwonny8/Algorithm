package Silver;

import java.util.Scanner;
import java.util.Stack;

public class Q10799 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Integer> stack=new Stack<>();
		
		int cnt=0;
		for(int i=0; i<str.length(); i++) {		
			if(str.charAt(i)=='(') stack.push(i);
			else {
				stack.pop();
				if(str.charAt(i-1)=='(') cnt+=stack.size();
				// 바로 전 문자가 '('라면 레이저므로 사이즈만큼 더함
				else cnt++;
				// 아니면 닫힌 문자열이므로 1만 더함
			}
		}
		System.out.println(cnt);
	}
}