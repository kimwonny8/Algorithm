package Gold;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1655_�ִ��ּ��� {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 StringBuilder sb = new StringBuilder();
		 
		 // �ּ���(�ö󰥼��� ���� �۾����� ����)�� �ִ���(�ö󰥼��� ���� Ŀ���� ����) �̿�
		 // ����� �ִ� ���ڴ� �ִ����� root��
	     PriorityQueue<Integer> min = new PriorityQueue<>();
	     PriorityQueue<Integer> max = new PriorityQueue<>((o1,o2) -> o2-o1);     
	 
	     int N=sc.nextInt();
	     
	     while(N-->0) {
	    	 int num=sc.nextInt();
	    	 
	    	 // max���� �߰�
	    	 if(min.size()==max.size()) max.add(num);
	    	 else min.add(num);

	    	 if(!min.isEmpty() && !max.isEmpty() && max.peek() > min.peek()) { // max�� peek�� �� ũ�� swap
	                int tmp=min.poll();
	                min.add(max.poll());
	                max.add(tmp);
	            }
	            sb.append(max.peek()+"\n");        
	    }

	     System.out.println(sb);
	    }
	}