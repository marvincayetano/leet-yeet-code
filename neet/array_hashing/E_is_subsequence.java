import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public boolean isSubsequence(String s, String t) {
    if (s.length() == 0) {
      return true;
    }

    Queue<Character> queue = new LinkedList<Character>();

    for (char c : s.toCharArray()) {
      queue.add(c);
    }

    for (char c : t.toCharArray()) {
      if (queue.isEmpty()) {
        return true;
      }

      if (c == queue.peek()) {
        queue.poll();
      }
    }

    if (queue.isEmpty()) {
      return true;
    }

    return false;
  }
}

class Solution {
  public boolean isSubsequence(String s, String t) {
    int i = 0;
    int j = 0;

    while (i < s.length() && j < t.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
      j++;
    }

    if (i == s.length()) {
      return true;
    }

    return false;
  }
}