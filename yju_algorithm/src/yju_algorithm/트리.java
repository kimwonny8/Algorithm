package yju_algorithm;

import java.util.Comparator;

class Node<K, V> {
	K key; // 키값
	V data; // 데이터
	Node<K, V> left; // 왼쪽 포인터(왼쪽 자식노드에 대한 참조)
	Node<K, V> right; // 오른쪽 포인터(오른쪽 자식노드에 대한 참조)

	// 생성자 (constructor)
	Node(K key, V data, Node<K, V> left, Node<K, V> right) {
		this.key = key;
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// 키 값을 반환
	K getKey() {
		return key;
	}

	// 데이터를 반환
	V getValue() {
		return data;
	}

	// 데이터를 표시
	void print() {
		System.out.println(data);

	}
}

class BinTree<K, V> {

	private Node<K, V> root; // 루트

	// 비교자(Comparator)
	private Comparator<? super K> comparator = null;

	// 생성자(constructor)
	public BinTree() {
		root = null;
	}

	// 생성자(constructor)
	public BinTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}

	// 두 키값을 비교
	private int comp(K key1, K key2) {
		return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
	}

	// 키로 검색
	public V search(K key) {
		Node<K, V> p = root; // 루트에 주목

		while (true) {
			if (p == null) // 더 이상 나아갈 수 없으면
				return null; // 검색 실패
			int cond = comp(key, p.getKey()); // key와 노드 p의 키를 비교
			if (cond == 0) // 같으면
				return p.getValue(); // 검색 성공
			else if (cond < 0) // key쪽이 작으면
				p = p.left; // 왼쪽 서브트리에서 검색
			else
				p = p.right; // 오른쪽 서브트리에서 검색

		}
	}

	// node를 뿌리를 하는 서브트리에 노드 <K,V>를 삽입
	private void addNode(Node<K, V> node, K key, V data) {
		int cond = comp(key, node.getKey());
		if (cond == 0)
			return; // key가 이진검색트리에 이미 존재
		else if (cond < 0) {
			if (node.left == null)
				node.left = new Node<K, V>(key, data, null, null);
			else
				addNode(node.left, key, data); // 왼쪽 서브트리에 주목
		} else {
			if (node.right == null)
				node.right = new Node<K, V>(key, data, null, null);
			else
				addNode(node.right, key, data); // 오른쪽 서브트리에 주목
		}
	}

	// 노드 삽입
	public void add(K key, V data) {
		if (root == null)
			root = new Node<K, V>(key, data, null, null);
		else
			addNode(root, key, data);
	}

	// 키 값이 key인 노드를 삭제
	public boolean remove(K key) {
		Node<K, V> p = root; // 스캔중인 노드
		Node<K, V> parent = null; // 스캔중인 노드의 부모노드
		boolean isLeftChild = true; // p는 parent의 왼쪽 자식노드인가?

		while (true) {
			if (p == null) // 더이상 나아갈 수 없으면
				return false;// 그 키값은 존재하지 않음
			int cond = comp(key, p.getKey()); // key와 노드 p의 키값을 비교
			if (cond == 0)// 같으면 검색 성공
				break;
			else {
				parent = p; // 가지로 내려가기 전에 부모를 설정
				if (cond < 0) {// key쪽이 작으면
					isLeftChild = true; // 왼쪽의 자식으로 내려감
					p = p.left;// 왼쪽 서브트리에서 검색
				} else {// key쪽이 크면
					isLeftChild = false; // 오른쪽의 자식으로 내려감
					p = p.right; // 오른쪽 서브트리에서 검색
				}
			}
		}
		if (p.left == null) { // p에 왼쪽의 자식이 없음
			if (p == root) // root 노드를 삭제하는 경우
				root = p.right;
			else if (isLeftChild)
				parent.left = p.right; // 부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
			else
				parent.left = p.right; // 부모의 오른쪽 포인터가 오른쪽 자식을 가리킴

		} else if (p.right == null) { // p에 오른쪽 자식이 없음
			if (p == root)
				root = p.left;
			else if (isLeftChild)
				parent.left = p.left; // 부모의 왼쪽 포인터가 왼쪽 자식을 가리킴
			else
				parent.right = p.left; // 부모의 오른쪽 포인터가 왼쪽 자식을 가리킴
		} else { // 자식 노드가 2개인 경우
			parent = p;
			Node<K, V> left = p.left; // 서브트리 가운데 최대 노드
			isLeftChild = true;
			while (left.right != null) { // 최대 노드의 left를 검색
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key = left.key; // left의 키값을 p로 이동
			p.data = left.data; // left의 데이터를 p로 이동
			if (isLeftChild)
				parent.left = left.left; // left를 삭제
			else
				parent.right = left.left;// left를 삭제
		}
		return true;
	}

	// node를 루트로하는 서브트리의 노드를 키값의 오름차순으로 표시 - 중위순회
	private void printSubTree(Node node) {
		if (node != null) {
			printSubTree(node.left); // 왼쪽 서브트리를 키값의 오름차순으로 표시
			System.out.println(node.key + " " + node.data); // node를 표시
			printSubTree(node.right); // 오른쪽 서브트리를 키값의 오름차순으로 표시
		}
	}

	// node를 루트로하는 서브트리의 노드를 키값 후위순회
	private void printSubTree2(Node node) {
		if (node != null) {
			printSubTree(node.left);
			printSubTree(node.right);
			System.out.println(node.key + " " + node.data);
		}
	}

	// 전체 노드를 키값의 오름차순으로 표시
	public void print() {
		printSubTree(root);
	}

}

public class 트리 {
	public static void main(String[] args) {
		BinTree<Integer, String> tree = new BinTree<>();
		tree.add(1, "홍길동1");
		tree.add(2, "홍길동2");
		tree.add(3, "홍길동3");
		tree.add(4, "홍길동4");
		tree.add(5, "홍길동5");

		String result = tree.search(2);
		System.out.println(result);
		tree.print();
	}

}
