/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// The first solution for this
// is bruteforce with two arrays looping which is O(n^2)
var twoSum = function (nums, target) {
  // The constraint is that there will always be nums
  // Or nums will never be length === 0

  // We are going to loop through the first one then sum the rest
  // To find the target
  for (let i = 0; i < nums.length; i++) {
    for (let j = 0; j < nums.length; j++) {
      if (nums[i] + nums[j] === target && i !== j) {
        return [i, j];
      }
    }
  }

  return [];
};
