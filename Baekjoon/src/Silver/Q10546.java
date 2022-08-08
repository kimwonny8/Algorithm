package Silver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q10546 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Map<String,Integer> map=new HashMap<>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++)  {
			String name=sc.next();
			map.put(name, map.getOrDefault(name, 0)+1);
		}
		for(int i=0; i<N-1; i++) {
			String name=sc.next();
			map.put(name, map.get(name)-1);
		}
		for(String key :map.keySet()) {
			if(map.get(key)==1) System.out.println(key);	
		}
			
	}
}