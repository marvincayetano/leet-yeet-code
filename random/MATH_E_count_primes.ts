// Given an integer n, return the number of prime numbers that are strictly less than n.

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// Example 2:

// Input: n = 0
// Output: 0
// Example 3:

// Input: n = 1
// Output: 0

// Constraints:

// 0 <= n <= 5 * 106

function countPrimes(n: number): number {
  // since 2 is prime we set count to 1
  let count = 1;

  for (let i = 3; i < n; i++) {
    if (isPrime(i)) count++;
  }

  return count;
}

function isPrime(n: number): boolean {
  if (n <= 1) return false;

  for (let i = 2; i < n; i++) if (n % i == 0) return false;

  return true;
}

// public int countPrimes(int n) {
//   boolean[] isPrime = new boolean[n];
//   for (int i = 2; i < n; i++) {
//      isPrime[i] = true;
//   }
//   // Loop's ending condition is i * i < n instead of i < sqrt(n)
//   // to avoid repeatedly calling an expensive function sqrt().
//   for (int i = 2; i * i < n; i++) {
//      if (!isPrime[i]) continue;
//      for (int j = i * i; j < n; j += i) {
//         isPrime[j] = false;
//      }
//   }
//   int count = 0;
//   for (int i = 2; i < n; i++) {
//      if (isPrime[i]) count++;
//   }
//   return count;
// }
