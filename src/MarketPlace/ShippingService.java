package MarketPlace;

public class ShippingService implements Observer {
    public void update(String productName, int stock) {
        System.out.println("Notification to Shipping Service: Prepare shipment for " + productName + ". Stock left: " + stock);
    }
}
