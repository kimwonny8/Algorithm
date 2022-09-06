package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q24444 {
	static int n, m, cnt;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	public static int [] chk;
	
	public static void bfs(int start) {
		Queue <Integer> q=new LinkedList<>();
		int cnt=1;
		q.add(start);
		chk[start]=cnt++; // 방문 표시
		
		while(!q.isEmpty()) {
			int x=q.poll();
			
			for(int i=0; i<graph.get(x).size(); i++) {
				int next=graph.get(x).get(i);
				if(chk[next]==0) {
				
				q.add(next);
				chk[next]=cnt++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		n=sc.nextInt(); // 정점의 수 n
		m=sc.nextInt(); // 간선의 수 m
		int r=sc.nextInt(); // 시작 정점 r
		
		chk= new int[n+1];
		for(int i = 0; i<=n; i++)
            graph.add(new ArrayList<>());
		
		// 맵 제작
		for(int i=0; i<m; i++) {
			int u=sc.nextInt(), v=sc.nextInt(); // 간선 정보
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
        for(int i=0; i<graph.size(); i++){
            Collections.sort(graph.get(i));
        }

        bfs(r);
        for(int i=1; i<n+1; i++){
            sb.append(chk[i]+"\n");
        }
        System.out.print(sb);
	}
}
