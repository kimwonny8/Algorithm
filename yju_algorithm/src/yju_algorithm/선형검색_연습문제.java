package yju_algorithm;

public class 선형검색_연습문제 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				cnt++;
				idx[i] = i;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] a = { 1, 9, 2, 9, 4, 6, 7, 9 };
		int key = 9;
		int[] idx = new int[a.length];
		System.out.printf("검색 값 : %d\n", key);
		System.out.println("검색 개수는 : " + searchIdx(a, a.length, key, idx) + "개입니다.");
		for (int i : idx) {
			if (i != 0)
				System.out.printf("그 값은 x[%d]에 있습니다.\n", i);
		}
	}

}
