package Silver;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q11286_���밪�� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int N=sc.nextInt();
		PriorityQueue <Integer> q=new PriorityQueue<>((o1,o2) -> {
			int abs1=Math.abs(o1), abs2=Math.abs(o2);
			
			//���밪 ���� ���� �� �������� ���� ���� �� ����ؾ� ��
			if(abs1==abs2) {
				if(o1>o2) return 1;
				else return -1;
			}
			return abs1-abs2;
		}); 
		
		while(N-->0) {
			int num=sc.nextInt();
			if(num==0) {
				if(q.isEmpty()) sb.append(0+"\n");
				else sb.append(q.poll()+"\n");
			}
			else q.add(num);
		}
		System.out.println(sb);
	}
}
