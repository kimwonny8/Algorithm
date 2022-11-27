package Bronze;

import java.util.Scanner;

public class Q10769 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		char [] arr=str.toCharArray();
		
		int happyCnt=0;
		int sadCnt=0;
		
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i]==':') {
				if(arr[i+2]==')') happyCnt++;
				else sadCnt++;
			}
		}
		if(happyCnt > sadCnt) System.out.println("happy");
		else if(happyCnt == sadCnt && happyCnt!=0) System.out.println("unsure");
		else if(happyCnt < sadCnt) System.out.println("sad");
		else System.out.println("none");
	}

}