// Binary Search. We know where to find the minimum if the middle element is greater than the left side or the right side
// By this we know if we go left or right since the array is still sorted
// If right is greater than left, we know the minimum is on the left side, we know we reach the maximum and the minimum is on the left side

class Solution {
  public int findMin(int[] nums) {
    int l = 0;
    int r = nums.length - 1;

    while (l <= r) {
      if (nums[l] <= nums[r]) {
        return nums[l];
      }

      int mid = (l + r) / 2;
      if (nums[mid] >= nums[l]) {
        l = mid + 1;
      } else {
        r = mid;
      }
    }
    return 0;
  }
}