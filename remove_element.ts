// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
  // Edge case here again
  if (nums.length === 0) return 0;

  // [0,1,2,2,3,0,4,2]
  // [0,1,2,2,3,0,4,2]
  // [0,1,null,2,3,0,4,2]
  // targetedIndexes = [2]
  // [0,1,null,null,3,0,4,2]
  // targetedIndexes = [2, 3]
  // [0,1,3,null,x3,0,4,2]
  // targetedIndexes = [3, 4]
  // [0,1,3,0,x3,x0,4,2]
  // targetedIndexes = [4, 5]
  // [0,1,3,0,4,x0,x4,2]
  // targetedIndexes = [5, 7]
  // [0,1,3,0,4,x0,x4,null]

  let targetedIndexes = [];
  let count = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === val) {
      nums[i] = null;
      count += 1;

      targetedIndexes.push(i);
      continue;
    }

    if (targetedIndexes.length > 0) {
      // put the non same value here
      nums[targetedIndexes.shift()] = nums[i];
      targetedIndexes.push(i);
    }
  }

  return nums.length - count;
  // Return is the number of elements left = k
};

// BETTER CODE
var removeElement = function (nums, val) {
  let j = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] !== val) {
      nums[j++] = nums[i];
    }
  }

  //nums.length = j; // Chop the surplus values - not needed for LC submission
  return j;
};
