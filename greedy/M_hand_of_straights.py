# Pretty straight forward we just need to check if in the triplets
# there is a number that is equal to the target
# We skip the ones with a number that is greater
# We use set to keep track of the indexes that are good

from typing import List

class Solution:
    def mergeTriplets(self, triplets: List[List[int]], target: List[int]) -> bool:
        good = set()

        for t in triplets:
            if t[0] > target[0] or t[1] > target[1] or t[2] > target[2]:
                continue
            for i, v in enumerate(t):
                if v == target[i]:
                    good.add(i)
        return len(good) == 3


# instance = Solution()
# print(instance.jump([2,3,1,1,4]))