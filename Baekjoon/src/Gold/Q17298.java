package Gold;

import java.util.Scanner;
import java.util.Stack;

public class Q17298 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		Stack<Integer> st=new Stack<>();
		
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		
		/* { 3 5 2 7 } 
		 * 3���� ū �� �� ���� ���ʿ� �ִ� �� 5
		 * 5���� ū �� �� ���� ���ʿ� �ִ� �� 7
		 * 2���� ū �� �� ���� ���ʿ� �ִ� �� 7
		 * 7���� ū �� �� ���� ���ʿ� �ִ� �� -1  */
		
		for(int i=0; i<n; i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i])
				arr[st.pop()]=arr[i];
			st.push(i);
		}
		while(!st.isEmpty()) arr[st.pop()]=-1;
		for(int i=0; i<n; i++) sb.append(arr[i]+" ");
		System.out.println(sb);
	}

}
