package Bronze;

import java.util.Scanner;

public class Q1264 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String n =sc.nextLine();
			if(n.equals("#")) break;
			int cnt=0;
			for(int i=0; i<n.length(); i++) {
				switch(n.charAt(i)) {
				case 'a', 'A', 'e', 'E', 'i', 'I', 'o','O','u','U':
					cnt++; break;
				}	
			}
			System.out.println(cnt);
		}

	}
}
