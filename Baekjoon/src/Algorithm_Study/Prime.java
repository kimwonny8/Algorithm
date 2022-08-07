package Algorithm_Study;

import java.util.Scanner;

public class Prime {

	public static boolean[] prime; // �Ҽ��� üũ�� �迭
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		make_prime(n);

		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) { // �Ҽ�(false)�� ��� ���
				System.out.println(i);
			}
		}
	}

	// N ���� �Ҽ� ���� �޼ҵ�
	public static void make_prime(int N) {

		prime = new boolean[N + 1]; // 0 ~ N
		// �Ҽ��� �ƴ� index = true, �Ҽ��� = false
		// 2 �̸��� N �� �Է¹����� �Ҽ��� �Ǻ��� �ʿ� �����Ƿ� �ٷ� return
		if (N < 2)	return;

		prime[0] = prime[1] = true;
		
		// ������ �Լ� : Math.sqrt()
		for (int i = 2; i <= Math.sqrt(N); i++) {
			// �̹� üũ�� �迭�̸� ���� �ݺ������� skip
			if (prime[i] == true)
				continue;
			// i �� ������� �ɷ��ֱ� ���� �ݺ���
			for (int j = i * i; j < prime.length; j = j + i)
				prime[j] = true;
		}

	}

}
