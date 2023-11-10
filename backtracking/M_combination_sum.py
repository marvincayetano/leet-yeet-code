# Basically like a decision tree to get all the possible solutions
# TODO: Not that clear solution. Recreate


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
      res = []

      subset = []

      def dfs(i):
          if i >= len(nums):
            res.append(subset.copy()) # [1, 2, 3], [1, 2], [1]
            return

          subset.append(nums[i]) # [1, 2, 3]
          dfs(i + 1)

          subset.pop() # [1, 2], [1]
          dfs(i + 1)

      dfs(0)
      return res


