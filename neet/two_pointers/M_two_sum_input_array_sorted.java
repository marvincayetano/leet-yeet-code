class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      int sum = numbers[left] + numbers[right];
      if (sum == target) {
        return new int[] { left + 1, right + 1 };
      } else if (sum < target) {
        left += 1;
      } else {
        right -= 1;
      }
    }

    // Solution is guaranteed, so this return is just to satisfy the compiler
    return new int[] {};
  }
}