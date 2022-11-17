// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.



// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation:
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.


// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105
// Accepted
// 2,320,547
// Submissions
// 7,200,359


// Prerequisite: Two Sum, two sum II

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      // IF we sort the array first then potentially we can use two pointers
      int[] sortedInt = nums.

      // Left pointer
      int l = 0;

      // Right pointer
      int r = numbers.length - 1;

      // Loop until the left pointer is less than the right pointer
      while(l < r) {
        int currentSum = numbers[l] + numbers[r];

        // If the currentSum is greater than the target, we move the right pointer to the left
        if(currentSum > target) {
          r = r - 1;

        // If the currentSum is less than the target, we move the left pointer to the right
        } else if(currentSum < target) {
          l = l + 1;

        // If the current sum is equal to the target, return the indices
        } else {
          // We added 1 because the indices are 1-indexed and not 0-indexed as leetcode expects
          return new int[] {l + 1, r + 1};
        }

      }

      return new int[] {};
    }
}