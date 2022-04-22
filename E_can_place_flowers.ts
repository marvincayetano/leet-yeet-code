// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false

// Constraints:

// 1 <= flowerbed.length <= 2 * 104
// flowerbed[i] is 0 or 1.
// There are no two adjacent flowers in flowerbed.
// 0 <= n <= flowerbed.length

function canPlaceFlowers(flowerbed: number[], n: number): boolean {
  // Constraint
  if (flowerbed.length === 1) {
    if (flowerbed[0] === 1) {
      return false;
    }

    return true;
  }

  // Easiest I can think of is to check for three following 0 numbers in flowerbed
  // and have an iterator to count how many of those that we have in an array
  let bedAvailableCounter = 0;
  let counter = 0;
  for (const flower of flowerbed) {
    if (flower === 1) {
      counter = 0;
    } else {
      counter += 1;
      if (counter === 3) {
        bedAvailableCounter += 1;
        counter = 1;
      }
    }
  }

  console.log(bedAvailableCounter);
  console.log(bedAvailableCounter, n);
  if (bedAvailableCounter >= n) return true;

  return false;
}
