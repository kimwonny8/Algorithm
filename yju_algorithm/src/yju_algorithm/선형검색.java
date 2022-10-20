package yju_algorithm;

import java.util.Random;

class Search2 {
	// 배열에서 선형 검색
	// a : 찾고자 하는 배열, n : 배열의 요소수, key : 찾고자 하는 값
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		while (true) {
			if (i == n) {
				return -1;
			}
			if (a[i] == key) {
				return i;
			}
			i++;
		}
	}
}

public class 선형검색 {

	public static void main(String[] args) {
		// 100개의 랜덤한 정수값( 0에서 100까지의 정수)을 가진 배열을 생성하고
		// 여기에서 5가 들어 있는 배열의 인덱스를 검색하시오.
		// 못찾으면 못찾았다고 출력하시오.
		int i;
		int num = 100;
		int[] array = new int[num];
		Random random = new Random();
		for ( i = 0; i < num; i++) {
			array[i] = random.nextInt(101);
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		
		System.out.println();
		int idx = Search2.seqSearch(array, num, 5);
		if (idx < 0) {
			System.out.print("값이 없어요");
		} else {
			System.out.print("값이 "+ idx + "번째 있어요");
		}

	}

}