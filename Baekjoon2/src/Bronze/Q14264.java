package Bronze;

import java.util.Scanner;

public class Q14264 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double N = sc.nextDouble();
		double area = (Math.sqrt(3) / 4) * Math.pow(N, 2);
		
		System.out.println(area);
	}

}