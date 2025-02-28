public class Buy_Sell_Stock {
    
    public static int buySellstock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // calc Profit
        for(int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit , profit); // final max profit
            }
            else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 6, 4, 3, 1};
          
        System.out.println("Max profit : " + buySellstock(prices));
    }
}