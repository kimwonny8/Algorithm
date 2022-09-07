package Silver;

import java.util.Scanner;
import java.util.TreeMap;

public class Q20291 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		TreeMap <String, Integer> map=new TreeMap<>();
		
		for(int i=0; i<n; i++) {
			String str=sc.next();
			String tmp=str.substring(str.indexOf(".")+1,str.length());
			map.put(tmp, map.getOrDefault(tmp, 0) + 1); 
		}
		
		for(String i : map.keySet()) {   
			sb.append(i+" "+map.get(i)+"\n");
		}
		System.out.println(sb);
	}
}
