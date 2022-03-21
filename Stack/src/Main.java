public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println(stack.empty());

        stack.push(4);
        stack.push(8);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        stack.pop();
        System.out.println(stack.peek());
    }
}
