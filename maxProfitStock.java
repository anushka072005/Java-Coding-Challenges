public class maxProfitStock {

    public static int stock(int price[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
    
        for(int i = 0; i < price.length; i++) {
            if(price[i] > buyPrice) {
                int profit = price[i] - buyPrice;  // today's profit
                maxProfit = Math.max(profit,maxProfit);   // max profit
            }
            else {
                buyPrice = price[i];
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 6, 4,  3, 1};
        int price1[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Max Profit is : " + stock(price));
        System.out.println("Max Profit is : " + stock(price1));
    }
}
