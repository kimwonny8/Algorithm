package Silver;

import java.util.Scanner;

public class Q1312 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		int n=sc.nextInt();
		double result =0;
		
		for(int i=0; i<n; i++) {
			a=(a%b*10);
			result = a/b;
		}
		System.out.println((int)result);
	}

}
