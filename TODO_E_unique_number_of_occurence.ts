// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Example 1:

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// Example 2:

// Input: arr = [1,2]
// Output: false
// Example 3:

// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true

// Constraints:

// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000

function uniqueOccurrences(arr: number[]): boolean {
  // We can use object or set
  // Constraint if arr.length <= 1

  if (arr.length <= 1) {
    return true;
  }

  const uniqueObj = {};

  // Count all the nums and put it in the object
  for (const num of arr) {
    const tempNum = uniqueObj[num];
    if (tempNum) {
      uniqueObj[num] = tempNum + 1;
    } else {
      uniqueObj[num] = 0;
    }
  }

  // Now that we all have the nums lets loop through the object
  const arrUniqueObj = Object.values(uniqueObj);
  const firstNum = arrUniqueObj[0];

  for (let i = 1; i < arrUniqueObj.length; i++) {
    if (firstNum !== arrUniqueObj[i]) {
      return true;
    }
  }

  return true;
}
