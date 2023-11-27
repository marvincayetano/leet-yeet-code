# Using XOR to cancel out duplicate 1

from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for n in nums:
            res = n ^ res
        return res

# 4 1 2 1 2