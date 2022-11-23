package yju_algorithm;

import java.util.Comparator;

class Node<E> {
	E data;
	Node<E> next;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

}

class LinkedList<E> {
	Node<E> head; // 머리 포인터
	Node<E> current; // 선택 포인터

	public LinkedList() {
		head = current = null;
	}

	// head에 노드를 삽입하는 메서드
	public void addFirst(E obj) {
		// 데이터를 활용해 노드 객체를 생성
		Node<E> ptrNew = new Node<E>(obj, null);

		// 노드 객체의 다음 노드 객체의 위치를 현재 head값으로 설정한다.
		ptrNew.next = head;
		// 새로운 노르를 head로 설정한다.
		head = ptrNew;
	}

	// 전체 노드를 표시
	public void dump() {
		current = head;
		while (current != null) {
//			System.out.println("현재 객체: "+current);
//			System.out.println("다음 객체: "+current.next);
			System.out.println("현재 데이터: " + current.data);
			current = current.next;
		}
	}

	// 노드 검색
	public E search(E obj, Comparator<? super E> c) {
		current = head;
		while (current != null) {
			// current의 데이터와 매개변수로 온 obj와 비교
			if (c.compare(obj, current.data) == 0) {
				return current.data;
			}
			current = current.next;
		}

		return null;
	}
	
	// last에 노드를 삽입하는 메서드
	public void addLast(E obj) {
		if(head == null) {
			addFirst(obj);
		} else {
			Node<E> ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = new Node<E>(obj, null);
			current = new Node<E>(obj, null);
		}
	}
	
	// head 노드 삭제
	public void removeFirst() {
		if(head != null) {
			head = head.next;
			current = head.next;
		}
	}
	
	// last 노드 삭제
	public void removeLast() {
		if(head != null) {
			if(head.next == null) {
				removeFirst(); 
			}
			else {
				Node<E> ptr = head; // 스캔 중인 노드
				Node<E> pre = head; // 스캔 중인 노드의 앞쪽 노드
				
				while(ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null; // pre 는 삭제 뒤의 꼬리노드
				current = pre;
			}
		}
	}
}

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int result = o1.compareTo(o2);
		return result;
	}

}

public class 리스트 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.addFirst("a");
		linkedList.addFirst("b");
		linkedList.addFirst("c");
		linkedList.dump();

		StringComparator compare = new StringComparator();
		String res = linkedList.search("b", compare);
		System.out.println("검색 결과: " + res);
		
		System.out.println("addLast: ");
		linkedList.addLast("d");
		linkedList.dump();
		
		System.out.println("removeFirst: ");
		linkedList.removeFirst();
		linkedList.dump();
		
		System.out.println("removeLast: ");
		linkedList.removeLast();
		linkedList.dump();
	}

}
