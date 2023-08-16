"""
  We need to remove a node from the end of the list
  To do this we need two pointers
  First we point both at the beginning and then we increment the right pointer to the number given
  Then we keep incrementing both pointers until the right pointer reaches null
  That's when we know we reach the end and then we can just remove the left pointer
  But how do we remove the pointer from previous node if we are in the node we need to remove
  We use a dummy node
"""

class Solution:
  def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
    dummy = ListNode(0, head)
    left = dummy
    right = head

    # Move the right pointer to the node n
    while n > 0 and right:
      right = right.next
      n = n - 1

    while right:
      left = left.next
      right = right.next

    left.next = left.next.next

    return dummy.next