import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
In Java, the Main (or driver) is used to test each function and print to the screen
This is the user interface that communicates the program's capacity and intent to the customer
Which, in this case, allows the customer to place a pizza order

I am currently working full time as a Line Chef at Brickyard Hollow
I enjoyed building this project and intend on showing my supervisor what I created

The program starts with a series of print statements greeting the new customer
Then, the customer is prompted to either use an existing menu or build their own pizza

If they use the menu, the menu array displaying all the pizza options is printed
Arrays are also created for both small and large pizza prices based on the current menu

Otherwise, they continue to the custom pizza option where they select the attributes:
size, crust, sauce, cheese, toppings

Exception handling is used to handle improper user input
I also used switch statements to handle each case for input (Example: Sauce: (Pesto vs regular sauce))

Finally, once the order is complete the attributes and price are printed to the screen
Then, the order is served and the exchange is complete
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HELLO AND WELCOME TO BRICKYARD HOLLOW!");
        System.out.println("Feel free to sit wherever you'd like; I'll be right with you!");
        System.out.println("");

        try {
            System.out.println("Can I interest you in: 1) See a menu 2) Build-your-own pizza");
            System.out.print("Enter 1 or 2 for selection: ");
            int decision = scanner.nextInt();
            System.out.println("");

            if (decision == 1) {
                // Existing menu option
                String[] displayMenu = {
                        "MASHED POTATO, BACON, SHALLOT, SOUR CREAM CHIVE DRIZZLE | (Sm: $15.75 Lg $25.00)",
                        "ROASTED CHICKEN PESTO | (Sm: $14.75 Lg $23.50)",
                        "CAPICOLA, PINEAPPLE, HOT-HONEY | (Sm: $15.75 Lg $25.00)",
                        "CUP & CHAR PEPPERONI (RED SAUCE) | (Sm: $14.50 Lg $21.00)",
                        "BUFFALO CHICKEN, RED ONION, GORGONZOLA CRUMBLE | (Sm: $15.75 Lg $25.00)",
                        "SMOKED PULLED PORK, GOUDA, MAC & CHEESE, JALAPENO CORNBREAD | (Sm: $15.75 Lg $25.00)",
                        "STRAWBERRY, BACON, HOT HONEY CHICKEN | (Sm: $15.75 Lg $25.00)",
                        "SMOKED BBQ PULLED PORK, FUJI APPLE, RED ONION | (Sm: $15.75 Lg $25.00)",
                        "SAUSAGE, FETA, BANANA PEPPER | (Sm: $15.75 Lg $25.00)",
                        "SAUSAGE, FRESH MUSHROOM, RED ONION (RED SAUCE) | (Sm: $15.75 Lg $25.00)",
                        "PEPPERONI, GROUND BEEF, CHERRY TOMATO, RED ONION, DONAIR SAUCE (RED SAUCE) | (Sm: $15.75 Lg $25.00)",
                        "MAINE BLUEBERRIES, RICOTTA, ROASTED SHALLOT, LEMON ZEST | (Sm: $15.50 Lg $24.50)",
                        "PEACHES, BALSAMIC REDUCTION, GOAT CHEESE, BASIL | (Sm: $15.50 Lg $24.50)",
                        "MASHED POTATO, SPINACH, SHALLOT, ROASTED RED PEPPERS, BROCCOLI | (Sm: $15.50 Lg $24.50)",
                        "FRESH MUSHROOM, BROCCOLI, RED PEPPERS, SWEET THAI SAUCE | (Sm: $15.50 Lg $24.50)",
                        "SPINACH, FRESH TOMATO, GOAT CHEESE (RED SAUCE) | (Sm: $15.50 Lg $24.50)",
                        "SWEET POTATO, GOAT CHEESE, HONEY DRIZZLE | (Sm: $15.50 Lg $24.50)",
                        "FRESH MUSHROOM, ROASTED GARLIC, GORGONZOLA CRUMBLE WITH SIDE OF BUFFALO SAUCE | (Sm: $15.50 Lg $24.50)",
                        "TOMATO PESTO | (Sm: $14.74 Lg $23.50)",
                        "SPINACH, RICOTTA, GARLIC (RED SAUCE) | (Sm: $15.50 Lg $24.50)",
                        "MARGHERITA: TOMATO BASIL, BALSAMIC REDUCTION | (Sm: $15.50 Lg $24.50)",
                        "CHEESE (RED SAUCE) | (Sm: $13.25 Lg $18.75)"
                };

                // Display menu options
                System.out.println("Here is our menu, go ahead and take a look...");
                System.out.println("");
                System.out.println("MENU:");
                for (int i = 0; i < displayMenu.length; i++) {
                    System.out.println((i + 1) + ". " + displayMenu[i]);
                }
                System.out.println("");
                System.out.println("Enter the number of your choice: ");
                int choice = scanner.nextInt();

                // Process the selected pizza from the menu
                if (choice >= 1 && choice <= displayMenu.length) {
                    String selectedPizza = displayMenu[choice - 1];
                    System.out.println("You selected: " + selectedPizza);

                    // Prices for small and large pizzas
                    double[] smallPrices = {15.75, 14.75, 15.75, 14.50, 15.75, 15.75, 15.75, 15.75, 15.75, 15.75, 15.75, 15.50, 15.50, 15.50, 15.50, 15.50, 15.50, 15.50, 14.75, 15.50, 15.50, 13.25};
                    double[] largePrices = {25.00, 23.50, 25.00, 21.00, 25.00, 25.00, 25.00, 25.00, 25.00, 25.00, 25.00, 24.50, 24.50, 24.50, 24.50, 24.50, 24.50, 24.50, 23.50, 24.50, 24.50, 18.75};

                    System.out.println("");
                    System.out.println("Would you like a small or large pizza?");
                    System.out.println("Enter the pizza size (S for small, L for large): ");
                    String input = scanner.next().toUpperCase();

                    double selectedPrice;

                    if (input.equals("S")) {
                        if (choice >= 1 && choice <= smallPrices.length) {
                            selectedPrice = smallPrices[choice - 1];
                            System.out.println("Price for selected small pizza: $" + selectedPrice);
                            System.out.println("");
                            System.out.println("I'll put that right in for you!");
                            System.out.println("");
                            System.out.println("Okay...");
                            System.out.println("Your pizza is served! Enjoy!!");
                        } else {
                            // throw exception with print statement
                            System.out.println("Invalid choice. Please select a valid option from the menu.");
                            scanner.close();
                        }
                    } else if (input.equals("L")) {
                        if (choice >= 1 && choice <= largePrices.length) {
                            selectedPrice = largePrices[choice - 1];
                            System.out.println("Price for selected large pizza: $" + selectedPrice);
                            System.out.println("");
                            System.out.println("I'll put that right in for you!");
                            System.out.println("");
                            System.out.println("Okay...");
                            System.out.println("Your pizza is served! Enjoy!!");
                        } else {
                            System.out.println("Invalid choice.");
                            scanner.close();
                        }
                    } else {
                        System.out.println("Invalid choice.");
                        scanner.close();
                    }
                } else {
                    System.out.println("Invalid choice. Please select a valid option from the menu.");
                }
            } else if (decision == 2) {
                // Build your own pizza
                System.out.println("You have chosen to build your own pizza.");
                System.out.println("Please provide the details for your custom pizza:");
                System.out.println("");
                System.out.println("Select your pizza crust (For Gluten-free enter 'S' for small)");
                System.out.println("Small: $13.75 (1.75 A TOPPING) Large: $18.75 (3.00 A TOPPING) ");
                System.out.println("(Gluten-free crust is $3.00 extra)");
                System.out.println("");
                System.out.println("Pizza size: ('S' for Small (12 inches), 'L' for Large (16 inches): ");
                String sizeInput = scanner.next().toUpperCase();
                Size sizeObject;

                try {
                    if (sizeInput.equals("S")) {
                        sizeObject = new Size("Small", 13.75); // Replace 10.0 with the appropriate price for a small pizza
                    } else if (sizeInput.equals("L")) {
                        sizeObject = new Size("Large", 18.75); // Replace 15.0 with the appropriate price for a large pizza
                    } else {
                        System.out.println("Invalid size choice.");
                        scanner.close();
                        return;
                    }

                    System.out.println("Crust options: (Regular or GF (Gluten-free), available for small only)");
                    System.out.println("(Gluten-free crust is $3.00 extra)");
                    System.out.println("");
                    System.out.println("Enter: 'Regular' or 'GF': ");
                    String crustInput = scanner.next().toUpperCase();
                    Crust crustObject;

                    if (crustInput.equals("REGULAR")) {
                        crustObject = new Crust("Regular", 0.0); // Replace 0.0 with the appropriate price for a regular crust
                    } else if (crustInput.equals("GF")) {
                        crustObject = new Crust("Gluten-free", 3.0); // Replace 2.0 with the appropriate price for a gluten-free crust
                    } else {
                        System.out.println("Invalid crust choice.");
                        return;
                    }

                    System.out.println("Sauce options: (No sauce, Pesto)");
                    System.out.println("Red sauce options: (Light sauce, Regular, Extra sauce)");
                    System.out.println("");
                    System.out.println("Enter: No sauce, Pesto, Light sauce, Regular, or Extra sauce");
                    scanner.nextLine(); // Consume newline character
                    String sauceInput = scanner.nextLine();
                    Sauce sauceObject;

                    switch (sauceInput.toUpperCase()) {
                        case "NO SAUCE" -> sauceObject = new Sauce("No sauce", 0.0);
                        case "PESTO" -> sauceObject = new Sauce("Pesto", 0.0);
                        case "LIGHT SAUCE" -> sauceObject = new Sauce("Light sauce", 0.0);
                        case "REGULAR" -> sauceObject = new Sauce("Regular sauce", 0.0);
                        case "EXTRA SAUCE" -> sauceObject = new Sauce("Extra sauce", 0.0);
                        default -> {
                            System.out.println("Invalid sauce choice.");
                            return;
                        }
                    }

                    System.out.println("(Regular cheese (mozzarella))");
                    System.out.println("(Extra cheese is $1.75)");
                    System.out.println("");
                    System.out.println("Cheese options: (No cheese, Vegan cheese, Regular, Extra cheese, Extra vegan cheese): ");
                    String cheeseInput = scanner.nextLine();
                    Cheese cheeseObject;

                    switch (cheeseInput.toUpperCase()) {
                        case "NO CHEESE" -> cheeseObject = new Cheese("No cheese", 0.0);
                        case "VEGAN CHEESE", "VEGAN" -> cheeseObject = new Cheese("Vegan cheese", 0.0);
                        case "REGULAR" -> cheeseObject = new Cheese("Regular", 0.0);
                        case "EXTRA CHEESE" -> cheeseObject = new Cheese("Extra cheese", 1.75);
                        case "EXTRA VEGAN CHEESE" -> cheeseObject = new Cheese("Extra vegan cheese", 1.75);
                        default -> {
                            System.out.println("Invalid cheese choice.");
                            return;
                        }
                    }

                    CustomPizza customPizza = new CustomPizza(sizeObject, crustObject, sauceObject, cheeseObject);

                    List<String> toppingNames = new ArrayList<>(); // Declare the variable outside the if block

                    System.out.println("Would you like to add toppings? (Y/N): ");
                    String addToppingsInput = scanner.next().toUpperCase();
                    if (addToppingsInput.equals("Y")) {
                        List<Toppings> toppingList = customPizza.getToppings();
                        System.out.println("(Toppings are $1.75 each for small, $3.00 each for large)");
                        System.out.println("");
                        System.out.println("TOPPINGS LIST:");
                        for (Toppings topping : Toppings.values()) {
                            System.out.println((topping.ordinal() + 1) + ". " + topping.getName());
                        }
                        System.out.print("Please select the toppings numbers you'd like to add (separated by commas): ");
                        scanner.nextLine(); // Consume newline character
                        String toppingsInput = scanner.nextLine();
                        String[] toppingNumbers = toppingsInput.split(",");
                        for (String toppingNumber : toppingNumbers) {
                            try {
                                int index = Integer.parseInt(toppingNumber.trim()) - 1;
                                if (index >= 0 && index < Toppings.values().length) {
                                    Toppings toppingEnum = Toppings.values()[index];
                                    customPizza.addTopping(toppingEnum);
                                    toppingNames.add(toppingEnum.getName()); // Add the selected topping to toppingNames
                                } else {
                                    System.out.println("Invalid topping number: " + toppingNumber);
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input for topping number: " + toppingNumber);
                            }
                        }
                    } else {
                        System.out.println("No toppings added.");
                    }

                    double totalPrice = customPizza.getPrice();

                    System.out.println("Your custom pizza has been created:");
                    System.out.println("Size: " + sizeObject.getSize());
                    System.out.println("Crust: " + crustObject.getCrust());
                    System.out.println("Sauce: " + sauceObject.getSauce());
                    System.out.println("Cheese: " + cheeseObject.getCheese());
                    String toppingsString = String.join(", ", toppingNames);
                    System.out.println("Toppings: " + toppingsString);
                    System.out.println("TOTAL PRICE: $" + totalPrice);
                    System.out.println("");
                    System.out.println("I'll put that right in for you!");
                    System.out.println("");
                    System.out.println("Okay...");
                    System.out.println("Your pizza is served! Enjoy!!");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                } finally {
                    scanner.close();
                }
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } finally {
            scanner.close();
        }
    }
}