package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberofcases = Integer.parseInt(reader.readLine());
		for (int i = 0; i < numberofcases; i++) {
			String str = reader.readLine();
			isPalindrome(str);
		}
	}
	public static void isPalindrome(String str){
		int maxSoFar = 0;
		int first_index=0;
		int last_index=0;
		Boolean arr[][]= new Boolean[str.length()][str.length()];
		for(int i = 0;i<str.length();i++){
			arr[i][i]=true;
			if(i==str.length()-1)
				break;
			if(str.charAt(i)==str.charAt(i+1))
				arr[i][i+1]=true;
			else
				arr[i][i+1]=false;			
		}

		for(int i= str.length()-3;i>=0;i--){
			for(int j =i+2;j<=str.length()-1;j++){
				if((str.charAt(i)==str.charAt(j))&&(arr[i+1][j-1]==true)){
					arr[i][j]=true;
				}
			}
		}
		
		for(int i =0;i<str.length();i++){
			for(int j =str.length()-1;j>=i;j--){
				if(arr[i][j]==true){
					if(maxSoFar<(j-i)){
						maxSoFar=j-i;
						first_index=i;
						last_index=j;
					}
					break;
				}
			}
		}
		System.out.println(str.substring(first_index, last_index+1));
	}
}
