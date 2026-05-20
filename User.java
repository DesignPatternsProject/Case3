
package observerpatternproject;


public class User implements Observer {

    private final String name;

    public User(String name) {

        this.name = name;
    }

    @Override
    public void update(String productName, boolean available) {

        if (available) {

            System.out.println(name +
                    " received notification: "
                    + productName +
                    " is now AVAILABLE!");

        } else {

            System.out.println(name +
                    " received notification: "
                    + productName +
                    " is OUT OF STOCK!");
        }
    }
}

