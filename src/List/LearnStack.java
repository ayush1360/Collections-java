package List;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        // create a stack
        Stack<String> stack = new Stack<>();

        // add elements using push()
        stack.push("Tiger");
        stack.push("Lion");
        stack.push("Elephant");

        System.out.println(stack);

        // to check current top element use peek()
        System.out.println(stack.peek());

        // to remove top element use pop()
        stack.pop();

        System.out.println(stack.peek());
    }
}
