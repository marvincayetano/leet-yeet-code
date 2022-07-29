/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// The first solution for this
// is bruteforce with two arrays looping which is O(n^2)
var twoSumBF = function (nums, target) {
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

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// The first solution for this
// is not bruteforce of course
// So we are going to use Hash Method
const twoSum = function (nums, target) {
  // We will store the numbers that we seen
  const hash = {};
  // The hash will be in this format
  // key = value, value = key

  // Looping through all
  // But if we already pass through the right number
  // Then we already found the answer
  // Isn't that awesome
  // So we're not looping through all the numbers

  for (let i = 0; i < nums.length; i++) {
    // We're just holding the value
    // so we don't have to call nums[i] everytime
    // Don't worry. This will be garbage collected every loop
    const n = nums[i];

    // We are going to find the value using the key
    // If it is not undefined then we already passed through it
    if (hash[target - n] !== undefined) {
      // So we get the index which is in this format [value] = key
      return [hash[target - n], i];
    }

    // Otherwise we save that as hash for the next iteration;
    hash[n] = i;
  }

  // Well if the return above did not happen then we can
  // say that there's no result
  return [];
};
