import java.util.HashMap;
import java.util.LinkedList;
/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache {

    LinkedList<Integer> recentlyUsed = new LinkedList<>();
    HashMap<Integer, Integer> cache = new HashMap<>();
    int capacity;
    int count = 0;

    public LRUCache(int capacity) {
        // System.out.printf("creating cache with size: %d\n", capacity);
        this.capacity = capacity;
    }

    // return -1 if not exist
    public int get(int key) {

        // System.out.printf("getting key:%d ", key);
        // I need to update the head of the list if the

        int val = cache.getOrDefault(key, -1);
        if (recentlyUsed.getFirst() == key) {
            recentlyUsed.removeFirst();
            recentlyUsed.addLast(key);
        }
        return val;


    }

    // update value of key if the key exist other wish add to the cache
    // if the new pair causes it to exceed remove the least reecently used key
    // get and putu count as use
    // get and put should run O(1)
    public void put(int key, int value) {
        count++;
        // System.out.printf("putting key:%d val:%d count:%d\n", key, value, count);
        if (count > capacity && !cache.containsKey(key)) {
            int oldestKey = recentlyUsed.getFirst();
            // System.out.printf("putting key:%d val:%d\n", key, value);
            cache.remove(oldestKey);
            recentlyUsed.removeFirst();
        }

        if (!recentlyUsed.isEmpty() && recentlyUsed.getFirst() == key) {
            recentlyUsed.removeFirst();
            recentlyUsed.addLast(key);
        }
        cache.put(key, value);
        recentlyUsed.add(key);

    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(3); // expected: null
        lRUCache.put(1, 1); // expected: null
        lRUCache.put(2, 2); // expected: null
        lRUCache.put(3, 3); // expected: null
        check("get(1)", lRUCache.get(1), 1); // expected: 1
        check("get(2)", lRUCache.get(2), 2); // expected: 2
        check("get(4)", lRUCache.get(4), -1); // expected: -1
        lRUCache.put(4, 4); // expected: null
        check("get(1)", lRUCache.get(1), 1); // expected: 1
        check("get(2)", lRUCache.get(2), 2); // expected: 2
        check("get(3)", lRUCache.get(3), -1); // expected: -1
        check("get(4)", lRUCache.get(4), 4); // expected: 4
        check("get(2)", lRUCache.get(2), 2); // expected: 2
        lRUCache.put(1, 8); // expected: null
        lRUCache.put(3, 7); // expected: null
        check("get(1)", lRUCache.get(1), 8); // expected: 8
        check("get(2)", lRUCache.get(2), 2); // expected: 2
        check("get(3)", lRUCache.get(3), 7); // expected: 7
        check("get(4)", lRUCache.get(4), -1); // expected: -1
        check("get(5)", lRUCache.get(5), -1); // expected: -1
        check("get(2)", lRUCache.get(2), 2); // expected: 2
        check("get(3)", lRUCache.get(3), 7); // expected: 7
        check("get(4)", lRUCache.get(4), -1); // expected: -1
        lRUCache.put(1, 9); // expected: null
        lRUCache.put(6, 6); // expected: null
        check("get(1)", lRUCache.get(1), 9); // expected: 9
        check("get(2)", lRUCache.get(2), -1); // expected: -1
        check("get(3)", lRUCache.get(3), 7); // expected: 7
        check("get(4)", lRUCache.get(4), -1); // expected: -1
        check("get(5)", lRUCache.get(5), -1); // expected: -1
        check("get(6)", lRUCache.get(6), 6); // expected: 6
    }

    private static void check(String call, int actual, int expected) {
        String status = actual == expected ? "OK" : "FAIL";
        System.out.printf("%s -> %d  (expected %d)  %s%n", call, actual, expected, status);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end
