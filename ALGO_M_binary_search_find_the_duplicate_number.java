// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.



// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3


// Constraints:

// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.


// Follow up:

// How can we prove that at least one duplicate number must exist in nums?
// Can you solve the problem in linear runtime complexity?
// Accepted
// 923,764
// Submissions
// 1,566,668

// SORT 16.42%
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }
}

// SET 29.66%
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
}

// Negative marking 51.42%
class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplicate = cur;
                break;
            }
            nums[cur] *= -1;
        }

        // Restore numbers
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(nums[i]);

        return duplicate;
    }
}

// ARRAY HASHMAP 42.83%
class Solution {
    public int store(int[] nums, int cur) {
        if (cur == nums[cur])
            return cur;
        int nxt = nums[cur];
        nums[cur] = cur;
        return store(nums, nxt);
    }

    public int findDuplicate(int[] nums) {
        return store(nums, 0);
    }
}

// Binary search solution 35%
class Solution {

    public int findDuplicate(int[] nums) {
        // 'low' and 'high' represent the range of values of the target
        int low = 1, high = nums.length - 1;
        int duplicate = -1;

        while (low <= high) {
            int cur = (low + high) / 2;

            // Count how many numbers in 'nums' are less than or equal to 'cur'
            int count = 0;
            for (int num : nums) {
                if (num <= cur)
                    count++;
            }

            if (count > cur) {
                duplicate = cur;
                high = cur - 1;
            } else {
                low = cur + 1;
            }
        }
        return duplicate;
    }
}

// Floyd's Tortoise and Hare (Cycle Detection) 72%
class Solution {
    public int findDuplicate(int[] nums) {

        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];

        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}