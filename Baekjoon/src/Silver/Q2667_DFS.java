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
					dfs(i, j);	// 1�̸鼭 �湮���� ������ => dfs ������ ���� �� ī��Ʈ
					cnt++;	
					// dfs ��� �Լ��� ������ Ž��(����)�� �������Ƿ�, ���� ������ ���� ���� ��ȣ�� +1 ����� ��
				}
			}
		}
		
		sb.append(cnt-1+"\n");
		
		int[] apart = new int[cnt];	// ������ ��ŭ ���� �� ����
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] != 0) {
					apart[map[i][j]] ++; 
					// ���� �ִ� map[i][j]�� ��� cnt�� ����Ǿ����Ƿ�, ���� ��ȣ�� �����
				}
			}
		}
		
		Arrays.sort(apart);
		for(int i=1; i<cnt; i++) sb.append(apart[i]+"\n");	
		System.out.print(sb);

	}
	public static void dfs(int x, int y) {
		map[x][y] = cnt;	// �湮�ϸ� cnt�� ǥ��(1, 2, 3, ... �ϳ��� ����)
		visit[x][y] = true;	// �湮�ϸ� true
		for(int i=0; i<4; i++) {	
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			// nx, ny = ��ǥ�� ����, N*N ũ���̹Ƿ� x, y��ǥ�� 0���� Ŀ���ϰ� N���� �۾ƾ���
			if(nx>=0 && ny>=0 && nx<N && ny<N) {	
				if(map[nx][ny]==1 && visit[nx][ny]==false) {
					dfs(nx, ny); // 1�̸鼭 �湮���� ������ => dfs ������
				}
			}
		}
	}

}