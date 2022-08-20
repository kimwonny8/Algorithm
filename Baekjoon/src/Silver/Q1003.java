package Silver;

import java.util.Scanner;

public class Q1003 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int N=sc.nextInt();
			// N은 40보다 작거나 같은 자연수 또는 0
			int[] arr=new int[41], arr2=new int[41];
			arr[0]=arr2[1]=1;
		
			for(int j=2; j<=N; j++) {
				arr[j]=arr[j-1]+arr[j-2];
				arr2[j]=arr2[j-1]+arr2[j-2];
				}
			sb.append(arr[N]+" "+arr2[N]+"\n");
		}
		System.out.print(sb);
	}
 
}