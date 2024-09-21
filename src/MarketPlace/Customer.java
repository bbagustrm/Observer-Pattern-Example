package MarketPlace;

public class Customer implements Observer {
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public void update(String productName, int stock) {
        System.out.println("Notification to Customer " + name + ": Product " + productName + " is sold. Stock left: " + stock);
    }
}
