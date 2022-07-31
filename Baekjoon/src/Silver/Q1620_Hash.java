package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620_Hash {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> map_int = new HashMap<>();
	    HashMap<String, Integer> map_str = new HashMap<>();
	    
		for(int i=1; i<=n; i++) {
			 String name = br.readLine();
	         map_int.put(i, name);
	         map_str.put(name, i);
		}
		for(int i=1; i<=m; i++) {
			String s=br.readLine();
			boolean isNumeric = s.chars().allMatch( Character::isDigit ); // 숫자면 true 아니면 false
			if(isNumeric == true) {
				int num=Integer.parseInt(s);
				sb.append(map_int.get(num)).append("\n");
			}
			else {
				sb.append(map_str.get(s)).append("\n");	
				}
			}
		System.out.println(sb);
	}
}

