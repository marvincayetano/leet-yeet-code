# We can sum all the numbers in the array
# Then sum the range 1 - 5 then subtract that with the sum of the numbers in the array

from typing import List

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        res = len(nums)

        # This is more complicated, he couldve two different loops for sum
        # then just subtract the total from each other
        for i in range(len(nums)):
            print(i)
            print("nums", nums[i])
            print("i - nums[i]", i - nums[i])
            print("res before", res)
            res += i - nums[i]
            print("res after", res)

        return res


instance = Solution()
instance.missingNumber([0, 1,3,4,5])