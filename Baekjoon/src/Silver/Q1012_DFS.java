package Silver;

import java.util.Scanner;

public class Q1012_DFS {
	static int N, M, K;
	static int[][] arr;
	static boolean[][] chk;
	static int cnt;
	static int[] dx={ -1, 1, 0, 0 };
	static int[] dy={ 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int T=sc.nextInt();
		while(T-->0) {
			M=sc.nextInt(); // 가로길이
			N=sc.nextInt(); // 세로길이
			K=sc.nextInt(); // 배추 위치 갯수
			arr=new int[M][N];
			chk=new boolean[M][N];
			cnt=0;
			
			for(int i=0; i<K; i++) {
				int num1=sc.nextInt(), num2=sc.nextInt();
				arr[num1][num2]=1;
			}
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(arr[i][j]==1 && !chk[i][j]) {
						dfs(i,j);
						cnt++;
					}
				}
			}
			sb.append(cnt+"\n");	
		}
		System.out.print(sb);
		
	}
	static void dfs(int x, int y) {
		chk[x][y]=true;

		for (int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];

			if(nx>=0 && ny>=0 && nx<M && ny<N) {
				if(arr[nx][ny]==1 && !chk[nx][ny]) {
					dfs(nx, ny);
				}
			}

		}

	}

}