public class StackExample {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        System.out.println(st.pop());
    
    }
}

class Stack {
    int[] stack;
    int capacity, size, top;

    Stack(int n) {
        stack = new int[n];
        capacity = n;
        size = 0;
        top = -1;
    }

    void push(int x) {
        if (size == capacity) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
        size++;
    }

    int pop() {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = stack[top];
        stack[top--] = -1;
        size--;
        return x;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return size == 0;
    }
}
