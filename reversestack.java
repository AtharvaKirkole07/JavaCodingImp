import java.util.Stack;

class StackReversal {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println(stack);
        // Reverse the stack using recursion without separate methods
        reverse(stack);
        
        System.out.println("Reversed Stack: " + stack);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        
        // Pop the top element
        int top = stack.pop();
        
        // Recursively reverse the remaining stack
        reverse(stack);
        
        // Insert the element at the bottom
        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            int top = stack.pop();
            insertAtBottom(stack, element);
            stack.push(top);
        }
    }
}
