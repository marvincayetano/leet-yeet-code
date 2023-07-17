import java.util.HashMap;

class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int currentNum = nums[i];
      if (map.containsKey(currentNum) && i - map.get(currentNum) <= k) {
        return true;
      } else {
        map.put(currentNum, i);
      }
    }

    return false;
  }
}