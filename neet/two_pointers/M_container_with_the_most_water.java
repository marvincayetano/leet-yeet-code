// This is the perfect medium for two pointers
// Left and Right pointers
// Whichever has the least value we get the power of that
// We save this value to a variable and then we move the pointer
// Which pointer? The one with the least value of the two (left and right)

class Solution {

  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int res = 0;
    while (left < right) {
      int min = Math.min(height[left], height[right]);
      res = Math.max(res, min * (right - left));
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return res;
  }
}