package Bronze;

import java.util.Scanner;

public class Q2355 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(), b=sc.nextLong();
		if(b>a) {
			long tmp=b;
            b=a;
            a=tmp;
        }
        System.out.println((a+b)*(a-b+1)/2);
 
	}
}
