// We need to check the next warmer day for each day.
// We can use a stack to store the index of the days that we need to check.
// If we found a greater value than the top of the stack, we can pop the stack and calculate the difference between the current day and the day that we poped.
// We keep on popping until we don't have any warmer day or the current day is not greater than the top of the stack.

import java.util.Stack;

class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] ans = new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();

    for (int currDay = 0; currDay < temperatures.length; currDay++) {

      while (!stack.isEmpty() && temperatures[currDay] > temperatures[stack.peek()]) {
        int prevDay = stack.pop();
        ans[prevDay] = currDay - prevDay;
      }

      stack.add(currDay);
    }

    return ans;
  }
}