package Bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9933 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		while(n-- > 0) {
			String str=sc.next();
			String s="";
			for(int i=str.length()-1; i>=0; i--) {
				s+=str.charAt(i);
			}
			if(list.contains(s) || str.equals(s)) {
				System.out.printf("%d %s",s.length(), s.charAt(s.length()/2));
				break;
			}
			else list.add(str);
		}
	}

}