import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS {
   static int line, node, start;
   static int[][] arr;
   static boolean[] check;
   static Queue<Integer> q = new LinkedList<>();
   static StringBuilder sb = new StringBuilder();

   static void dfs(int start) { //깊이 우선탐색 재귀함수 
      check[start] = true;// 방문여부 표시. 
      sb.append(start + " "); //방문한 숫자 저장 
      for (int i = 1; i <= node; i++) { // 노드수만큼 반복문 돌기. 
         if (arr[start][i] == 1 && !check[i]) //만약 방문해야하는 장소이고 방문하지않는 장소이면 그 위치를 재귀로 호출한다. 
            dfs(i);
      }
   }

   static void bfs(int start) { //넓이 우선탐색 함수 
      check[start] = true; //방문여부 표시
      q.add(start); //방문하는 곳 Que에 추가 
      sb.append(start + " "); //방문한 곳 저장
      //위는 세줄은 처음방문하는 장소만 저장후 그 이후는 while문을 통해 저장된다.
      
      while (!q.isEmpty()) { //큐가 비어질때까지 무한반복 -> 이렇게 되면 끝까지 탐색 후 종료된다. 
         int x = q.poll(); //Que에 담긴 방문하는 장소를 x에 저장한다. 
         for (int i = 1; i <= node; i++) { // node수 만큼 반복
            if (arr[x][i] == 1 && !check[i]) { //방문해야하는 장소이고 방문하지 않았다면 
               q.add(i);//Que에 i값을 추가한다. 
               check[i] = true; //i값을 방문표시 
               sb.append(i + " ");//방문한 곳 저장 
            }
         }
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      node = sc.nextInt();//노드는 방문하는 번호를 말함
      line = sc.nextInt();//노드와 노드사이를 연결한 줄 
      start = sc.nextInt();//시작 지점 
      arr = new int[node + 1][node + 1]; //0번index는 안쓸 예정이므로 node+1로 배열선언 
      for (int i = 0; i < line; i++) { //line 수 만큼 배열에 노드를 저장한다. 
         int a = sc.nextInt();
         int b = sc.nextInt();
         arr[a][b] = arr[b][a] = 1; 
      }
      check = new boolean[node + 1];
      dfs(start);
      sb.append("\n");
      check = new boolean[node + 1];
      bfs(start);
      System.out.println(sb);
   }
}