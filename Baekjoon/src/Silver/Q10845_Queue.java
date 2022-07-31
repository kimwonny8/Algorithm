package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q10845_Queue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Queue <Integer> q=new LinkedList<>();
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt(), num=0;
		for(int i=0; i<n; i++) {
			String x=sc.next();
			switch(x) {
				case "push" :
					num=sc.nextInt();
					q.add(num); break;
				case "pop":
					if(q.isEmpty()) {
						sb.append("-1").append("\n");
						break;
					}
					sb.append(q.poll()).append("\n");
					break;
				case "size":
					sb.append(q.size()).append("\n");
					break;
				case "empty":
					sb.append(q.isEmpty()? 1: 0).append("\n");
					break;
				case "front":
					sb.append(q.isEmpty()? -1: q.peek()).append("\n");
					break;
				case "back":
					sb.append(q.isEmpty()? -1: num).append("\n");
					break;
			}		
		}
		System.out.println(sb);
	}

}