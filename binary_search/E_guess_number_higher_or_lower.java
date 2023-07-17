public class Solution extends GuessGame {
  public int guessNumber(int n) {
    int left = 1;
    int right = n;
    int middle = 0;

    while (left <= right) {
      middle = left + (right - left) / 2;

      int guessNumber = guess(middle);
      if (guessNumber == 0) {
        return middle;
      } else if (guessNumber == 1) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }

    return middle;
  }
}