package MarketPlace;

public class Admin implements Observer {
    public void update(String productName, int stock) {
        System.out.println("Notification to Admin: Product " + productName + " has been sold. Remaining stock: " + stock);
    }
}
