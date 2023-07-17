class Solution {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;

    if (prices.length == 1)
      return maxProfit;

    int left = 0;
    int right = 1;

    while (right < prices.length) {
      if (prices[left] < prices[right]) {
        // Point the left to the right
        maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
      } else {
        // Point the right to the next
        left = right;
      }
      right += 1;
    }

    return maxProfit;
  }
}