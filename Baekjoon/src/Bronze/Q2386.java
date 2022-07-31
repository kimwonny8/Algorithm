package Bronze;

import java.util.Scanner;

public class Q2386 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int cnt=0;
			String p=sc.next();
			
			if(p.equals("#")) break;
			
			String a=sc.nextLine();	
			for(int i=0; i<a.length(); i++) {
				String comp=String.valueOf(a.charAt(i));
				if(p.equalsIgnoreCase(comp)) cnt++;
			}
			System.out.println(p+" "+cnt);
		}	
	}

}
