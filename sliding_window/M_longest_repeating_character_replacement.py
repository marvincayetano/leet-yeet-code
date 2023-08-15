"""
  Were using a sliding window so the solution will be (WindowLen - Count[Most Repeating Char]) = Answer <= K
  Our window is valid if the Answer is less than or equal to K
  Left and right pointer are both gonna be in the beggining then we move the R to right until it reaches the end or if the window is not valid anymore
  Then we move the left until we reach the right
"""

class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}
        res = 0 # We only need to return the maximum length we find

        l = 0

        for r in range(len(s)):
          # Increment the letter in the count hashmap
          count[s[r]] = 1 + count.get(s[r], 0) # Otherwise return 0

          print(count.values())
          # Check if the window is valid if not then move the left pointer to the right until it is valid
          # While decrementing the value from the count hashmap
          while (r - l + 1) - max(count.values()) > k:
            count [s[l]] -= 1
            l += 1

          res = max(res, r - l + 1)

        return res