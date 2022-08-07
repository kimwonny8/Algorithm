package Silver;

import java.util.Scanner;
import java.util.TreeSet;

public class Q1822 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int a=sc.nextInt(), b=sc.nextInt();
		TreeSet<Integer> set=new TreeSet<>();
		
		for(int i=0; i<a; i++) set.add(sc.nextInt());
		for(int i=0; i<b; i++) {
			int tmp=sc.nextInt();
			if(set.contains(tmp)) set.remove(tmp);
		}
		sb.append(set.size()+"\n");
		for(int i:set) sb.append(i+" "); 
		System.out.println(sb);
	}
}