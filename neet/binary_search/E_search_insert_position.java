// Given a sorted array of distinct integers and a target value, return the
// index if the target is found. If not, return the index where it would be if
// it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

class Solution {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int middle = 0;

    while (left <= right) {
      middle = left + ((right - left) / 2);
      // This is basically binary search
      // but instead of returning -1 if the target is not found
      // return the middle index

      if (target > nums[middle]) {
        left = middle + 1;
      } else if (target < nums[middle]) {
        right = middle - 1;
      } else {
        return middle;
      }
    }

    return left;
  }
}

class Solution2 {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int middle = 0;

    if (target < nums[0])
      return 0;
    if (target > nums[nums.length - 1])
      return nums.length;

    while (left <= right) {
      middle = left + ((right - left) / 2);
      // This is basically binary search
      // but instead of returning -1 if the target is not found
      // return the middle index

      if (target > nums[middle]) {
        left = middle + 1;
      } else if (target < nums[middle]) {
        right = middle - 1;
      } else {
        return middle;
      }
    }

    return left + 1;
  }
}