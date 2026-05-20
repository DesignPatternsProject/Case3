
package observerpatternproject;
import java.util.ArrayList;
import java.util.List;


public class Product implements Subject {

    private final String productName;

    private boolean available;

    private final List<Observer> observers;

    public Product(String productName) {

        this.productName = productName;

        this.available = false;

        observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {

        observers.add(observer);

        System.out.println("User subscribed to "
                + productName +
                " notifications.");
    }

    public void unsubscribe(Observer observer) {

        observers.remove(observer);

        System.out.println("User unsubscribed from "
                + productName +
                " notifications.");
    }

    public void notifyObservers() {

        for (Observer observer : observers) {

            observer.update(productName, available);
        }
    }

    public void setAvailability(boolean availability) {

        this.available = availability;

        System.out.println("\nProduct status changed!");

        notifyObservers();
    }
} 

