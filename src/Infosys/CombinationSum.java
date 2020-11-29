package Infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://practice.geeksforgeeks.org/problems/combination-sum-part-2/0
public class CombinationSum {

	public static void main(String[] args) {

		int[] inputArray = { 10, 1, 2, 7, 6, 1, 5 };
		int length = inputArray.length;
		int sum = 8;
		System.out.println(new CombinationSum().checkCombination(inputArray, length, sum));
	}

	private List<List<Integer>> checkCombination(int input[], int length, int sum) {
		 Arrays.sort(input);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();

		backTrack(result, list, input, sum, 0);

		return result;

	}

	private void backTrack(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int position) {

		int sum = 0;
		for (int x : list) {
			sum += x;
		}

		if (sum == target) {
			result.add(new ArrayList<Integer>(list));
			return;
		}

		if (sum < target) {
			for (int i = position; i < candidates.length; i++) {
				if (position != i && candidates[i] == candidates[i - 1]) {
					continue;
				}
				list.add(candidates[i]);
				backTrack(result, list, candidates, target, i + 1);
				list.remove(list.size() - 1);
			}
		}
	}

}
