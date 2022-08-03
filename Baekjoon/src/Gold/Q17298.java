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
		 * 3보다 큰 수 중 가장 왼쪽에 있는 수 5
		 * 5보다 큰 수 중 가장 왼쪽에 있는 수 7
		 * 2보다 큰 수 중 가장 왼쪽에 있는 수 7
		 * 7보다 큰 수 중 가장 왼쪽에 있는 수 -1  */
		
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
