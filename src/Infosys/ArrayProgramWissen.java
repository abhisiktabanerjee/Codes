package Infosys;

import java.util.HashMap;

public class ArrayProgramWissen {

	public static void main(String[] args) {
		int arr[] = {6,6,7,7,7,10,10,10};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);
		}
		int max =1,key =0;
		boolean duplicate = false;
		HashMap<Integer, Integer> resultmap = new HashMap<>();
		for(Integer i :map.keySet()) {
			if(max<map.get(i)) {
				max = map.get(i);
				duplicate = false;
				key=i;
				
			}
			else if(max==map.get(i)) {
				duplicate = true;
			}
		}
		
		if(max ==1) {
			System.out.println("Number is :"+arr[0]);
		}
		if(duplicate) {
			for(int i =0;i<arr.length;i++) {
				if(resultmap.containsKey(arr[i])) {
					int value = resultmap.get(arr[i])+1;
					if(value==max) {
						System.out.println("Number is :"+arr[i]);
						break;
					}
					else
						resultmap.put(arr[i], value);
				}
				else
					resultmap.put(arr[i], 1);
			}
		}
		else
			System.out.println("Number is :"+key);
		
	}

}
