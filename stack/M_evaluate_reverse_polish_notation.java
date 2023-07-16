// We just loop through the tokens and use a stack to store the numbers.
// If we find a number we push that to the stack
// Otherwise we do the operation and pop twice. We're expecting to have two numbers in the stack.
// We use those numbers to do the operation and push the result back to the stack.
// The stack that only increases is called a monotonic increasing stack.

import java.util.Stack;

class Solution {
  Stack<Integer> stack = new Stack<Integer>();

  public int evalRPN(String[] tokens) {

    for (int i = 0; i < tokens.length; i++) {
      switch (tokens[i]) {
        case "+":
          stack.push(stack.pop() + stack.pop());
          break;
        case "-":
          int a = stack.pop();
          int b = stack.pop();
          stack.push(b - a);
          break;
        case "/":
          int x = stack.pop();
          int y = stack.pop();
          stack.push(y / x);
          break;
        case "*":
          stack.push(stack.pop() * stack.pop());
          break;
        default: // number
          stack.push(Integer.parseInt(tokens[i]));
          break;
      }
    }

    return stack.pop();
  }
}