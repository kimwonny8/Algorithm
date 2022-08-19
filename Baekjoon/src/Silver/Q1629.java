package Silver;

import java.util.Scanner;

public class Q1629 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong(), B=sc.nextLong(), C=sc.nextLong();
        
        System.out.println(pow(A, B, C));
    }
    
    private static long pow(long a, long b, long c) {
		if(b==1) return a%c;
		
		long tmp=pow(a, b/2, c);
		
		if(b%2==1) return tmp*tmp%c*a%c;
		else return tmp*tmp%c;
		
	}
}