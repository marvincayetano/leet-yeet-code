# Without repeating the characters
# If you repeat it you have to use your idle time
# Get the minimum idle time you can use
# Do this using Max heap
# CBCBA_A_A = 9
# ABCABCA = 7
# I feel like there's a better solution for this than using maxHeap


from collections import Counter, deque
import heapq


class Solution:
  def leastInterval(self, tasks: List[str], n: int) -> int:
    count = Counter(tasks) # Count all the tasks A A B A C A = eg. 4A
    maxHeap = [-cnt for cnt in count.values()] # Now we get the numbers but convert it to negative because there's no maxheap in python
    heapq.heapify(maxHeap)

    time = 0
    q = deque() # [-cnt, time]

    while maxHeap or q:
      time += 1

      if not maxHeap: # If maxHeap is empty
        time = q[0][1]
      else:
        cnt = 1 + heapq.heappop(maxHeap)
        if cnt:
          q.append([cnt, time + n])
      if q and q[0][1] == time:
          heapq.heappush(maxHeap, q.popleft()[0])
    return time