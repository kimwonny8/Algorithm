package yju_algorithm;

import java.util.Scanner;

class Hanoi {
	static void move(int num, int x, int y) {
		if(num > 1) {
			move(num-1, x, 6-x-y);
		}
		
		System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n",num, x, y);
		if(num > 1)
			move(num-1, 6-x-y, y);
	}
}

public class 재귀_하노이탑 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("원반의 개수: ");
		int n=sc.nextInt();
		
		Hanoi.move(n, 1, 3);
	}
}
