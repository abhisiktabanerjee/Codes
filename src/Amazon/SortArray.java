package Amazon;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.*;

public class SortArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberofcases = Integer.parseInt(reader.readLine());
		for (int i = 0; i < numberofcases; i++) {
			int noOfInt = Integer.parseInt(reader.readLine());
			int arr[] = new int[noOfInt];
			String[] intArray = reader.readLine().split(" ");
			for (int j = 0; j < noOfInt; j++) {
				arr[j] = Integer.parseInt(intArray[j]);
			}
			sortedArray(noOfInt, arr);
		}
	}

	public static void sortedArray(int totalCount, int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < totalCount; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}

		Map<Integer, Integer> sortedMap = map.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed()
						.thenComparing(Map.Entry<Integer, Integer>::getKey))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (n1, n2) -> n1, LinkedHashMap::new));

		for (int i : sortedMap.keySet()) {
			if (sortedMap.get(i) > 1) {
				for (int j = 0; j < sortedMap.get(i); j++) {
					System.out.println(i + " ");
				}
			} else {
				System.out.println(i + " ");
			}
		}

	}

}
