package yju_algorithm;

import java.util.Scanner;
import yju_algorithm.IntStack.EmptyIntStackException;


class IntStack {
	public IntStack() {

	}

	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터

	// --- 실행시 예외: 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// --- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// --- 생성자(constructor) ---//
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

	// --- 스택에 x를 푸시 ---//
	public int push(int x) throws OverflowIntStackException {
		// 스택이 가득 참
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// --- 스택에서 데이터를 팝 ---//
	public int pop() throws EmptyIntStackException {
		// 스택이 빔
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// --- 스택을 비움 ---//
	public void clear() {
		ptr = 0;
	}

	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return ptr;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return ptr >= capacity;
	}

}

public class 스택 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack stack = new IntStack(10);

		while (true) {
			System.out.print("1)push 2)pop 3)peek 0)종료 선택하세요: ");
			int menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("시스템 종료.");
				return;
			} 
			else {
				switch (menu) {
				case 1:
					System.out.print("데이터를 입력하세요: ");
					int num = sc.nextInt();
					stack.push(num);
					break;
				case 2:
					try {
						System.out.println(stack.pop() + "이 pop 되었습니다.");
					} catch (EmptyIntStackException e) {
						//e.printStackTrace();
						System.out.println("스택이 비어 있어서 pop을 할 수 없습니다.");
					}
					break;
				case 3:
					try {
						System.out.println("peek는 " + stack.peek() + " 입니다.");
					} catch (EmptyIntStackException e) {
						//e.printStackTrace();
						System.out.println("스택이 비어 있어서 peek을 할 수 없습니다.");
					}
					break;
				
				default :
					System.out.println("0~3 중에 입력하세요");
					break;
				}
			}

		}
	}
}
