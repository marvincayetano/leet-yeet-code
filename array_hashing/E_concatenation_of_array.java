class Solution {
  public int[] getConcatenation(int[] nums) {
    // Create a new array of double the size of nums
    int[] result = new int[nums.length * 2];
    int pointer = 0;
    for (int i = 0; i < 2; i++) {
      for (int num : nums) {
        result[pointer] = num;
        pointer++;
      }
    }

    return result;
  }
}