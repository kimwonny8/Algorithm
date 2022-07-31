package Silver;

import java.util.HashSet;
import java.util.Scanner;

public class Q14425 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(), m=sc.nextInt();
		HashSet<String> set=new HashSet(); // 시간초과 때문에 해시셋 사용
		
		for(int i=0; i<n; i++) set.add(sc.next());		
		
		int cnt=0;
		
		for(int i=0; i<m; i++) {
			String str=sc.next();
			if(set.contains(str)) cnt++;
		}
		System.out.println(cnt);
	}
}