"""
  We need to find where the split occured, meaning where the most common ancestor is
  if p > current and q > current we go right, we go left otherwise
  If we cant go either way then we found the answer
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        cur = root

        while cur:
            if p.val > cur.val and q.val > cur.val:
              cur = cur.right
            elif p.val < cur.val and q.val < cur.val:
              cur = cur.left
            else:
               return cur
