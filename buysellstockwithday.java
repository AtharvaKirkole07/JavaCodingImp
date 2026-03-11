import java.util.*;

class stock1 {
    public static void main(String[] args) {
        int[] prices = {7, 5, 1, 3, 2, 4};
        int profit = 0;
        int buy = prices[0];
        int buyDay = 0; // Track the day to buy
        int sellDay = 0; // Track the day to sell

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                buyDay = i; // Update the day to buy
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
                sellDay = i; // Update the day to sell
            }
        }

        System.out.println("Maximum Profit: " + profit);
        System.out.println("Buy on day: " + buyDay);
        System.out.println("Sell on day: " + sellDay);
    }
}
