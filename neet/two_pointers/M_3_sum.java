import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    LinkedList<List<Integer>> solution = new LinkedList<List<Integer>>();

    // Reducing the length to 2 because of left and right pointers
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0) {
        int left = i + 1;
        int right = nums.length - 1;
        int target = 0 - nums[i]; // Target because we need to make this 0. We can use this to compare with sum as
        // it makes positive negative and vice versa

        while (left < right) {
          if (nums[left] + nums[right] == target) {
            ArrayList<Integer> newSolution = new ArrayList<>();
            newSolution.add(nums[i]);
            newSolution.add(nums[left]);
            newSolution.add(nums[right]);
            solution.add(newSolution);
            // Found a new solution? then move both pointer

            // We want to skip duplicates
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            // We want to skip duplicates
            while (left < right && nums[right] == nums[right - 1]) {
              right--;
            }
            left++;
            right--;
          } else if (nums[left] + nums[right] < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }

    return solution;
  }
}