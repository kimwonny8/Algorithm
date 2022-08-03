package Silver;

import java.util.Scanner;

public class Q1476 {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int e=1, s=1, m=1;
		int E=sc.nextInt(), S=sc.nextInt(), M=sc.nextInt();
		// E<=15, S<=28, M<=19
		for(int i=1;;i++) {
			if(e==E && s==S && m==M) {
				System.out.println(i);
				break;
			}
			e++; s++; m++;
			if(e==16) e=1;
			if(s==29) s=1;
			if(m==20) m=1;
		
		}
	}

}
