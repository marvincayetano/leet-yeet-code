# Naive solution would be iterate through all the bits until we dont find 1's any more, it's O(32) because of 32 bits
# Bit manipulation solution would be to subtract 1 from the original number and do an AND operation

from typing import List

class Solution:
    def hammingWeight(self, n: int) -> int:
        res = 0
        while n:
            n &= n - 1
            res += 1
        return res
