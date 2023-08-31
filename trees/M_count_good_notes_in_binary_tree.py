"""
  good node is less than the parent
  using preorder traversal? dfs
  everytime we go to the next node we just send the maxvalue we have
  we then check if that is still greater than or equal the one we currently have
  recursive
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:

      def dfs(node, maxVal):
        if not node:
           return 0

        res = 1 if node.val >= maxVal else 0
        maxVal = max(maxVal, node.val)
        res += dfs(node.left, maxVal)
        res += dfs(node.right, maxVal)
        return res

      return dfs(root, root.val)