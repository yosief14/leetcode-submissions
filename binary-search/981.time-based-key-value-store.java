import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * @lc app=leetcode id=981 lang=java
 *
 * [981] Time Based Key-Value Store
 */

// @lc code=start
class TimeMap {
    record Entry(String mood, int timestamp) {
    };

    private final HashMap<String, List<Entry>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    // Store key val pair at the given timestamp
    public void set(String key, String value, int timestamp) {

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Entry(value, timestamp));

    }

    // Return value pointed to by key where the stored time stamp is less than
    // timestamp given
    // if there are multiple values with earlier time stamps return largest time
    // stamp that is less than given `timestamp`
    // if no vals return ""
    public String get(String key, int timestamp) {
        List<Entry> list = map.get(key);
        if (list == null) {
            return "";
        }

        int min = -1;

        int l = 0, r = map.get(key).size() - 1, m = 0;

        while (l <= r) {
            m = (l + r) / 2;
            int mid = map.get(key).get(m).timestamp;
            if (mid <= timestamp) {
                min = Math.max(m, min);
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return min == -1 ? "" : list.get(min).mood;
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        // timeMap.set("alice", "happy", 1); // store the key "alice" and value "happy" along with timestamp = 1.
        // timeMap.get("alice", 1); // return "happy"
        // timeMap.get("alice", 2); // return "happy", there is no value stored for timestamp 2, thus we return the
        //                          // value at timestamp 1.
        // timeMap.set("alice", "sad", 3); // store the key "alice" and value "sad" along with timestamp = 3.
        // timeMap.get("alice", 3);
        
        //["TimeMap", "set", ["key1", "value1", 10], "get", ["key1", 1], "get", ["key1", 10], "get", ["key1", 11]]
        timeMap.set("key1", "value1", 10);
        timeMap.get("key1", 1);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
// @lc code=end

/*
 * [10]
 * what if I just keep going keeping track of smallest m index
 * [1,2,3,4,5,6]
 * l = 2 r = 5
 * min = 2
 * 
 * [3,4,5,6]
 * 
 * l = 2 = 3 r = 5 = 6
 * m = 3 = 4
 * min = 3
 * l = 4 r = 5
 * 
 * if m < timestamp and the next num >= return it
 * store candidate logic
 * need to check for bigger
 * l = m +1
 * 
 * 
 * [3,4,5,6]
 * 
 * if i just return the number before once I've found a smaller number
 */