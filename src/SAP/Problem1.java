package SAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= testCases; i++) {
			int normalRevenue = scanner.nextInt();
			int advRevenue = scanner.nextInt();
			int advCost = scanner.nextInt();
			if ((advRevenue - advCost) > normalRevenue) {
				list.add("advertise");
			} else if ((advRevenue - advCost) < normalRevenue)
				list.add("do not advertise");
			else
				list.add("does not matter");
		}
		scanner.close();
		for (int i = 0; i < list.size(); i++) {
			if (i < list.size() - 1)
				System.out.println(list.get(i));
			else
				System.out.print(list.get(i));
		}

	}

}
