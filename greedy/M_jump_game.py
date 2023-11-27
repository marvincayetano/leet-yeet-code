# Instead of making a decision tree starting from left to right
# We can use a goal post and start from the right to the left
# We only need to know if the i - 1 from the left can reach the last array
# Then do the same with the other indexes

from typing import List


class Solution:
  def canJump(self, nums: List[int]) -> bool:
    goal = len(nums) - 1

    for i in range(len(nums) -2, -1, -1): # This is how to start from the right
      if i + nums[i] >= goal:
        goal = i

    if goal == 0:
      return True
    else:
      return False

instance = Solution()
print(instance.canJump([3,2,1,1,4]))