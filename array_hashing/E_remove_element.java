class Solution {
  public int removeElement(int[] nums, int val) {
    if (nums.length == 0)
      return 0;
    if (nums.length == 1 && nums[0] == val)
      return 0;

    int left = 0;

    for (int right = 0; right < nums.length; right++) {
      if (nums[right] != val) {
        nums[left] = nums[right];
      } else {
        left += 1;
      }
    }

    return left;
  }
}