public class Stack {
    private int[] elements = new int[16];
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    /** Construct a stack with the specified maximum capacity */
    public Stack(int capacity) {
        int stack[] = new int[16];
    }

    /** Push a new integer into the top of the stack */
    public void push(int value) {
        elements[size] = value;
        size++;
    }


    /** Return and remove the top element from the stack */
    public int pop() {
        size--;

        int data;
        data = elements[size];
        elements[size] = 0;

        return data;
    }

    /** Return the top element from the stack */
    public int peek() {
        return elements[size-1];
    }

    /** Test whether the stack is empty */ //Returns true if empty (size = 0).
    public boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}

