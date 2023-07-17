// Solution using two pointers
class Solution {
  public void reverseString(char[] s) {
    if (s.length == 1)
      return;

    int left = 0;
    int right = s.length - 1;

    while (left < right) {
      // Swap left and right
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;

      left += 1;
      right -= 1;
    }

  }
}