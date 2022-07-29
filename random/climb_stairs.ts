/**
 * @param {number} n
 * @return {number}
 */

//  Input: n = 10
//  Output:
//  Explanation: There are three ways to climb to the top.
//  1. 1 step + 1 step + 1 step + 1 step + 1 step ... 10x
//  2. 2 step + 2 step + 2 step + 2 step
//  3  2 step + 2 step + 2 step + 1 step + 1 step
//  3  2 step + 2 step + 1 step + 1 step + 1 step + 1 step
//  5  2 step + 1 step + 1 step + 1 step + 1 step + 1 step + 1 step
//  5  1 step + 1 step + 1 step + 1 step + 1 step + 1 step + 1 step + 1 step
//  2. 5 step + 5 steps
//  3. 4 steps + 1 step

// Possible solutions
// Fibonacci sequence
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
var climbStairs = function (n) {
  if (n == 1 || n == 0) return 1; // our base cases

  // First fibbonacci
  let first = 1;
  // Second fibbonacci
  let second = 2;

  for (let i = 3; i <= n; i++) {
    let next = first + second;
    first = second;
    second = next;
  }
  return second;
};

// https://www.enjoyalgorithms.com/blog/climbing-stairs-problem
