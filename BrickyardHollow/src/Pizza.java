import java.util.List;
/*
The Pizza interface is used when creating a build-your-own style pizza (referred to in the CustomPizza class)
Since an interface is a contract that established methods, the following methods are required:
    • getSize();
    • getCrust();
    • getSauce();
    • getCheese();
Additionally, a list with each topping from the Toppings enum is created: List<Toppings> getToppings();
This is useful when it comes time to print each topping
It's a better method of storing each topping for access later
 */
public interface Pizza {
    Size getSize();
    Crust getCrust();
    Sauce getSauce();
    Cheese getCheese();
    List<Toppings> getToppings();
}


