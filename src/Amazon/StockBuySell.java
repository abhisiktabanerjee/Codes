package Amazon;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2};
		int result = maxProfit(arr);
		System.out.println(result);
		
	}
	    public static int maxProfit(int[] prices) {
	        int profit =0;
	        int bought=prices[0];
	        for(int i =0;i<prices.length;i++){
	        	if(profit<(prices[i]-bought))
	        		profit = prices[i]-bought;
	            if (prices[i]<bought){
	                bought =prices[i];
	            }
	        }
	        return profit;
	        
	    }

}
