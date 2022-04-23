// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21

function reverse(x: number): number {
  // Make it positive if it isn't
  const xPositive = x * 1;

  const reversedNumber = parseInt(
    xPositive.toString().split("").reverse().join("")
  );

  // Check if it goes outside of signed 32-bit
  if (reversedNumber > 0x7fffffff) {
    return 0;
  }

  return x < 0 ? reversedNumber * -1 : reversedNumber;
}
