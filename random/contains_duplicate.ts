/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  if (nums.length === 0) return true;
  if (nums.length === 1) return false;

  // Another XOR maybe
  // Lets try that

  // This is easy with two loop
  // What about with just one loop
  // I had this question
  // With lhl
  const tempObj = {};
  for (let i = 0; i < nums.length; i++) {
    if (!tempObj[nums[i]]) {
      //Falsy
      tempObj[nums[i]] = true;
    } else {
      return true;
    }
  }

  return false;
};
