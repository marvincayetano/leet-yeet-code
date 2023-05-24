class Solution {
  public int[] replaceElements(int[] arr) {
    int greatestMax = -1;

    if (arr.length == 1) {
      arr[0] = greatestMax;
      return arr;
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      int newMax = Math.max(greatestMax, arr[i]);
      arr[i] = greatestMax;
      greatestMax = newMax;
    }

    return arr;
  }
}