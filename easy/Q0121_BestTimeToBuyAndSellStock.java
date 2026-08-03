package easy;
public class Q0121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {1,5,6,7,3,2};
        int result = bestTimeToBuyAndSellStock(prices);
        System.out.println(result);
        
    } 
    public static int bestTimeToBuyAndSellStock(int prices[]){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
