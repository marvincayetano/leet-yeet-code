"""
We only need to return the length of the maximum length of characters without duplicates
We are using set to make sure there's no duplicate
We keep removing the left character if we find a duplicate
This solution is O(n), we're only passing one time
"""

class Solution:
  def lengthOfLongestSubstring(self, s: str) -> int:
    charSet = set()
    l = 0
    result = 0

    for r in range(len(s)):
      while s[r] in charSet:
        charSet.remove(s[l])
        l += 1

      charSet.add(s[r])
      result = max(result, r - l + 1)

    return result
