package Silver;

import java.util.Scanner;
import java.util.HashSet;

public class Q11478 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashSet<String> set=new HashSet<>();
		
		int cnt=0; // 글자수 만큼 돌릴 횟수(-)용
		for(int i=1; i<=str.length(); i++) {
			int start=0, end=i;
			for(int j=0; j<str.length()-cnt; j++) {
				set.add(str.substring(start,end));
				start++; end++;
				
			}
			cnt++;
		}
		System.out.println(set.size());
	}
}