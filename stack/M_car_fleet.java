// Cars travelling next to each other is called car fleet / convoy / caravan
// The one travelling ahead is the leader which determines the speed of the
// fleet
// For example if the leader is slower than the follower, the follower will
// change its speed

// To solve this problem we need to get the time to reach the target for each
// car. Then we sort the cars by position and calculate the number of car
// fleets
// We are using a 2d array to store the position and speed of each car
// We need to sort the array so the positions are set
// Then we loop to start at the end
// We get the time it takes for the car to reach the target
// If the stack is not empty and the time is less than the top of the stack
// then we continue, otherwise we push the time to the stack

// The car fleet number is the stack length

// Single car is also a car fleet

// Determine the number of car fleets is the problem

import java.util.Arrays;
import java.util.Stack;

class Solution {

  public int carFleet(int target, int[] position, int[] speed) {
    if (position.length == 1)
      return 1;

    Stack<Double> stack = new Stack<>();
    int[][] combine = new int[position.length][2];

    for (int i = 0; i < position.length; i++) {
      combine[i][0] = position[i];
      combine[i][1] = speed[i];
    }

    Arrays.sort(combine, java.util.Comparator.comparingInt(o -> o[0]));

    for (int i = combine.length - 1; i >= 0; i--) {
      double currentTime = (double) (target - combine[i][0]) /
          combine[i][1];
      if (!stack.isEmpty() && currentTime <= stack.peek()) {
        continue;
      } else {
        stack.push(currentTime);
      }
    }
    return stack.size();
  }
}