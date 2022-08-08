package Silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Q7785 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		HashMap<String,String> map=new HashMap<>();
		int n=sc.nextInt();
		
		while(n-->0) {
			String name=sc.next(), state=sc.next();
			map.put(name, state);
			if(state.equals("leave")) map.remove(name);
		}
		
		Object[] map2 = map.keySet().toArray(); // 역순으로 정렬하기 위함
		Arrays.sort(map2, Collections.reverseOrder());
		
		for(Object s: map2) {
			if(map.get(s) != null) sb.append(s+"\n");
		}
		System.out.println(sb);
	}
}