package Silver;

import java.util.HashMap;
import java.util.Scanner;

public class Q17219 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb= new StringBuilder();
		HashMap<String, String> map = new HashMap<>();
		int n=sc.nextInt(), m=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String site=sc.next(), pw=sc.next();
			map.put(site, pw);
		}
		for(int i=0; i<m; i++) {
			String str=sc.next();
			sb.append(map.get(str)).append("\n");
		}
		System.out.println(sb);
	}
}
