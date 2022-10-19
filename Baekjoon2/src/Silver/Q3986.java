package Silver;

import java.util.Scanner;
import java.util.Stack;

public class Q3986 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			Stack<Character> stack=new Stack<>();
			String str=sc.next();
			for(int j=0; j<str.length(); j++) {
				if(!stack.isEmpty() && str.charAt(j)==stack.peek()) stack.pop();
				else stack.push(str.charAt(j));
			}
			if(stack.size()==0)	cnt++;
		}
		System.out.println(cnt);
	}
}