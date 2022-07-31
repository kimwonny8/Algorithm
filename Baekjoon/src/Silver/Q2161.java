package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2161 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		Queue<Integer> q=new LinkedList<>();
		for(int i=1; i<=n; i++) q.add(i);
		
		while(q.size()!=1) {
			System.out.print(q.remove()+" ");
			int tmp=q.poll();
			q.add(tmp);
		}
		System.out.println(q.remove());
	}
 
}