package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortThreeNumber {

	public static void main(String[] args) throws IOException{
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
	   ArrayList<Integer> list = new ArrayList<>();
	    for(int i =0;i<arr.length;i++){
	        if(arr[i]==0){
	            list.add(arr[i]);
	        }
	    }
	    for(int i =0;i<arr.length;i++){
	        if(arr[i]==1){
	        	list.add(arr[i]);
	        }
	    }
	    for(int i =0;i<arr.length;i++){
	        if(arr[i]==2){
	        	list.add(arr[i]);
	        }
	    }
	    int output[] = new int[list.size()];
	    int j =0;
	    for(Integer i:list){
	    	output[j]=i;
	    	j++;
	    }
	    for(int i =0;i<output.length;i++){
	    	System.out.println(output[i]+ " ");
	    }
	    
	    
	}


}
