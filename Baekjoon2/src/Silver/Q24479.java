package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q24479 {
	static int n, m, cnt;
	public static int[] visited;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void dfs(int start) {
        visited[start]=cnt;
        
        for(int i=0; i<graph.get(start).size(); i++){
            int x=graph.get(start).get(i);
            
            // 방문 안했을 경우
            if(visited[x]==0){
                cnt++;
                dfs(x);
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		n=sc.nextInt(); // 정점의 수 n
		m=sc.nextInt(); // 간선의 수 m
		visited= new int[n+1];
		int r=sc.nextInt(); // 시작 정점 r
		
		for(int i=0; i<n+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 맵 제작
		for(int i=0; i<m; i++) {
			int u=sc.nextInt(), v=sc.nextInt(); // 간선 정보
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		// 노드마다 오름차순
        for(int i=0; i<graph.size(); i++){
            Collections.sort(graph.get(i));
        }
        cnt=1;
       
        dfs(r);
        for(int i=0;i<visited.length;i++){
            if(i!=0) sb.append(visited[i]+"\n");
        }
        System.out.print(sb);
	}
}
