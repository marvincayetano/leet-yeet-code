import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class top_k_frequent_elements {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    List<Integer> bucket[] = new ArrayList[nums.length + 1];

    for (int num : nums)
      // If there's value to that key, use integer sum to add 1 to it
      count.merge(num, 1, Integer::sum);

    // Add all the numbers to the specific count index
    for (int key : count.keySet()) {
      int freq = count.get(key);
      if (bucket[freq] == null)
        bucket[freq] = new ArrayList<>();
      bucket[freq].add(key);
    }

    // Grab all the numbers from the end of the array but only get k length
    int index = 0;
    int[] res = new int[k];
    for (int i = nums.length; i >= 0; i--)
      if (bucket[i] != null)
        for (int val : bucket[i]) {
          res[index++] = val;
          if (index == k)
            return res;
        }
    return res;
  }
}
