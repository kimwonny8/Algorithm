package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q1449 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), L=sc.nextInt();
		int []arr=new int[N];
		for(int i=0; i<N; i++)	arr[i]=sc.nextInt();
		Arrays.sort(arr);
		
		int cnt=1, num=0;
		for(int j=1; j<N; j++) {
			if(arr[num]+L-1 < arr[j]) {
				cnt++; num=j;
			}
		}

		System.out.println(cnt);
	}

}