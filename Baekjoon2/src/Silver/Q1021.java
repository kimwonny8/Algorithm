package Silver;

import java.util.LinkedList;
import java.util.Scanner;

public class Q1021 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> q=new LinkedList<>();
		int n=sc.nextInt(), m=sc.nextInt();
		int cnt=0;
		
		// 1부터 n까지 리스트에 입력
		for(int i=1; i<=n; i++) q.add(i);
		
		for(int i=0; i<m; i++) {
			int num=sc.nextInt();
			
			// 입력받은 값이 맨 앞에 있다면 그대로 제외, 아니라면 맨 앞에 위치할 때까지 반복
			while(true) {
				if(q.getFirst()==num) {
					q.removeFirst();
					break;
				}
				else {
					if(q.indexOf(num) <= (q.size()/2)) {
						// 앞에 있다면 맨 앞 값들을 제외시킬 값이 올때까지 하나씩 맨 뒤로 이동시켜줌
						q.addLast(q.getFirst());
						q.removeFirst();
					}else {
						// 뒤에 있다면 맨 뒤 값들을 제외시킬 값이 올때까지 하나씩 맨 앞으로 이동시켜줌
						q.addFirst(q.getLast());
						q.removeLast();
					}
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);
	}

}
