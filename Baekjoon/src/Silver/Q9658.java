package Silver;

import java.util.Scanner;

public class Q9658 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println((N%7==0 || N%7==2)? "CY":"SK");
	}
 
}