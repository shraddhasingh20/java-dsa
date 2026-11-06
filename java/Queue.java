public class Queue {
    int[] queue;
    int capacity, front, rear, size;

    Queue(int n){
        queue = new int[n];
        capacity = n;
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = x;
        size++;
    }

    int dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int x = queue[front];                 
        front = (front + 1) % capacity;       
        size--;
        return x;
    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    void printQueue(){
        int i = front;
        int count = 0;
        while(count < size){
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.printQueue();

        System.out.println("Dequeued element: " + q.dequeue()); 
        q.printQueue(); 

        System.out.println("Front element: " + q.peek()); 
    }
}