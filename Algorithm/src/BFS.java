import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int V;
	private LinkedList<Integer> adj[]; // 링크드리스트의 배열
	
	// constructor
	BFS (int v) {
		V = v;
		adj = new LinkedList[v];
		// v개의 LinkedList 선언 및 생성
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList(); 
		}
	}
	void addEdge (int v, int w) { // v번째 LinkedList 에 w를 삽입
		adj[v].add(w); 
	}
	// BFS 함수
	void BFS(int s) {
		boolean visited[] = new boolean[V]; // 각 노드이 방문 여부를 저장하기 위해
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while (queue.size() != 0) {
			// 방문한 노드를 큐에서 추출하고 값을 출력
			s = queue.poll();
			System.out.println(s + " ");
			
			// 방문한 노드와 인접한 모든 노드를 가져온다.
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				// 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}

