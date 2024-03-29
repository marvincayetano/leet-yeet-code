# Same as before but we are looking for the minimum amount of jumps

from typing import List

class Solution:
    def jump(self, nums: List[int]) -> int:
        l, r = 0, 0
        res = 0
        while r < (len(nums) - 1):
            maxJump = 0

            for i in range(l, r + 1):
              maxJump = max(maxJump, i + nums[i])

            l = r + 1
            r = maxJump
            res += 1
        return res

instance = Solution()
print(instance.jump([2,3,1,1,4]))