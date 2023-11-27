# Kindda like a sliding window
# We dont add anything that's making the total negative, we start somewhere positive
# We only need to return the biggest number so we can just keep that in a variable as we go through the array

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        res = nums[0]

        total = 0
        for n in nums:
            total += n
            res = max(res, total)
            if total < 0:
                total = 0
        return res
