/*
The Cheese class creates a cheese object with associated getters
Cheese takes in the variables "cheese" and "price"
 */
public class Cheese {
    private final String cheese;
    private final double price;

    public Cheese(String cheese, double price) {
        this.cheese = cheese;
        this.price = price;
    }

    public String getCheese() {
        return cheese;
    }

    public double getPrice() {
        return price;
    }
}
