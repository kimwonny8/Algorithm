package Bronze;

import java.util.Scanner;

public class Q9699 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a, max=0;
		
		for(int i=1; i<=n; i++){
			for(int j=0; j<5; j++) {
				a=sc.nextInt();
				if(j==0) max=a;
				else if(a>=max) max=a;
			}
			System.out.printf("Case #%d: %d\n",i,max);
		}
	}
}
