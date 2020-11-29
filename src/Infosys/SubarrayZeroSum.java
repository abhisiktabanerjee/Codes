package Infosys;

public class SubarrayZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,3,4,-4,5,6};
		int indexbeg=0,indexend=0;
		int curr_sum =0;
		
		for(int i =0;i<arr.length;i++) {
			curr_sum=arr[i];
			if(curr_sum==0) {
				System.out.println("index is "+i);
				break;
			}
			for (int j =i+1;j<arr.length;j++) {
				curr_sum+=arr[j];
				if(curr_sum==0) {
					System.out.println("sub array from " + i+ " to "+ j);
					break;
				}
			}
		}
		if(curr_sum>0)
			System.out.println("No subarray with sum 0");
	}

}
