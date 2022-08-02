package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String str = br.readLine();

		char[] arr = str.toCharArray();
		for (int i : arr) {
			if ((i >= 'a' && i <= 'z')) {
				i += 13;
				if (i > 'z')
					i -= 26;
			} else if ((i >= 'A' && i <= 'Z')) {
				i += 13;
				if (i > 'Z')
					i -= 26;
			}
			sb.append((char)i);
		}
		System.out.println(sb);
	}

}
