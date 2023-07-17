class Solution {
  public int arrangeCoins(int n) {
    // log n using gauss formula
    int left = 0;
    int right = 1;
    int result = 0;
    long middle = 0;
    long coins = 0;

    while (left <= right) {
      middle = left + (right - left) / 2;
      coins = (middle / 2) * (middle + 1);
      if (coins > n) {
        right = int(middle - 1);
      } else {
        left = int(middle + 1);
        result = Math.max(middle, result);
      }

    }

    return result;
  }
}