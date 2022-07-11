// Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.



// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0


// Constraints:

// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 104


// Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
// Accepted
// 559,846
// Submissions
// 1,274,683

// 70%      copilot answer
public class Solution {
  // Get the minimum size of subarray
  public int minSubArrayLen(int s, int[] nums) {
    int n = nums.length;
    int left = 0, right = 0;
    int sum = 0;
    int minLen = n + 1;
    while (right < n) {
      sum += nums[right];
      while (sum >= s) {
        minLen = Math.min(minLen, right - left + 1);
        sum -= nums[left++];
      }
      right++;
    }
    return minLen == n + 1 ? 0 : minLen;
  }
}

// 11% solution
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 1, j = nums.length, min = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (windowExist(mid, nums, s)) {
                j = mid - 1;
                min = mid;
            } else i = mid + 1;
        }
        return min;
    }


    private boolean windowExist(int size, int[] nums, int s) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= size) sum -= nums[i - size];
            sum += nums[i];
            if (sum >= s) return true;
        }
        return false;
    }
}

// 70%
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;

        int i = 0, j = 0 , sum = 0 , min = Integer.MAX_VALUE;
        while(j < nums.length){
            sum += nums[j++];
            while(sum >=s){
                min = Math.min(min, j - i); //(old j) - i + 1 = j - i
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}