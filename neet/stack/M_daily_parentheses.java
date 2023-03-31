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

      // 1. Create a list to store the result
      // 2. Create a helper function to generate the result
      // 3. The helper function takes in the current string, the number of open parentheses, and the number of closed parentheses
      // 4. If the number of open parentheses is greater than the number of closed parentheses, then we can add a closed parentheses
      // 5. If the number of open parentheses is less than n, then we can add an open parentheses
      // 6. If the number of open parentheses is equal to n, then we can add a closed parentheses
      // 7. If the number of open parentheses is equal to n and the number of closed parentheses is equal to n, then we have a valid parentheses
      // 8. Return the result

      List<String> result = new ArrayList<>();

    }
}