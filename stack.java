public class Stack {

    int top;
    int[] arr;
    int maxSize;

    // constructor
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        top = -1;
    }

    // method to add an element to the top of the stack
    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = element;
    }

    // method to remove and return the top element of the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int poppedElement = arr[top];
        top--;
        return poppedElement;
    }

    // method to view the top element without removing it
    public int peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // get number of elements in stack
    public int size() {
        return top + 1;
    }

    // check if stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {

        Stack stk = new Stack(1000);

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);

        System.out.println("Top element: " + stk.peek());
        System.out.println("Popped element: " + stk.pop());
        System.out.println("Stack size: " + stk.size());
    }
}
