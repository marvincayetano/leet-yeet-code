// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]


// Constraints:

// 1 <= n <= 8
// Accepted
// 1.4M
// Submissions
// 1.9M
// Acceptance Rate
// 72.5%

class Solution {
    public List<String> generateParenthesis(int n) {

      // We can use a stack to keep track of the numbers
      // If we encounter an operator, we pop the last two numbers and perform the operation
      // If we encounter a number, we push it to the stack
      // If we encounter a closing bracket, we pop the last two numbers and perform the operation

    }
}