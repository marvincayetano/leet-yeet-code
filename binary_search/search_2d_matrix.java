// Since this is already sorted, we know we can use binary search
// to find the row, then binary search to find the column.
// We check the first and last element if the target is in between
// We then go either left or right depending on the value < then left > then
// right
// If we find the possible row, we can use binary search to find the right
// target

class Solution {
  // Time: O(log(mn)) | Space: O(1)
  public boolean searchMatrix2(int[][] matrix, int target) {
    if (matrix.length == 0)
      return false;

    int rows = matrix.length;
    int columns = matrix[0].length;

    int low = 0;
    int high = rows * columns;

    while (low < high) {
      int mid = (low + high) / 2;
      int row = mid / columns;
      int column = mid % columns;

      if (matrix[row][column] == target) {
        return true;
      } else if (matrix[row][column] < target) {
        // If the target is greater than the current value, we know we can go right
        // so we set the low/left pointer to the mid + 1
        low = mid + 1;
      } else {
        // If the target is less than the current value, we know we can go left
        // so we set the high/right pointer to the mid
        high = mid;
      }
    }
    return false;
  }
}