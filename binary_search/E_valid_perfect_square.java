class Solution {
  public boolean isPerfectSquare(int num) {
    if (num == 1)
      return true;
    long left = 1;
    long right = num;

    long middle = 0;
    long square = 0;

    while (left <= right) {
      middle = left + (right - left) / 2;
      square = middle * middle;

      if (square < num) {
        // move the left pointer to the right
        left = middle + 1;
      } else if (square > num) {
        right = middle - 1;
      } else {
        return true;
      }
    }

    return false;
  }
}