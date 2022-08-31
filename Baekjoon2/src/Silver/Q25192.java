package Silver;

import java.util.Scanner;
import java.util.TreeSet;

public class Q25192 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		TreeSet<String> set=new TreeSet<>();
		int cnt=0;
		for(int i=0; i<N; i++) {
			String str=sc.next();
			if(str.equals("ENTER")) {
				cnt+=set.size();
				set.clear();	
			}
			else {
				set.add(str);
			}
			if(i==N-1) cnt+=set.size();
		}
		System.out.println(cnt);
	}
}
