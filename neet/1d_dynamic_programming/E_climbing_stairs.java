class Solution {
  public int climbStairs(int n) {
    int left = 1;
    int right = 1;

    for (int i = 0; i < n - 1; i++) {
      int temp = left + right;
      left = right;
      right = temp;
    }

    return right;
  }
}