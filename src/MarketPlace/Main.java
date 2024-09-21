package MarketPlace;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi produk
        Product laptop = new Product("Laptop Gaming", 10);
        
        // Inisialisasi observer
        Customer customer1 = new Customer("Bagus");
        Admin admin = new Admin();
        ShippingService shippingService = new ShippingService();
        
        // Mendaftarkan observer
        laptop.registerObserver(customer1);
        laptop.registerObserver(admin);
        laptop.registerObserver(shippingService);
        
        // Simulasi penjualan produk
        System.out.println("\nPenjualan 1:");
        laptop.sellProduct(3);  // Menjual 3 unit laptop
        
        System.out.println("\nPenjualan 2:");
        laptop.sellProduct(5);  // Menjual 5 unit laptop
        
        System.out.println("\nPenjualan 3:");
        laptop.sellProduct(2);  // Menjual 2 unit laptop
        
        // Hapus observer customer dan coba jual produk lagi
        laptop.removeObserver(customer1);
        
        System.out.println("\nPenjualan 4 (tanpa customer):");
        laptop.sellProduct(1);  // Menjual 1 unit laptop
    }
}
