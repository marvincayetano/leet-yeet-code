# Instead of sorting the array to find the kth largest
# We are going to use heap then pop kth times

import heapq


class Solution:
  def findKthLargest(self, nums: List[int], k: int) -> int:
    heapifiedNums = [-s for s in nums]

    heapq.heapify(heapifiedNums)

    while k > 1:
      heapq.heappop(heapifiedNums)
      k -= 1

    return abs(heapifiedNums[0])

