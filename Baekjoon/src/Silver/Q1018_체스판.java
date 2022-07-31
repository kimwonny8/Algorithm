package Silver;

import java.util.Scanner;

public class Q1018_체스판 {
	static int[][]arr;
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		arr=new int[n][m];
		
		for(int i=0; i<n; i++) {
			String a=sc.next();
			for(int j=0; j<m; j++) {
				if(a.substring(j,j+1).equals("W")) arr[i][j]=1; // w를 1로
				else arr[i][j]=0; //b는 0으로
			}
		}
		// 경우의 수 = 가로-7 * 세로-7
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
					find(i,j);
			}	
		}
		System.out.println(result);
	}
	
	static void find(int x, int y) {
		int a=x+8, b=y+8, cnt=0;
		int first=arr[x][y]; // 첫번째 칸의 색
		
		for(int i=x; i<a; i++) {
			for(int j=y; j<b; j++) {
				if(arr[i][j]!=first) cnt++;
				// 다음 칸은 색이 바뀌므로 반전시켜줌
				if(first==0) first=1;
				else if(first==1) first=0;
			}
			// 다음 줄도 색이 바뀌므로 반전시켜줌
			if(first==0) first=1;
			else if(first==1) first=0;	
		}
		cnt=Math.min(cnt, 64-cnt);
		result = Math.min(result, cnt);
	}

}
