package Silver;

import java.util.HashMap;
import java.util.Scanner;

public class Q1302 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int n=sc.nextInt();

		for(int i=0; i<n; i++) {
			String str=sc.next();
			if(!map.containsKey(str)) map.put(str, 1);
			else map.put(str, map.get(str)+1);
		}
		String maxBook=""; 
		int max=-1;
		
		 for(String key : map.keySet()) {
	            int value=map.get(key);
	            if(max==value && maxBook.compareTo(key)>0) {
	                maxBook=key;
	                max=value;
	            } else if(max<value) {
	                maxBook=key;
	                max=value;
	            }      
	        }
		 System.out.println(maxBook);
	}

}
