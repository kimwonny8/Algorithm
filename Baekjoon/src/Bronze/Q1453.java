package Bronze;

import java.util.Scanner;

public class Q1453 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean []arr=new boolean[101];
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			int num=sc.nextInt();
			if(arr[num]==true) cnt++;
			else arr[num]=true;
		}
		System.out.println(cnt);
	}

}
