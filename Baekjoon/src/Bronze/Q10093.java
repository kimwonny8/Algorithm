package Bronze;

import java.util.Scanner;

public class Q10093 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StringBuilder sb=new StringBuilder();
    long a=sc.nextLong(), b=sc.nextLong();
    long cnt=0;
    if(b>a) {
    	for(Long i=a+1; i<b; i++) {
    		cnt++;
    		sb.append(i).append("\n");
    	}
    	System.out.println(cnt);
    	System.out.println(sb);
    }
    else if(a==b) System.out.println(0);
    else {
    	for(Long i=b+1; i<a; i++) {
    		cnt++;
    		sb.append(i).append("\n");
    	}
    	System.out.println(cnt);
    	System.out.println(sb);
    }
  }
}
