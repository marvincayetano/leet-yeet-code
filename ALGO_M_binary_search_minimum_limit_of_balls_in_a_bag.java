// You are given an integer array nums where the ith bag contains nums[i] balls. You are also given an integer maxOperations.

// You can perform the following operation at most maxOperations times:

// Take any bag of balls and divide it into two new bags with a positive number of balls.
// For example, a bag of 5 balls can become two new bags of 1 and 4 balls, or two new bags of 2 and 3 balls.
// Your penalty is the maximum number of balls in a bag. You want to minimize your penalty after the operations.

// Return the minimum possible penalty after performing the operations.



// Example 1:

// Input: nums = [9], maxOperations = 2
// Output: 3
// Explanation:
// - Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -> [6,3].
// - Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -> [3,3,3].
// The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.
// Example 2:

// Input: nums = [2,4,8,2], maxOperations = 4
// Output: 2
// Explanation:
// - Divide the bag with 8 balls into two bags of sizes 4 and 4. [2,4,8,2] -> [2,4,4,4,2].
// - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,4,4,4,2] -> [2,2,2,4,4,2].
// - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,4,4,2] -> [2,2,2,2,2,4,2].
// - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,2,2,4,2] -> [2,2,2,2,2,2,2,2].
// The bag with the most number of balls has 2 balls, so your penalty is 2 an you should return 2.
// Example 3:

// Input: nums = [7,17], maxOperations = 2
// Output: 7


// Constraints:

// 1 <= nums.length <= 105
// 1 <= maxOperations, nums[i] <= 109
// Accepted
// 21,406
// Submissions
// 36,085

// 40% solution
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Integer.MAX_VALUE - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int ops = 0;
            for (int n : nums) {
                ops += minOpsToReach(n, mid);
            }
            // System.out.println(mid + ", " + ops);
            // mid can be smaller
            if (ops <= maxOperations) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // System.out.println(minOpsToReach(9 ,1));
        return left;
    }

    public int minOpsToReach(int num, int target) {
        return (num - 1) / target;
    }
}

// 42% solution
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        int result = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid, nums, maxOperations)){
                result = mid;
                high = mid - 1;
            }else {
                low = mid +1 ;
            }
        }
        return result;
    }

    public boolean check(int mid, int nums[], int maxOperations){
        for(int i=0; i<nums.length; i++){
            maxOperations = maxOperations - (nums[i]/mid);
            if(nums[i]%mid == 0){
                maxOperations+=1;
            }
        }
        return maxOperations>=0;
    }
}