package Infosys;

@FunctionalInterface
interface Climb{
	int getinput(int num1,int num2);
	default int getBale() {
		return 0;
	}

}
