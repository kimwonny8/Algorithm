import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS {
   static int line, node, start;
   static int[][] arr;
   static boolean[] check;
   static Queue<Integer> q = new LinkedList<>();
   static StringBuilder sb = new StringBuilder();

   static void dfs(int start) { 
      check[start] = true;
      sb.append(start + " "); 
      for (int i = 1; i <= node; i++) {
         if (arr[start][i] == 1 && !check[i]) 
            dfs(i);
      }
   }

   static void bfs(int start) { 
      check[start] = true; 
      q.add(start); 
      sb.append(start + " "); 
      
      while (!q.isEmpty()) { 
         int x = q.poll(); 
         for (int i = 1; i <= node; i++) { 
            if (arr[x][i] == 1 && !check[i]) { 
               q.add(i);
               check[i] = true; 
               sb.append(i + " ");
            }
         }
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      node = sc.nextInt();
      line = sc.nextInt();
      start = sc.nextInt();
      arr = new int[node + 1][node + 1]; 
      for (int i = 0; i < line; i++) { 
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