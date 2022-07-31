
public class ArrayStack {
	int top; // top: stack ������ ���� index ����
	int max_size = 10000; // max_size: stack �迭�� �ִ� ũ��
	int[] stack;

	public ArrayStack() {
		top = 0; // top: stack�� �ʱ� index�� 0
		stack = new int[max_size]; // �迭 ����
	}

	boolean IsEmpty() { // stack�� �ƹ��͵� ������� ������ �Ǵ��ϴ� �Լ�
		return (top == 0);
	}

	boolean IsFull() { // stack�� ���̻� �� ������ ������ �Ǵ��ϴ� �Լ�
		return (top == max_size);
	}

	int size() { // stack�� ���� ���ִ� �������� ������ return�ϴ� �Լ�
		return top;
	}

	void push(int value) { // value���� stack�� ����
		if (IsFull())
			System.out.println("stack overflow!");
		else
			stack[top++] = value;
	}

	Integer peek() { // stack�� ���� �ֱٿ� �� ���� return�ϴ� �Լ�
		if (top == 0) {
			System.out.println("stack is empty!");
			return null;
		} else {
			Integer value = new Integer(stack[top - 1]);
			return value;
		}
	}

	Integer pop() { // stack�� ���� �ֱٿ� �� ���� return�ϰ� �����ϴ� �Լ�
		if (top == 0) {
			System.out.println("stack is empty!");
			return null;
		} else {
			Integer value = new Integer(stack[--top]);
			return value;
		}
	}
}