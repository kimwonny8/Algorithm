package Bronze;

import java.util.Scanner;

public class Q10102 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] arr=sc.next().toCharArray();
		
		int cntA=0, cntB=0;
		for(int i=0; i<n; i++) {
			if(arr[i]=='A') cntA++;
			else cntB++;
		}
		if(cntA > cntB) System.out.println("A");
		else if(cntA < cntB) System.out.println("B");
		else System.out.println("Tie");
		
	}
	
}
