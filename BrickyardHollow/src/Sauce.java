/*
The Sauce class creates a sauce object with associated getters and setters
Cheese takes in the variables "sauce" and "price"
 */
public class Sauce {
    private final String sauce;
    private final double price;

    public Sauce(String sauce, double price) {
        this.sauce = sauce;
        this.price = price;
    }

    public String getSauce() {
        return sauce;
    }

    public double getPrice() {
        return price;
    }
}
