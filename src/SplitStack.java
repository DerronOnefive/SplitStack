import java.util.Stack;

public class SplitStack {

    // Method to split the stack into negatives and non-negatives
    public static void splitStack(Stack<Integer> stack) {
        // Create two auxiliary stacks to hold negative and non-negative numbers
        Stack<Integer> negatives = new Stack<>();
        Stack<Integer> nonNegatives = new Stack<>();

        // Separate negative and non-negative numbers
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                negatives.push(num); // Push negative numbers to the negatives stack
            } else {
                nonNegatives.push(num); // Push non-negative numbers to the non-negatives stack
            }
        }

        // Push negative numbers to the bottom of the original stack
        while (!negatives.isEmpty()) {
            stack.push(negatives.pop());
        }

        // Push non-negative numbers on top of negative numbers in the original stack
        while (!nonNegatives.isEmpty()) {
            stack.push(nonNegatives.pop());
        }
    }

    public static void main(String[] args) {
        // Test cases
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(-5);
        stack1.push(67);
        stack1.push(-45);
        stack1.push(67);
        stack1.push(9);
        stack1.push(0);
        stack1.push(-42);
        stack1.push(56);
        stack1.push(-7);

        System.out.println("Original Stack: " + stack1);
        splitStack(stack1); // Split the stack
        System.out.println("Split Stack: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(-2);
        stack2.push(-3);
        stack2.push(4);
        stack2.push(-5);
        stack2.push(6);
        stack2.push(-7);
        stack2.push(8);
        stack2.push(9);

        System.out.println("\nOriginal Stack: " + stack2);
        splitStack(stack2); // Split the stack
        System.out.println("Split Stack: " + stack2);
    }
}
