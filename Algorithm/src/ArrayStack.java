
public class ArrayStack {
	int top; // top: stack 저장을 위한 index 변수
	int max_size = 10000; // max_size: stack 배열의 최대 크기
	int[] stack;

	public ArrayStack() {
		top = 0; // top: stack의 초기 index는 0
		stack = new int[max_size]; // 배열 생성
	}

	boolean IsEmpty() { // stack에 아무것도 들어있지 않은지 판단하는 함수
		return (top == 0);
	}

	boolean IsFull() { // stack에 더이상 들어갈 공간이 없는지 판단하는 함수
		return (top == max_size);
	}

	int size() { // stack에 현재 들어가있는 데이터의 개수를 return하는 함수
		return top;
	}

	void push(int value) { // value값을 stack에 넣음
		if (IsFull())
			System.out.println("stack overflow!");
		else
			stack[top++] = value;
	}

	Integer peek() { // stack에 가장 최근에 들어간 값을 return하는 함수
		if (top == 0) {
			System.out.println("stack is empty!");
			return null;
		} else {
			Integer value = new Integer(stack[top - 1]);
			return value;
		}
	}

	Integer pop() { // stack에 가장 최근에 들어간 값을 return하고 삭제하는 함수
		if (top == 0) {
			System.out.println("stack is empty!");
			return null;
		} else {
			Integer value = new Integer(stack[--top]);
			return value;
		}
	}
}