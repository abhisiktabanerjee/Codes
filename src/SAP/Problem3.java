package SAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		List<List<String>> list = new ArrayList<>();
		List<String> initList = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			String str="";
			if (scanner.hasNextLine()) {
				str = scanner.nextLine();
				if (str.isEmpty()) {
					list.add(initList);
					initList=new ArrayList<>();
				}
				else
					initList.add(str);
			}
			else {
				list.add(initList);
				break;
			}
		}
		for (int i=0;i<list.size();i++) {
			String arr[] = new String[list.get(i).size()];
			arr=list.get(i).toArray(arr);
			pattern(arr,i,list.size());
		}
		scanner.close();
	}
	
	private static void pattern(String input[],int index,int testCase) {
		int row = input.length;
		int column = input[0].length();
		int [] starCount = new int[row];
		int col=0;
		int prevCount=0;
		Arrays.fill(starCount, 0);
		for(int i=0;i<row;i++) {
			col=0;
			while (col<column) {
				if (input[i].charAt(col++)=='*')
					starCount[i]++;
			}
		}
		for (int i=0;i<row;i++) {
			col=0;
			StringBuffer sbr = new StringBuffer(column);
			if (i==0) {
				while (col<(column-starCount[i])) {
					sbr.append(".");
					col++;
				}
				while (starCount[i]!=0) {
					sbr.append("*");
					starCount[i]--;
				}
				prevCount=col;
			}
			else {
				while (col<(prevCount-starCount[i])) {
					sbr.append(".");
					col++;
				}
				while (starCount[i]!=0) {
					sbr.append("*");
					starCount[i]--;
				}	
				for (int temp=sbr.length();temp<column;temp++)
					sbr.append(".");
				prevCount=col;
			}
			if (i<row-1)
				System.out.println(sbr.toString());
			else
				System.out.print(sbr.toString());			
		}
		if (index<testCase-1) {
			System.out.println();
			System.out.println("\n");
		}
	}
}