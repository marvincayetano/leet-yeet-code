// Given a string s, find the length of the longest
// substring
//  without repeating characters.



// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

class Solution {
    public int lengthOfLongestSubstring(String s) {
      // This uses the sliding window technique
      // We use a set to keep track of the characters in the current window
      int longestLength = 0; // This is to set the longest
      // This is gonna be O(n) by the way
      HashSet<Character> set = new HashSet<>();

      // We use two pointers to keep track of the window
      // The left pointer is the start of the window
      // The right pointer is the end of the window
      // We use the right pointer to expand the window
      // We use the left pointer to shrink the window
      // We use the set to keep track of the characters in the current window


    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
            List<Character> substringL = new ArrayList<>();
            int largestlength = 0;
            for(int right = 0; right < s.length(); right++) {
                if(substringL.contains(s.charAt(right))) {
                    // get the index of the char
                    int index = substringL.indexOf(s.charAt(right));
                    substringL.remove(index);
                    if(index > 0)
                        substringL.subList(0, index).clear();
                }
                substringL.add(s.charAt(right));
                largestlength = Math.max(largestlength, substringL.size());
            }
            return largestlength;
    }
}