package Amazon;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException {
		// code
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberofcases = Integer.parseInt(reader.readLine());
		for (int i = 0; i < numberofcases; i++) {
			int noofchar = Integer.parseInt(reader.readLine());
			String str = reader.readLine();
			String input[] = str.split(" ");
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < input.length; j++) {
				sb.append(input[j]);
			}
			str = sb.toString();
			printchar(noofchar, str);
		}

	}

	public static void printchar(int noofchar, String str) {
		String result = "";
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(Character.toString(str.charAt(i)))) {
				int value = map.get(Character.toString(str.charAt(i)));
				map.put(Character.toString(str.charAt(i)), value + 1);
			} else {
				map.put(Character.toString(str.charAt(i)), 1);
			}
			for(String s :map.keySet()){
				if(map.get(s)==1){
					if(i==0){
						result=result+s;
					}
					else{
						result = result +" "+s;
					}
					break;
					
				}
			}
			if(!map.containsValue(1)){
				result = result + " "+"-1";
			}
			
			

		}
		System.out.println(result);
	}
}