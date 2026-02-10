public class Level1_4 {
    public static void main(String[] args) {
        double cost_price = 129, sell_price = 191;
        double profit = sell_price - cost_price;
        double profit_percent = profit / cost_price * 100;
        System.out.println("The Cost Price is INR" + cost_price + " and Selling Price is INR" + sell_price);
        System.out.println("The Profit is INR" + profit + " and the Profit Percentage is " + profit_percent + "%");
    }
}
