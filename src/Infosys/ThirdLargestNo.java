package Infosys;

public class ThirdLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first =0,second =0,third =0;
		int arr[] = {7,10,4};
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second;
				second =first;
				first=arr[i];
				
			}
			else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third)
				third=arr[i];
			
		}
		System.out.println(third);
	}

}
