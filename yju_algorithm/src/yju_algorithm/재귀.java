package yju_algorithm;

import java.util.Stack;

class Recur {
	void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	// 꼬리 재귀의 제거
	void recur2(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	// 재귀의 제거 -> 스택에 잠시 저장하는 방법
	void recur3(int n) {
		Stack<Integer> st = new Stack<>();

		while (true) {
			if (n > 0) {
				st.push(n);
				n -= 1;
				continue;
			}
			if (!st.isEmpty()) {
				n = st.pop();
				System.out.println(n);
				n -= 2;
				continue;
			}
			break;
		}
	}
}

public class 재귀 {
	public static void main(String[] args) {

		Recur recurObj = new Recur();
		int x = 4;

		recurObj.recur3(x);
	}
}
