package Silver;

import java.util.Scanner;

public class Q2003 {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt(), M=sc.nextInt();
    	int [] arr=new int[N];
    	for(int i=0; i<N; i++) arr[i]=sc.nextInt();
    	
    	int cnt=0, p1=0, p2=0, sum=0;
    	while(p2<N) {
			if(sum>M || p2==N) {
				sum-=arr[p1];
				p1++;
			}
			else {
				sum+=arr[p2];
				p2++;
			}
         
			if(sum==M) cnt++;
		}
    	System.out.println(cnt);
    }
}