package Infosys;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainString = "abcdefghbcx";
		String sub = "bcx";

		subString(mainString, sub);

	}

	public static void subString(String mainString, String sub) {
		int subLength = sub.length();
		int counter = 0;
		for (int i = 0; i < mainString.length(); i++) {
			if (mainString.charAt(i) == sub.charAt(0)) {
				int temp = i;
				while (counter < subLength) {
					if (mainString.charAt(temp) == sub.charAt(counter)) {
						counter++;
						temp++;
					} else {
						counter = 0;
						break;
					}
				}
				if (counter == subLength) {
					System.out.println("True");
					break;
				}

			} else
				continue;
		}
		if (counter != subLength)
			System.out.println("false");
	}

}
