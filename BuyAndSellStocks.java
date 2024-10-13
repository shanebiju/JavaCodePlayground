import java.util.*;

class BuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minimum = prices[0];
        for (int price : prices) {
            minimum = Math.min(price, minimum);
            maxProfit = Math.max(price - minimum, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        BuyAndSellStocks obj = new BuyAndSellStocks();
        int result = obj.maxProfit(prices);
        System.out.println(result);
        sc.close();
    }
}
