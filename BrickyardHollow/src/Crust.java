/*
The Crust class creates a cheese object with associated getters
Cheese takes in the variables "crust" and "price"
 */
public class Crust {
    private final String crust;
    private final double price;

    public Crust(String crust, double price) {
        this.crust = crust;
        this.price = price;
    }

    public String getCrust() {
        return crust;
    }

    public double getPrice() {
        return price;
    }
}
