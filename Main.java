
package observerpatternproject;

/**
 *
 * @author USER
 */

public class Main {

    public static void main(String[] args) {

        // Create Product
        Product laptop = new Product("Gaming Laptop");

        // Create Users
        User user1 = new User("Ahmad");
        User user2 = new User("Sara");
        User user3 = new User("Lina");

        // Subscribe Users
        laptop.subscribe(user1);
        laptop.subscribe(user2);
        laptop.subscribe(user3);

        // Product becomes available
        System.out.println("\n--- Product becomes available ---");

        laptop.setAvailability(true);

        // One user unsubscribes
        System.out.println("\n--- One user unsubscribes ---");

        laptop.unsubscribe(user2);

        // Product becomes unavailable
        System.out.println("\n--- Product goes out of stock ---");

        laptop.setAvailability(false);
    }
}
    
