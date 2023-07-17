import java.util.Arrays;

class Solution {
  public int minimumDifference(int[] nums, int k) {
    if (nums.length <= 1)
      return 0;

    int left = 0;
    int right = k - 1;
    int minimumDifference = Integer.MAX_VALUE;

    int[] sortedNum = nums.clone();
    Arrays.sort(sortedNum);

    while (right < nums.length) {
      minimumDifference = Math.min(minimumDifference, sortedNum[right] - sortedNum[left]);

      right += 1;
      left += 1;
    }

    return minimumDifference;
  }
}