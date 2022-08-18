import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int V;
	private LinkedList<Integer> adj[]; // ��ũ�帮��Ʈ�� �迭
	
	// constructor
	BFS (int v) {
		V = v;
		adj = new LinkedList[v];
		// v���� LinkedList ���� �� ����
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList(); 
		}
	}
	void addEdge (int v, int w) { // v��° LinkedList �� w�� ����
		adj[v].add(w); 
	}
	// BFS �Լ�
	void BFS(int s) {
		boolean visited[] = new boolean[V]; // �� ����� �湮 ���θ� �����ϱ� ����
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while (queue.size() != 0) {
			// �湮�� ��带 ť���� �����ϰ� ���� ���
			s = queue.poll();
			System.out.println(s + " ");
			
			// �湮�� ���� ������ ��� ��带 �����´�.
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				// �湮���� ���� ���� �湮�� ������ ǥ���ϰ� ť�� ����
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}

