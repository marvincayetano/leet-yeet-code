class Solution {
  public boolean validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      // If the characters are not equal, we can remove either the left or right
      // character
      if (s.charAt(left) != s.charAt(right)) {
        // We only need to run this one time because the most we can remove is 1
        return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
      }

      left += 1;
      right -= 1;
    }

    return true;
  }

  boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }
}