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

// O(n)
var maxProfit = function (prices) {
  var n = prices.length;
  var minPrice = Number.MAX_SAFE_INTEGER;
  var maxProfit = 0;

  for (var i = 0; i < n; i++) {
    // [7,1,5,3,6,4]
    const todayPrice = prices[i];

    if (minPrice > todayPrice) minPrice = prices[i];
    // MinPrice = 7
    // MinPrice = 1
    // Else if todaysProfit(from the loop) > maxProfit
    else if (todayPrice - minPrice > maxProfit)
      maxProfit = todayPrice - minPrice;
    // 5 - 1 = 4 > 0, maxProfit = 5 - 1 = 4

    // The idea is to mark down the min price
    // Then check the max price everytime todays price is higher
    // than the min price
  }
  return maxProfit;
};
