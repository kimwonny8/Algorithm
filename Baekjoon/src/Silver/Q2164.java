package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2164 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		if(n!=1) {
		while(true) {
			q.poll();
			q.offer(q.poll());
			if(q.size()==1) {
				System.out.println(q.poll());
				break;
			}
		}
		} else System.out.println("1");
		}
}
