package Silver;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2178_BFS {
   static int n, m;
   static int[][] arr;
   static int [][] chk;
   static int[] dx= {-1,1,0,0 }; 
   static int[] dy = {0,0,-1,1}; 
   
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=sc.nextInt();
      arr=new int[n+1][m+1];
      chk=new int[n+1][m+1];
      
      for(int i=1; i<n+1; i++) {
         String s=sc.next();
         for(int j=1; j<m+1; j++) {
            arr[i][j]=s.charAt(j-1)-'0';
         }
      }
     
      chk[1][1]=1;
      bfs(1,1);
      System.out.println(chk[n][m]);
   }
   
   static void bfs(int x, int y) {
	      Queue <Integer> qx=new LinkedList<>();
	      Queue <Integer> qy=new LinkedList<>();
	      chk[x][y]=1;
	      qx.add(x); 
	      qy.add(y); // 처음 시작 좌표를 각 큐에 넣음 (1,1)
	      
	      while(!qx.isEmpty()) {
	         x=qx.poll(); 
	         y=qy.poll();
	         for(int i=0; i<4; i++) { // 상하좌우라서 4
	            if(x+dx[i]>=1 && x+dx[i]<=n // x의 범위가 미로를 벗어나지 않는지
	               && y+dy[i]>=1 && y+dy[i]<=m // y의 범위가 미로를 벗어나지 않는 지
	               && chk[x+dx[i]][y+dy[i]]==0 // chk에서 방문한 기록이 없는 지
	               && arr[x+dx[i]][y+dy[i]]==1) { // arr[x+dx[i]][y+dy[i]]이 1일 때만 이동할 수 있음
	             
	               qx.add(x+dx[i]);
	               qy.add(y+dy[i]);
	               chk[x+dx[i]][y+dy[i]] = chk[x][y]+1;
				}

			}

		}

	}
}