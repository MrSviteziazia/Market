public class Main {
    public static void main(String[] args) {
        Market<String> market = new Market<>();

        market.acceptOrder("Заказ 1");
        market.acceptOrder("Заказ 2");
        market.acceptOrder("Заказ 3");

        System.out.println("Полученные заказы:");
        System.out.println(market.deliverOrder());
        System.out.println(market.deliverOrder());
        System.out.println(market.deliverOrder());
    }
}