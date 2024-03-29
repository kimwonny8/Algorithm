package yju_algorithm;

// 링버퍼를 이용한 큐를 사용하여 100보다 작은 정수 100개를 랜덤하게 생성하여 인큐하고, 
// full 발생시 디큐 시작, empty 나면 인큐 진행

class IntArrayQueue {
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	public IntArrayQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// --- 실행시 예외: 스택이 비어있음 ---//
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// --- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();

		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	// --- 큐에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다---//
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[i] == x) // 검색 성공
				return i;
		return -1; // 검색 실패
	}

	public void clear() {
		num = 0;
	}

	public int capacity() {
		return capacity;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	// --- 큐에서 데이터를 피크(맨앞 데이터를 들여다봄 ) ---*/
	public int peek() {
		/*
		 * if (num <= 0) throw new EmptyIntArrayQueueException(); // 큐가 비어 있음
		 */	
		return que[num - 1];
	}

	
	public boolean isFull() {
		return num >= capacity;
	}

	public void print(int x, int i) {
		System.out.printf("[%d]%d 인큐 front=%d, rear=%d, num=%d\n", i, x, front, rear, num);
	}

	public void print2(int x) {
		System.out.printf("%d 디큐 front=%d, rear=%d, num=%d\n", x, front, rear, num);
	}
}

public class 큐 {
	public static void main(String[] args) {
		int QUEUE_SIZE = 20;
		int ENQUE_CNT = 100;
		int RANDOM_NUM = 100;

		IntArrayQueue q = new IntArrayQueue(QUEUE_SIZE);
	/*
		Random rand = new Random();
		int cnt = 1;
		for (int i = 0; i < ENQUE_CNT; i++) {
			int tmp = rand.nextInt(RANDOM_NUM);
			if (!q.isFull()) {
				q.print(q.enque(tmp), cnt);
				cnt++;
			} else {
				i--; // 이건 횟수에 포함되면 안되므로 빼줘야 함
				System.out.println("full 발생");
				while (q.size() != 0) {
					q.print2(q.deque());
				}
				System.out.println("Empty 발생");
			}

		}
		*/
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		System.out.println(q.deque());
		System.out.println(q.peek());
		
	}
}
