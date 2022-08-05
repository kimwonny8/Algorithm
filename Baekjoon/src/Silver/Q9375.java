package Silver;

import java.util.HashMap;
import java.util.Scanner;

public class Q9375 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int T=sc.nextInt();
				
		while(T-->0) {
			int n=sc.nextInt();
			HashMap<String, Integer> map=new HashMap<>();
			
			for(int i=0; i<n; i++) {
				String str=sc.next(), key=sc.next();
				
				if(map.containsKey(key)) map.put(key, map.get(key)+1);
				else map.put(key, 1);
			}
			
			int num=1;
			for(int i:map.values()) num*=i+1;
			sb.append(num-1+"\n");
		}
		System.out.println(sb);
	}
}