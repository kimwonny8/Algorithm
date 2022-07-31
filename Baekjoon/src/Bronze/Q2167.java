package Bronze;

import java.util.Scanner;

public class Q2167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		int[][]arr=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int k=sc.nextInt();
		for(int i=0; i<k; i++) {
			int x=sc.nextInt(),y=sc.nextInt(),
				x2=sc.nextInt(),y2=sc.nextInt();
			int sum=0;
			for(int j=x-1; j<x2; j++) {
				for(int l=y-1; l<y2; l++)
					sum+=arr[j][l];
			}
			System.out.println(sum);
		}
	}
}
