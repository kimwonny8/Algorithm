package yju_algorithm;

import java.util.Random;

class Search {
	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열에서 선형 검색
	// a : 찾고자 하는 배열, n : 배열의 요소수, key : 찾고자 하는 값
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
//		while (true) {
//			if (i == n) {
//				return -1;
//			}
//			if (a[i] == key) {
//				return i;
//			}
//			i++;
//		}
		a[n] = key; // 1. 배열에 맨 마지막에 찾으려는 값을 저장

		while (true) {
			if (a[i] == key) {
				break; // 현재의 반복 구조를 빠져나가는 명령
			}
			i++;
		}

		if (i == n) {
			return -1;
		}

		return i;
	}

	static int binarySearch(int[] a, int n, int key) {
		// pl : 왼쪽 위치, pr : 오른쪽 위치, pc : 중간 위치
		int pl, pr, pc;
		pl = 0;
		pr = n - 1;
		do {
			pc = (pl + pr) / 2;
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
}

public class 이진검색 {

	public static void main(String[] args) {
		// 100개의 랜덤한 정수값( 0에서 100까지의 정수)을 가진 배열을 생성하고
		// 여기에서 5가 들어 있는 배열의 인덱스를 검색하시오.
		// 못찾으면 못찾았다고 출력하시오.
		int i;
		int num = 100;
		int[] array = new int[num + 1];
		Random random = new Random();
		for (i = 0; i < num; i++) {
			array[i] = random.nextInt(101);
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		System.out.println();
		int idx = Search.seqSearch(array, num, 5);
		if (idx < 0) {
			System.out.print("값이 없어요");
		} else {
			System.out.print("값이 " + idx + "번째 있어요");
		}
		System.out.println("\n 버블 정렬");
		Search.bubbleSort(array, num);
		for (i = 0; i < num; i++) {
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}

		}
		System.out.println("\n 이진 검색");
		idx = Search.binarySearch(array, num, 5);
		if (idx < 0) {
			System.out.print("값이 없어요");
		} else {
			System.out.print("값이 " + idx + "번째 있어요");
		}

	}

}