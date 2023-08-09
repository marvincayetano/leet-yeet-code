// We need to design a key value store like a hashmap
// All the timestamp in the values should be in increasing order
// that means we can use that sorted array to do binary search
// When using get, we need to find the largest timestamp that is smaller than the given timestamp timestamp <= value.timestamp

class TimeMap {

  public TimeMap() {

  }

  public void set(String key, String value, int timestamp) {

  }

  public String get(String key, int timestamp) {

  }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */