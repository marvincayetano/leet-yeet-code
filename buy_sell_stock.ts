/**
 * @param {number[]} prices
 * @return {number}
 */

// First and easiest solution will
// always be BRUTEFORCE
var maxProfit = function (prices) {
  // Input will be prices will always be >= 1
  if (prices.length === 1) return 0;

  // We can't go back to the first index

  // This holds the current highest numbers
  let currentHighest = 0;

  for (let i = 0; i < prices.length - 1; i++) {
    for (let j = i + 1; j < prices.length; j++) {
      // Bruteforce check every value O(n^2)
      const currentProfit = prices[j] - prices[i];

      if (currentProfit > currentHighest) {
        currentHighest = currentProfit;
      }
    }
  }

  // OR
  // Output can be 0 if there will be no profit
  return currentHighest;
};
