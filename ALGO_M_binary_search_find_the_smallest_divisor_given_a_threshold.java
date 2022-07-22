// Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

// Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

// The test cases are generated so that there will be an answer.



// Example 1:

// Input: nums = [1,2,5,9], threshold = 6
// Output: 5
// Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
// If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
// Example 2:

// Input: nums = [44,22,33,11,1], threshold = 5
// Output: 44


// Constraints:

// 1 <= nums.length <= 5 * 104
// 1 <= nums[i] <= 106
// nums.length <= threshold <= 106
// Accepted
// 88,719
// Submissions
// 162,393

// Bruteforce 21%
class Solution {
    public long computeSum(int[] nums, int right) {
        long sum = 0;
        for (int n : nums) {
            sum += n / right + (n % right == 0 ? 0 : 1);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 2;
        while (computeSum(nums, right) > threshold) {
            left = right;
            right <<= 1;
        }
        while (left <= right) {
            int pivot = left + ((right - left) >> 1);
            long num = computeSum(nums, pivot);

            if (num > threshold) left = pivot + 1;
            else right = pivot - 1;
        }
        return left;
    }
}

// 73%
class Solution {
    public int smallestDivisor(int[] nums, int threshold)  {
        int m = 0;
        int l = 1;
        int r = max(nums);

        while (l <= r) {
            if (sum(nums, threshold, m = (l + r) / 2))
                l = m + 1;
            else r = m - 1;
        }
        return l;
    }

    private static int max(int[] nums) {
        int max = 0;

        for (int n : nums) {
            max = Math.max( max, n );
        }
        return max;
    }

    private static boolean sum(int[] nums, int t, int d) {
        int sum = 0;

        for (int n : nums) {
            sum += (n - 1) / d + 1;
        }
        return sum > t;
    }
}