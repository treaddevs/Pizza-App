/*
The Size class creates a size object with associated getters and setters
Cheese takes in the variables "size" and "price"
 */
public class Size {
    private final String size;
    private final double price;

    public Size(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}