package Gold;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q5052 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			String[] arr = new String[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.next();
			}
			Arrays.sort(arr);

			boolean chk = true;
			for (int i = 0; i < N - 1; i++) {
				if (arr[i + 1].startsWith(arr[i])) {
					chk = false;
				}
			}
			if (chk == true) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}

		}
		bw.flush();
	}
}
