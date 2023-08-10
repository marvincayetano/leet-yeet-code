// We need to design a key value store like a hashmap
// All the timestamp in the values should be in increasing order
// that means we can use that sorted array to do binary search
// When using get, we need to find the largest timestamp that is smaller than the given timestamp timestamp <= value.timestamp

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TimeMap {
  HashMap<String, List<Pair<String, Integer>>> map;

  public TimeMap() {
    map = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    if (!map.containsKey(key))
      map.put(key, new ArrayList<>());

    map.get(key).add(new Pair(value, timestamp));
  }

  public String get(String key, int timestamp) {
    if (!map.containsKey(key))
      return "";

    List<Pair<String, Integer>> list = map.get(key);
    return search(list, timestamp);
  }

  public String search(List<Pair<String, Integer>> list, int timestamp) {
    int start = 0;
    int end = list.size() - 1;
    while (start < end) {
      int mid = start + (end - start + 1) / 2;
      if (list.get(mid).getValue() <= timestamp)
        start = mid;
      else
        end = mid - 1;
    }

    return list.get(start).getValue() <= timestamp
        ? list.get(start).getKey()
        : "";
  }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */