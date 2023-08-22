"""
  We use BFS here, to use the it we need a queue, every time we go to a level
  we add all the values to a queue, if there's no more then we get all the values from that queue
  then put it in the array sublist, if everything is done then we gather all the sublist and put it in a single array
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from ast import List
import collections


class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]: