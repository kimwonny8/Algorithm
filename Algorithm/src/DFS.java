import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	private int V;
	private LinkedList<Integer> list[]; // ��ũ�帮��Ʈ�� �迭
	
	DFS(int v) {
		V = v;
		list = new LinkedList[v];
		// v���� LinkedList ���� �� ����
		for (int i = 0; i < v; ++i) {
			list[i] = new LinkedList(); 
		}
	}
	void addEdge (int v, int w) { // v��° LinkedList �� w�� ����
		list[v].add(w); 
	}
	// DFS �Լ�
	void DFS(int v) { // v�� ���۳���!
		boolean visited[] = new boolean[V]; // �� ����� �湮 ���θ� �����ϱ� ����
		DFSUtil(v, visited);
	}
	// DFS���� ȣ��Ǵ� �Լ�
	void DFSUtil(int v, boolean visited[])  {
		// ���� ��带 �湮�� ������ üũ (visited�� v��° ��Ҹ� true��)
		visited[v] = true;
		System.out.println(v + " ");
		
		// �湮�� ���� ������ ��� ��带 ������ �´�
		Iterator<Integer> it = list[v].listIterator();
		while (it.hasNext()) {
			int n = it.next();
			// �湮���� ���� ���� �ش� ��带 �ٽ� ���� �����Ͽ� DFSUtil�� ȣ��
			if (!visited[n])
				DFSUtil(n, visited); // ���ȣ��!
		}
	}
}
