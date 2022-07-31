package Algorithm_Study;

import java.util.*;

public class Queue_Hambuger {

	public static void main(String[] args) {
		Queue <Integer> q=new LinkedList<>();
		
		int [] hambuger = {12, 15, 24}; 
		int [] arr = new int[3]; // 햄버거 횟수 셀 배열
		int repeat = 100; // 시뮬레이션 돌릴 횟수
		int seat = 90; // seat 수용인원 가정해서 돌려봄
		int wait=0, success = 0, fail = 0;
		
		for(int j=0; j<repeat; j++) {
			for(int i=0; i<3600; i++) {
				if(i%15==0) { // 15초 되면 랜덤 주문
					Random rand = new Random();
					q.add(hambuger[rand.nextInt(3)]);
					wait++;
				}
				if(!q.isEmpty()) { // 주문 있으면, 주문완료 -> 디큐
					if(i%q.peek()==0) {
						q.remove();
						wait--;
					}
				}
				if (wait > seat) break;
			}
			if(wait > seat) fail++; 
			else success++;
			
			while(!q.isEmpty()) { // 시뮬레이션 여러번 돌려야해서 큐 초기화
				q.remove();
			}
		}
				
		System.out.printf("Success: %d, fail: %d, Percentage: %d%%", success, fail, success * 100 / repeat);
	}

}
