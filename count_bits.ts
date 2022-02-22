function countBits(n: number): number[] {
  let ans = [0];
  for (let i = 1; i <= n; i++) {
    // last bit of a number i can be identified by performing i%2 i.e. if a number if odd/even, the last bit will be 1/0
    // if we remove last bit from any number i, the remaining number will be i/2
    // numberOfBits(i) = numberOfBits(i/2) + i%2
    ans[i] = ans[Math.floor(i / 2)] + (i % 2);
  }
  return ans;
}
