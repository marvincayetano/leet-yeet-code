// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.



// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9


// Constraints:

// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105
// Accepted
// 1,368,720
// Submissions
// 2,329,723

class Solution {
    public int maxArea(int[] height) {

      // 1. Brute Force
      // 2. Two Pointer

      // Get the minimum of two blocks
      // Basically which block is lower


      // Because we can only trap water until the lower block is reached
      // We can only trap water until the lower block is reached
      //
      // 1. Get the minimum of the two blocks
      // 2. Multiply the minimum by the distance between the two blocks
      // 3. Compare the result to the max
      // 4. Move the pointer of the lower block (because we can only trap water until the lower block is reached)
      // 5. Repeat until the pointers meet each other

    }
}


class Solution {

    public int trap(int[] heights) {
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        int max = heights[0], c = 0;

        // for (int i = 0; i < heights.length; i++) {
        //     left[i] = Math.max(heights[i], max);
        //     max = left[i];
        // }

        // max = heights[heights.length - 1];
        // for (int i = heights.length - 1; i >= 0; i--) {
        //     right[i] = Math.max(heights[i], max);
        //     max = right[i];
        // }

        // for (int i = 0; i < heights.length; i++) {
        //     c = c + Math.min(left[i], right[i]) - heights[i];
        // }
        // return c;
    }
}