package Silver;

import java.util.Scanner;

public class Q1564 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		long n=sc.nextLong();
		long num=1, k=(long)1e12;
		
		for(long i=1; i<=n; i++) {
            num*=i;
            while(num%10==0) num/=10;
            num%=k;
        }
        num%=100000;
        
        if(num>=0 && num<10) sb.append(0000);
        else if(num>=10 && num<100) sb.append(000);
        else if(num>=100 && num<1000) sb.append(00);
        else if(num>=1000 && num<10000) sb.append(0);
        sb.append(num);
        System.out.print(sb);
	}
}
