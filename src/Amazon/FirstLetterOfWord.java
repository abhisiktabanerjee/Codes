package Amazon;

import java.util.LinkedHashMap;

public class FirstLetterOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bad is good ";
		String str = function(s);
		System.out.println(str);
		

	}

	public static String function(String s) {
		// s=s.trim();

		String result = "";
		result += s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (i == s.length() - 1) {
				if (s.charAt(s.length() - 1) == ' ') {
					result += " ";
					break;
				}
			}
			if (s.charAt(i) == ' ') {
				result += s.charAt(i + 1);
			}
		}

		return result;

	}
}
