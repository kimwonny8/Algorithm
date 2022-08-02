package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		while ((str = br.readLine()) != null) {
			int[] arr = new int[4];
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					arr[0]++;
				else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
					arr[1]++;
				else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
					arr[2]++;
				else if (str.charAt(i) == ' ')
					arr[3]++;
			}
			for (int i : arr) {
				sb.append(i + " ");
			}
			System.out.println(sb);
		}

	}

}
