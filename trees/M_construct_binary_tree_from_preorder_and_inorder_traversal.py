"""
  Preorder - Top Left Right
  Inorder - Left Top Right/Right Left Child
  oh. preorder and inorder are given, you just have to create a new tree
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
