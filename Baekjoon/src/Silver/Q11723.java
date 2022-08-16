package Silver;

import java.util.HashSet;
import java.util.Scanner;

public class Q11723 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int M=sc.nextInt();
        
        HashSet<Integer> set=new HashSet<>();
        while(M-->0) {
        	String str=sc.next();
        	int num;
        	
        	switch(str) {
        	case "add":
        		num=sc.nextInt();
        		set.add(num); break;
        	case "remove":
        		num=sc.nextInt();
        		if(set.contains(num)) set.remove(num); 
        		break;
        	case "check":
        		num=sc.nextInt();
        		if(set.contains(num)) sb.append("1\n");
        		else sb.append("0\n");
        		break;
        	case "toggle":
        		num=sc.nextInt();
        		if(set.contains(num)) set.remove(num);
        		else set.add(num);
        		break;
        	case "all":
        		set.clear();
				for(int i=1; i<=20; i++) set.add(i);
				break;
        	case "empty":
        		set.clear();
        		break;
        	default: break;
        	}
        }
        System.out.print(sb);
    }
}