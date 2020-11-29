package Amazon;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
	private static LinkedHashMap<Integer, Integer> map;
	static int size;

	LRUCache(int cap) {
		// Intialize the cache capacity with the given
		// cap
		map = new LinkedHashMap<>(cap);
		this.size = cap;

	}

	// This method works in O(1)
	public static int get(int key) {
		// your code here
		if (map.containsKey(key)) {
			int value = map.get(key);
			map.remove(key);
			map.put(key,value);
			return map.get(key);
		} else
			return -1;
	}

	// This method works in O(1)
	public static void set(int key, int value) {
		// your code here
		if (!map.containsKey(key)) {
			if (map.size() == size) {
				for (Integer i : map.keySet()) {
					map.remove(i);
					break;
				}
				map.put(key, value);
			}
			else
				map.put(key, value);
		} else {
			map.remove(key);
			map.put(key, value);
		}

	}
}