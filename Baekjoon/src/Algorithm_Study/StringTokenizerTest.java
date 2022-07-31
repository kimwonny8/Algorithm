package Algorithm_Study;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String a="HELLO WORLD HAH HAA";
		String b="100,200,300,400";
		
		StringTokenizer st = new StringTokenizer(a);
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
		System.out.println();
		StringTokenizer st2 = new StringTokenizer(b,",");
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken()+" ");
		}
	}
}
