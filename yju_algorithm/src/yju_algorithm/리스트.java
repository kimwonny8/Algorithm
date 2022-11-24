package yju_algorithm;

import java.util.Comparator;
import java.util.Scanner;

class Node<E> {
	E data;
	Node<E> next;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

}
class Student {	
	int hakbun;
	String name;
	String mobile;
	
	public Student() {
		
	}
	
	public Student(int hakbun, String name, String mobile) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.mobile = mobile;
	}
	
	public String toString() {
		return hakbun+" "+name+" "+mobile;
	}
	
	public static  final Comparator<Student> NO_ORDER = new NoOderComparator();
	
	private static class NoOderComparator implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return (o1.hakbun > o2.hakbun) ? 1: (o1.hakbun < o2.hakbun) ? -1 : 0 ;
		}

	}
	
	public static  final Comparator<Student> NAME_ORDER = new NameOderComparator();
		
		private static class NameOderComparator implements Comparator<Student> {
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
	
	}
		
	public static  final Comparator<Student> MOBILE_ORDER = new MobileOderComparator();
			
			private static class MobileOderComparator implements Comparator<Student> {
				public int compare(Student o1, Student o2) {
					return o1.mobile.compareTo(o2.mobile);
			}
		
	}
}

class LinkedList<E> {
	Node<E> head; // 머리 포인터
	Node<E> current; // 선택 포인터

	public LinkedList() {
		head = current = null;
	}
	
	public void addFirst(E obj) {
		Node<E> resultNew = new Node<E>(obj, null);
		resultNew.next = head;
		head = resultNew;
		
	}

	// 전체 노드를 표시
	public void dump() {
		current = head;
		while (current != null) {
			System.out.println(current.data);
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
			Node<E> result = head;
			while(result.next != null) {
				result = result.next;
			}
			result.next = new Node<E>(obj, null);
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
				Node<E> result = head; // 스캔 중인 노드
				Node<E> pre = head; // 스캔 중인 노드의 앞쪽 노드
				
				while(result.next != null) {
					pre = result;
					result = result.next;
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
		Scanner sc=new Scanner(System.in);
		Student result;
		Student tmp = new Student();
		LinkedList<Student> list = new LinkedList<>();
		
		list.addFirst(new Student(3,"김땡땡","010-0000-0000"));
		list.addFirst(new Student(2,"김정원","010-1111-1111"));
		list.addFirst(new Student(1,"홍길동","010-2222-2222"));
		list.dump();
		
		System.out.print("찾을 번호: ");
		tmp.hakbun=sc.nextInt();
		result=list.search(tmp, Student.NO_ORDER);
		if(result==null) System.out.println("그 학번의 데이터가 없습니다");
		else System.out.println("학번 검색 성공: "+result);
		
		System.out.print("찾을 이름: ");
		tmp.name=sc.next();
		result=list.search(tmp, Student.NAME_ORDER);
		if(result==null) System.out.println("그 이름의 데이터가 없습니다");
		else System.out.println("이름 검색 성공: "+result);
		
		System.out.print("찾을 번호: ");
		tmp.mobile=sc.next();
		result=list.search(tmp, Student.MOBILE_ORDER);
		if(result==null) System.out.println("그 번호의 데이터가 없습니다");
		else System.out.println("번호 검색 성공: "+result);
		
		
		/*
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
		*/
	}

}
