package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q2667_DFS {
	static int N;	
	static int cnt=1;	
	static int[][] map=new int[25][25];	
	static boolean[][] visit=new boolean[25][25];	
	static int[] dx={0, -1, 0, 1};	
	static int[] dy={-1, 0, 1, 0};	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		N=sc.nextInt();	
		for(int i=0; i<N; i++) {
			String str=sc.next();
			for(int j=0; j<N; j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1 && !visit[i][j]) {
					dfs(i, j);	// 1이면서 방문하지 않은곳 => dfs 돌리고 단지 수 카운트
					cnt++;	
					// dfs 재귀 함수가 끝날때 탐색(인접)이 끝났으므로, 다음 인접된 집의 단지 번호를 +1 해줘야 함
				}
			}
		}
		
		sb.append(cnt-1+"\n");
		
		int[] apart = new int[cnt];	// 단지수 만큼 집의 수 설정
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] != 0) {
					apart[map[i][j]] ++; 
					// 집이 있는 map[i][j]의 경우 cnt로 저장되었으므로, 단지 번호가 저장됨
				}
			}
		}
		
		Arrays.sort(apart);
		for(int i=1; i<cnt; i++) sb.append(apart[i]+"\n");	
		System.out.print(sb);

	}
	public static void dfs(int x, int y) {
		map[x][y] = cnt;	// 방문하면 cnt로 표시(1, 2, 3, ... 하나씩 증가)
		visit[x][y] = true;	// 방문하면 true
		for(int i=0; i<4; i++) {	
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			// nx, ny = 좌표의 범위, N*N 크기이므로 x, y좌표가 0보단 커야하고 N보단 작아야함
			if(nx>=0 && ny>=0 && nx<N && ny<N) {	
				if(map[nx][ny]==1 && visit[nx][ny]==false) {
					dfs(nx, ny); // 1이면서 방문하지 않은곳 => dfs 돌리기
				}
			}
		}
	}

}