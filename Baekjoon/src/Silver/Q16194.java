package Silver;

import java.util.Scanner;

public class Q16194 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        	int [] arr=new int[N+1];

        	for(int i=1; i<=N; i++) {
        		arr[i]=sc.nextInt();
        		for(int j=1; j<=i; j++) {
                	arr[i]=Math.min(arr[i], arr[i-j]+arr[j]);
            		}
        	}  
        	System.out.println(arr[N]);
	}
}
