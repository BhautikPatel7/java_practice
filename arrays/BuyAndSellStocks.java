public class BuyAndSellStocks {
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(BuyAndSellStocks(price));


    }

    public static int BuyAndSellStocks(int price[]){
        int profit = 0;
        int maxporfit = 0;
            int buyprice = Integer.MAX_VALUE;
            for (int i = 0; i < price.length; i++) {
                if (buyprice < price[i]) {
                    profit = price[i] - buyprice;
                   // buyprice = Math.min(price[i], buyprice);
                    maxporfit = Math.max(maxporfit, profit); 
                }
                else{
                    buyprice = price[i];
                }
            }
            return maxporfit;
    }
}
