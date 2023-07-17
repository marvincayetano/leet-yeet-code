class Solution {
  public int lengthOfLastWord(String s) {
    int lastWordNum = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        if (lastWordNum >= 1) {
          return lastWordNum;
        } else {
          lastWordNum = 0;
        }
      } else {
        lastWordNum += 1;
      }
    }

    return lastWordNum;
  }
}
