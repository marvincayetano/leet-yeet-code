import java.util.Stack;

class MinStack {
  // We can use two stacks to implement a min stack.
  // One stack is used to store the actual stack elements,
  // The other stack will be used to store the minimum values. This one always has
  // the minimum element on the top at any point of time.
  // If we pop a value from the original we should also pop from the min stack.

  Stack<Integer> stack;
  Stack<Integer> minStack;

  public MinStack() {
    stack = new Stack<Integer>();
    minStack = new Stack<Integer>();
  }

  public void push(int val) {
    stack.push(val);
    // Get the minimum value from the min stack.
    int minVal = Math.min(val, minStack.empty() ? val : minStack.peek());
    minStack.push(minVal);
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}