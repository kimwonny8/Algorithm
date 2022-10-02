package Silver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q4358 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        HashMap<String, Integer> map=new HashMap<>();
        
        int cnt=0;
        while(sc.hasNextLine()) {
        	String str=sc.nextLine();
        	map.put(str, map.getOrDefault(str, 0)+1);
        	cnt++;	
        }
        
        Object[] arr=map.keySet().toArray();
        Arrays.sort(arr);
        for(Object i:arr) {
        	String tmp=(String)i;
        	int count=map.get(tmp);
        	double per=(double)(count*100.0)/cnt;
        	sb.append(tmp+" "+String.format("%.4f",per)+"\n");
        }
        
        System.out.print(sb);
    }
}