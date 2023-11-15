# Backtracking always uses decision tree
# TODO: Still don't get this

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
      res = []

      subset = []
      def dfs(i):
          if i >= len(nums):
            res.append(subset.copy())
            return

          # decision to include nums[i] this is basically the left decision
          subset.append(nums[i])
          dfs(i + 1)

          # decision to NOT include nums[i] this is basically the right decision
          subset.pop()
          dfs(i + 1)

      dfs(0)
      return res