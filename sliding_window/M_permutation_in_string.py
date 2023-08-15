"""
  Naive approach - Loop through then if we find one that contains those, we loop again until everything match
  Permutation - exact same characters but in the same or different orders
  "abc" "baxyzabc" - we move the window to the right if they are not match with the count
  edge case s1 length is longer than s2
  TODO: This is not a good implementation using sliding window
"""

class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
      if len(s1) > len(s2): return False