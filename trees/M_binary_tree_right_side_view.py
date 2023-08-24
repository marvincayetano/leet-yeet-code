"""
  Naive approch is to go to each possible nodes starting from the right side
  BFS level order traversal is easier it seems. we get the right most value everytime
  add the row values to the queue then keep track of the right side
  after each row, we keep the right side in the result array
  for the queue, we pop one then add the child nodes to the queue
"""


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import collections


class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
      res = []
      q = collections.deque([root])

      while q:
         rightSide = None
         qLen = len(q)

         for i in range(qLen):
            node = q.popleft()
            if node:
                rightSide = node
                q.append(node.left)
                q.append(node.right)

         if rightSide:
            res.append(rightSide.val)
      return res