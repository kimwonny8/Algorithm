package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Q11652 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		HashMap<Long,Integer> map=new HashMap<>();
		while(N-->0) {
			long num=sc.nextLong();
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Long> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator(){
            public int compare(Object o1, Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                
                if(v1.equals(v2))  return ((Comparable)o1).compareTo(o2); 
                else  return ((Comparable)v2).compareTo(v1);
                
            }
        });
        
		System.out.println(list.get(0));
	}
}
