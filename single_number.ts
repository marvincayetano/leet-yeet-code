// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  // There's always gonna be an edge case
  // where
  if (nums.length === 0) return 0;
  if (nums.length === 1) return nums[0];

  // Linear complexity
  // How
  // Push and pop maybe
  // XOR? yikes

  let result = 0;
  for (let i = 0; i < nums.length; i++) {
    result = result ^ nums[i];
  }

  return result;
};
