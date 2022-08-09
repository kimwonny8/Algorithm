package Gold;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		 
		// 최소힙(올라갈수록 값이 작아지는 구조)과 최대힙(올라갈수록 값이 커지는 구조) 이용
		// 가운데에 있는 숫자는 최대힙의 root값
	    	PriorityQueue<Integer> min = new PriorityQueue<>();
	    	PriorityQueue<Integer> max = new PriorityQueue<>((o1,o2) -> o2-o1);     
	 
	    	int N=sc.nextInt();
	     
	    	while(N-->0) {
	    		int num=sc.nextInt();
	    	 
	    	 	// max부터 추가
	    	 	if(min.size()==max.size()) max.add(num);
	    	 	else min.add(num);

	    	 	if(!min.isEmpty() && !max.isEmpty() && max.peek() > min.peek()) { // max peek이 더 크면 swap
	                	int tmp=min.poll();
	                	min.add(max.poll());
	                	max.add(tmp);
	            	}
	    	 	sb.append(max.peek()+"\n");        
	   	}
	     	System.out.println(sb);
	    }
	}
