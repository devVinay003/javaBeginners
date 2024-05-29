public class hello21 {
    private int maxSize ;
    private int[] stackArray ;
    private int top ;

    // Constructor to initialize the stack
    public void Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) { 
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return stackArray[top--];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;
        }
        return stackArray[top];
    }
    public static void main(String... newyearargs){ 
		System.out.println("Vimal Bhaiya Bantu.");

	}

} 