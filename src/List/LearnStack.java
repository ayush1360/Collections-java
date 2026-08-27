package List;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Tiger");
        stack.push("Lion");
        stack.push("Elephant");

        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
