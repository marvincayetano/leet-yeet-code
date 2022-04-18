// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.

// Example 1:

// Input
// ["MinStack","push","push","push","getMin","pop","top","getMin"]
// [[],[-2],[0],[-3],[],[],[],[]]

// Output
// [null,null,null,null,-3,null,0,-2]

// Explanation
// MinStack minStack = new MinStack();
// minStack.push(-2);
// minStack.push(0);
// minStack.push(-3);
// minStack.getMin(); // return -3
// minStack.pop();
// minStack.top();    // return 0
// minStack.getMin(); // return -2

class MinStack {
  private stack: [number, number][] = [];

  constructor() {}

  /**
   * Push element x onto stack.
   * Time Complexity: O(1);
   * Space Complexity: O(n);
   */
  push(x: number): void {
    const min = this.stack.length ? Math.min(this.getMin(), x) : x; // only number in stack
    this.stack.push([x, min]);
  }

  /**
   * Removes the element on top of the stack.
   * Time Complexity: O(1);
   * Space Complexity: O(1);
   */
  pop(): void {
    this.stack.pop();
  }

  /**
   * Get the top element.
   * Time Complexity: O(1);
   * Space Complexity: O(1);
   */
  top(): number {
    return this.stack[this.stack.length - 1][0];
  }

  /**
   * Retrieve the minimum element in the stack.
   * Time Complexity: O(1);
   * Space Complexity: O(1);
   */
  getMin(): number {
    return this.stack[this.stack.length - 1][1];
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
