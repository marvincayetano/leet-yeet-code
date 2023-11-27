# We just need to get the good start position
# If it's negative we try the next position
# gas - cost = diff = check if negative

from typing import List

class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        start = len(gas) - 1
        end = 0

        total = gas[start] - cost[start]

        while start >= end:
            while total < 0 and start >= end:
                start -= 1
                total += gas[start] - cost[start]
            if start == end:
                return start
            total += gas[end] - cost[end]
            end += 1
        return -1


# instance = Solution()
# print(instance.jump([2,3,1,1,4]))