import java.util.ArrayList;
import java.util.List;

/*
CustomPizza is a child class of the Pizza interface
The keyword 'implements' is required to define this relationship
A custom pizza has the following attributes: size, crust, sauce, cheese, toppings (from List created from Toppings enum)
There are associated getters for each and a method addToppings to add additional toppings
Finally, there is a getPrice getter that displays price based on the selected pizza size
 */
public class CustomPizza implements Pizza {
    private final Size size;
    private final Crust crust;
    private final Sauce sauce;
    private final Cheese cheese;
    private final List<Toppings> toppings;

    public CustomPizza(Size size, Crust crust, Sauce sauce, Cheese cheese) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = new ArrayList<>();
    }

    public Size getSize() {
        return size;
    }
    public Crust getCrust() {
        return crust;
    }
    public Sauce getSauce() {
        return sauce;
    }
    public Cheese getCheese() {
        return cheese;
    }
    public List<Toppings> getToppings() {
        return toppings;
    }
    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }

    public double getPrice() {
        double price = size.getPrice() + crust.getPrice() + sauce.getPrice() + cheese.getPrice();

        // Calculates the total price of the toppings based on the size of the pizza
        for (Toppings topping : toppings) {
            if (size.getSize().equals("Small")) {
                price += topping.getSmallPrice();
            } else if (size.getSize().equals("Large")) {
                price += topping.getLargePrice();
            }
        }
        return price;
    }
}