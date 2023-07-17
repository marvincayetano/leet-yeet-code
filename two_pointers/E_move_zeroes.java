class Solution {
  public void moveZeroes(int[] nums) {
    if (nums.length == 1)
      return;

    int left = 0;
    int right = 1;

    while (right < nums.length) {
      if (nums[right] == 0 && nums[left] == 0) {
        right += 1;
        continue;
      }

      if (nums[left] == 0) {
        // Swap left and right
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
      }

      right += 1;
      left += 1;
    }

  }
}