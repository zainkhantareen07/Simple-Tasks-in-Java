import java.util.Stack;

public class StackinJava {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // Peek top element
        System.out.println("Top: " + stack.peek());

        // Pop element
        System.out.println("Removed: " + stack.pop());

        System.out.println(stack);

        // Check empty
        System.out.println(stack.isEmpty());
    }
}