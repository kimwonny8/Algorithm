import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS {
   static int line, node, start;
   static int[][] arr;
   static boolean[] check;
   static Queue<Integer> q = new LinkedList<>();
   static StringBuilder sb = new StringBuilder();

   static void dfs(int start) { //���� �켱Ž�� ����Լ� 
      check[start] = true;// �湮���� ǥ��. 
      sb.append(start + " "); //�湮�� ���� ���� 
      for (int i = 1; i <= node; i++) { // ������ŭ �ݺ��� ����. 
         if (arr[start][i] == 1 && !check[i]) //���� �湮�ؾ��ϴ� ����̰� �湮�����ʴ� ����̸� �� ��ġ�� ��ͷ� ȣ���Ѵ�. 
            dfs(i);
      }
   }

   static void bfs(int start) { //���� �켱Ž�� �Լ� 
      check[start] = true; //�湮���� ǥ��
      q.add(start); //�湮�ϴ� �� Que�� �߰� 
      sb.append(start + " "); //�湮�� �� ����
      //���� ������ ó���湮�ϴ� ��Ҹ� ������ �� ���Ĵ� while���� ���� ����ȴ�.
      
      while (!q.isEmpty()) { //ť�� ����������� ���ѹݺ� -> �̷��� �Ǹ� ������ Ž�� �� ����ȴ�. 
         int x = q.poll(); //Que�� ��� �湮�ϴ� ��Ҹ� x�� �����Ѵ�. 
         for (int i = 1; i <= node; i++) { // node�� ��ŭ �ݺ�
            if (arr[x][i] == 1 && !check[i]) { //�湮�ؾ��ϴ� ����̰� �湮���� �ʾҴٸ� 
               q.add(i);//Que�� i���� �߰��Ѵ�. 
               check[i] = true; //i���� �湮ǥ�� 
               sb.append(i + " ");//�湮�� �� ���� 
            }
         }
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      node = sc.nextInt();//���� �湮�ϴ� ��ȣ�� ����
      line = sc.nextInt();//���� �����̸� ������ �� 
      start = sc.nextInt();//���� ���� 
      arr = new int[node + 1][node + 1]; //0��index�� �Ⱦ� �����̹Ƿ� node+1�� �迭���� 
      for (int i = 0; i < line; i++) { //line �� ��ŭ �迭�� ��带 �����Ѵ�. 
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