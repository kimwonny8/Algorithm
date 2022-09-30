package Silver;

import java.util.Scanner;

public class Q1850 {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        StringBuilder sb = new StringBuilder();
        
        long a=sc.nextLong(), b=sc.nextLong();
        long result=gcd(Math.max(a, b), Math.min(a, b));
        for(int i=0; i<result; i++) sb.append("1");
        
        System.out.print(sb);      
    }
    
    static long gcd(long x, long y) {
        while(y>0) {
            long tmp=x;
            x=y;
            y=tmp%x;
        }
        return x;
    }
}
