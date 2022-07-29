// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

// Given an integer n, return true if n is an ugly number.

// Example 1:

// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3
// Example 2:

// Input: n = 1
// Output: true
// Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
// Example 3:

// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes the prime factor 7.

// Constraints:

// -231 <= n <= 231 - 1

function isUgly(num: number): boolean {
  if (num < 1) return false;
  if (num === 1) return true;

  var divisor = [2, 3, 5];

  for (var i = 0; i < divisor.length; i++) {
    while (num && num % divisor[i] === 0) {
      num = Math.floor(num / divisor[i]);
    }
  }

  return num === 1;
}
