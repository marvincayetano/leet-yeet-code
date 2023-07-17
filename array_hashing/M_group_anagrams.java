import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> groupAnagrams = new ArrayList<List<String>>();
    if (strs.length == 0)
      return groupAnagrams;

    HashMap<String, List<String>> map = new HashMap<String, List<String>>();

    for (String str : strs) {
      int alphabet[] = new int[26];
      for (char c : str.toCharArray()) {
        alphabet[c - 'a']++; // To get the index of the alphabet z - a = 26
      }
      String key = Arrays.toString(alphabet);
      if (!map.containsKey(key))
        map.put(key, new ArrayList<>());

      map.get(key).add(str);
    }

    groupAnagrams.addAll(map.values());
    return groupAnagrams;
  }
}