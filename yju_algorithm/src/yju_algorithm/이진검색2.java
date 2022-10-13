package yju_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 이진검색2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0]: "); 
		x[0] = sc.nextInt(); // 배열의 첫 요소를 먼저 입력받음
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); 
		} // 바로 앞의 요소보다 작으면 다시 입력받음
		
		System.out.print("검색 값 : "); 
		int key = sc.nextInt();
		int idx = Arrays.binarySearch(x, key);
		
		if (idx < 0) {
			System.out.println("검색 값의 요소가 없습니다.");
			System.out.println("이 데이터를 삽일할 자리는 x["+-(idx+1)+"] 입니다.");
		} else {
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
		}
	}
}