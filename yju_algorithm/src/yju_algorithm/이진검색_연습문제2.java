package yju_algorithm;

import java.util.Arrays;
import java.util.Random;

// 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 이진검색(검색 과정을 자세히 출력)
public class 이진검색_연습문제2 {

	static int binarySearch(int[] a, int n, int key) {
		// pl : 왼쪽 위치, pr : 오른쪽 위치, pc : 중간 위치
		int pl, pr, pc;
		pl = 0;
		pr = n - 1;
		do {
			pc = (pl + pr) / 2;

			// 화살표 범위
			System.out.print("   |");
			if (pl != pc) {
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			} else {
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			}

			if (pc != pr) {
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			} else {
				System.out.println("->");
			}
			System.out.println("");

			// 센터 값, 원소 값 출력
			System.out.printf("%3d|", pc); // 센터 값 출력 |
			for (int k = 0; k < n; k++) {
				System.out.printf("%4d", a[k]); // 원소 값 찍기
			}
			System.out.println("\n   |");

			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) { // 검색범위가 오른쪽으로 변경
				pl = pc + 1;
			} else { // 검색범위가 왼쪽으로 변경
				pr = pc - 1;
			}
		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {
		int num = 10;
		int[] a = new int[num + 1];
		Random random = new Random();

		for (int i = 0; i < num; i++) {
			a[i] = random.nextInt(15);
		}
		int key = 2;
		Arrays.sort(a);

		System.out.print("요솟수 : ");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println("\n검색값 : " + key);

		int idx = binarySearch(a, a.length, key);
		if (idx != 0)
			System.out.printf("\n값 %d는 x[%d]에 있습니다.", key, idx);
		else
			System.out.printf("%d값이 없습니다.", key);
	}
}
