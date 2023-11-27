# Python doesn't have a max heap so we can't get the 2 big numbers
# we can still do this using min heap and making the numbers negative

import heapq


class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
      stones = [-s for s in stones]
      heapq.heapify(stones)

      while len(stones) > 1:
        first = heapq.heappop(stones)
        second = heapq.heappop(stones)

        first = first * 1
        second = second * 1

        if(second > first):
           heapq.heappush(stones, second - first)

      stones.append(0)
      return abs(stones[0])
