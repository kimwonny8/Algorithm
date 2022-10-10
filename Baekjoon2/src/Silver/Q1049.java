package Silver;

import java.util.Scanner;
import java.util.Arrays;

public class Q1049 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int Min = Integer.MAX_VALUE;

		int[] arr = new int[M];
		int[] arr2 = new int[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = sc.nextInt();
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);

		Min = Math.min(((N / 6) + 1) * arr2[0], N * arr[0]);
		Min = Math.min(Min, ((N / 6)) * arr2[0] + (N % 6) * arr[0]);

		System.out.println(Min);
	}
}
