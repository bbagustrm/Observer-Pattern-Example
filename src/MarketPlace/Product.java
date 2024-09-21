package MarketPlace;

import java.util.ArrayList;

public class Product implements Subject {
    private ArrayList<Observer> observers;
    private String name;
    private int stock;
    
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
        observers = new ArrayList<>();
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, stock);
        }
    }
    
    public void sellProduct(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " unit(s) of " + name + " sold.");
            notifyObservers();
        } else {
            System.out.println("Not enough stock for " + name + " to complete the sale.");
        }
    }
    
    public int getStock() {
        return stock;
    }
}
