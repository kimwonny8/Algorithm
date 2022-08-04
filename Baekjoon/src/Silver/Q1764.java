package Silver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Q1764 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt(), m=sc.nextInt();
		HashSet<String> set=new HashSet<>();
		TreeSet<String> result=new TreeSet<>();
		
		for(int i=0; i<n; i++) set.add(sc.next());
		for(int i=0; i<m; i++) {
			String str=sc.next();
			if(set.contains(str)) result.add(str);
		}
		
		sb.append(result.size()+"\n");
		for(String str: result)	sb.append(str+"\n");
		
		System.out.println(sb);
	}
}