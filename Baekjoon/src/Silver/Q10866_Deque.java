package Silver;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q10866_Deque {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		Deque<Integer> dq = new LinkedList<>();
		int n=sc.nextInt(), num=0;
		for(int i=0; i<n; i++) {
			String x=sc.next();
			switch(x) {
				case "push_front" :
					num=sc.nextInt();
					dq.addFirst(num); 
					break;
				case "push_back" :
					num=sc.nextInt();
					dq.addLast(num); 
					break;
				case "pop_front":
					sb.append(dq.isEmpty()? -1: dq.removeFirst()).append("\n");
					break;
				case "pop_back":
					sb.append(dq.isEmpty()? -1: dq.removeLast()).append("\n");
					break;
				case "size":
					sb.append(dq.size()).append("\n");
					break;
				case "empty":
					sb.append(dq.isEmpty()? 1: 0).append("\n");
					break;
				case "front":
					sb.append(dq.isEmpty()? -1: dq.peek()).append("\n");
					break;
				case "back":
					sb.append(dq.isEmpty()? -1: dq.peekLast()).append("\n");
					break;
			}		
		}
		System.out.println(sb);
	}

}

