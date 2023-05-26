import java.util.HashMap;

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 1)
      return strs[0];

    HashMap<String, Integer> map = new HashMap<>();

    for (String str : strs) {
      for (int i = 0; i < str.length(); i++) {
        String prefix = str.substring(0, i + 1);
        if (map.containsKey(prefix)) {
          map.put(prefix, map.get(prefix) + 1);
        } else {
          map.put(prefix, 1);
        }
      }
    }

    String longestCommonPrefixStr = "";
    int longestCommonPrefixNum = 0;

    for (var entry : map.entrySet()) {
      if (entry.getValue() >= longestCommonPrefixNum) {
        longestCommonPrefixStr = entry.getKey();
        longestCommonPrefixNum = entry.getValue();
      }
    }

    if (longestCommonPrefixNum > 1)
      return longestCommonPrefixStr;
    else
      return "";
  }
}

class Solution {
  public String longestCommonPrefix(String[] strs) {
    StringBuilder returnStr = new StringBuilder();
    for (int i = 0; i < strs[0].length(); i++) {
      for (String str : strs) {
        if (i == str.length() || str.charAt(i) != strs[0].charAt(i)) {
          return returnStr.toString();
        }
      }
      returnStr.append(strs[0].charAt(i));
    }

    return returnStr.toString();
  }
}