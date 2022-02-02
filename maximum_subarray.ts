/**
 * @param {number[]} nums
 * @return {number}
 */

// Brute force
var maxSubArray = function (nums) {
  // Check for constraints
  if (nums.length === 1) return nums[0];

  const n = nums.length;
  let maxValue = 0;
};

// Kadanes solution to maxSubArray
function maxSubArrayKadanes(arr) {
  let a1 = 0;
  let a2 = arr[0];
  arr.forEach((i, a) => {
    a1 = Math.max(i, a1 + i);
    a2 = Math.max(a2, a1);
  });
  return a2;
}
