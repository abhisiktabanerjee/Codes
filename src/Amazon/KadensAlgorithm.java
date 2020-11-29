package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KadensAlgorithm {

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
			maximumSum(noOfInt, arr);

		}

	}

	public static void maximumSum(int totalCount, int arr[]) {

		int maxSum = 0;
		int maxSoFar = 0;
		for (int i = 0; i < totalCount; i++) {
			maxSum = maxSum + arr[i];
			if(maxSoFar<maxSum){
				maxSoFar=maxSum;
			}
			if(maxSum<0)
				maxSum=0;

		}
		if(maxSoFar==0){
			Arrays.sort(arr);
			maxSoFar = arr[totalCount-1];
		}
		System.out.println(maxSoFar);
	}

}
