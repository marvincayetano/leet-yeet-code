class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1)
      return nums.length;

    int left = 0;
    int right = 1;
    int counter = 1;

    while (right < nums.length) {
      if (nums[left] == nums[right]) {
        // It's a duplicate
        right++;
      } else {
        // It's not a duplicate
        counter += 1;
        nums[left + 1] = nums[right];
        // We move the left pointe to the next positionk
        left += 1;
      }
    }

    return counter;
  }
}