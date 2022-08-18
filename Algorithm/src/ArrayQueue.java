
public class ArrayQueue {

    int[] elements;
    private int front = 0;
    private int rear = 0;
    private int size = 2;
    private int exSize =0;

    public ArrayQueue() {
        elements = new int[size];
    }

    public void offer(int data){
        if(rear == elements.length){
            exSize = rear +5;
            int[] extendElements = new int[exSize];
            for(int i=0; i<rear; i++){
                extendElements[i] = elements[i];
            }
            elements = extendElements;
        }
        elements[rear++] = data;
    }


    public int peek(){
        return elements[front];
    }

    public int poll(){
        if(front == rear) {
            System.out.println("데이터가 존재하지 않습니다.");
            return -1;
        }
        int data = elements[front];
        elements[front++] = 0;
        return data;
    }

    public void remove(){
        if(front == rear) {
            System.out.println("데이터가 존재하지 않습니다.");
        }
        elements[front] = 0;
        front++;
    }

    public void clear(){
        elements = new int[size];
        front=0;
        rear=0;
    }

    // 테스트
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.remove();
        System.out.println(q.peek());
        q.clear();
        System.out.println(q.poll());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}