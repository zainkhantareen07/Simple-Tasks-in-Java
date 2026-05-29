import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack);
    }
}