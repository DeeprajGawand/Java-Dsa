package Arrays;

public class Q12BestTimeToBuyandSell {
    public static void main(String[] args) {
//       int [] prices = {8,7,1,5,3,6,4};
//
//       int minPrice = Integer.MAX_VALUE;
//       int maxProfit=0;
//       for (int i=0;i<prices.length;i++){
//          if(prices[i]<minPrice){
//              minPrice=prices[i];
//          } else if (prices[i]-minPrice>maxProfit) {
//              maxProfit =prices[i]-minPrice;
//
//          }
//       }
//        System.out.println(maxProfit);


        int [] prices = {8,7,1,5,3,6,4};
        int lessPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i = 0; i<prices.length; i++){
            if(prices[i]<lessPrice){
                lessPrice =prices[i];
            }
            if(prices[i]-lessPrice>maxProfit){
                maxProfit = prices[i]-lessPrice;
            }
        }
        System.out.println(maxProfit);


    }
}
