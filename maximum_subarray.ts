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
var maxSubArrayKadanes = function (nums) {
  var len = nums.length;
  var max = Number.MIN_SAFE_INTEGER;
  var before = 0;
  var now = 0;

  if (!len) return 0;

  for (var i = 0; i < len; i++) {
    now = Math.max(before + nums[i], nums[i]);
    max = Math.max(now, max);
    before = now;
  }

  return max;
};
