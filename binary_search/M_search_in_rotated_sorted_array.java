// The array is sorted in ascending order and rotated at some pivot unknown to you beforehand.
// Similar to finding the minimum value in a rotated sorted array.

class Solution {
  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;

    while (l <= r) {

      int mid = (l + r) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      // left sorted
      if (nums[l] <= nums[mid]) { // We're looking for a value between the mid and left
        if (target > nums[mid] || target < nums[l]) { // It means we're looking for a value in the right part
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      } else {// right sorted // It means we're looking for a value between the mid and right
        if (target < nums[mid] || target > nums[r]) { // It means we're looking for a value in the left part
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      }

    }

    return -1;
  }
}
