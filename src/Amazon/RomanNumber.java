package Amazon;

public class RomanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 541;
		int m = 1000;
		int temp = n, count = 0, dig = 0;
		String output = "";

		for (int i = 0; i < 4; i++) {
			temp = n / m;
			if (i == 0) {
				while (temp > 0) {
					output += "M";
					temp--;
				}
			}
			if (i == 1) {
				temp = n / m;
				if (temp < 5) {
					if (temp == 4) {
						output += "CD";
					} else {
						while (temp > 0) {
							output += "C";
							temp--;
						}
					}
				} else if (temp >= 5) {
					if (temp == 9) {
						output += "CM";
					} else {
						int x = temp - 5;
						output += "D";
						while (x > 0) {
							output += "C";
							x--;
						}
					}

				}
			}
			if (i == 2) {
				temp = n / m;
				if (temp < 5) {
					if (temp == 4) {
						output += "XL";
					}else{
					while (temp > 0) {
						output += "X";
						temp--;
					}
					}
				} else if (temp >= 5) {
					if (temp == 9) {
						output += "XC";
					} else {
						int x = temp - 5;
						output += "L";
						while (x > 0) {
							output += "X";
							x--;
						}
					}
				}

			}
			if (i == 3) {
				temp = n / m;
				if (temp < 5) {
					if (temp == 4) {
						output += "IV";
					} else {
						while (temp > 0) {
							output += "I";
							temp--;
						}
					}
				} else if (temp >= 5) {
					if (temp == 9) {
						output += "IX";
					} else {
						int x = temp - 5;
						output += "V";
						while (x > 0) {
							output += "I";
							x--;
						}
					}

				}

			}
			n = n % m;
			m = m / 10;
		}

		System.out.println(output);

	}

}
