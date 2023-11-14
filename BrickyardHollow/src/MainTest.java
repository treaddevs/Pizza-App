import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class MainTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpInputOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void restoreInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testMenuOption() {
        // Prepare input
        String input = "1\n3\nL\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Call the main method
        Main.main(new String[0]);

        // Verify the output
        String expectedOutput = "HELLO AND WELCOME TO BRICKYARD HOLLOW!\n" +
                "Feel free to sit wherever you'd like; I'll be right with you!\n" +
                "\n" +
                "Can I interest you in: 1) See a menu 2) Build-your-own pizza\n" +
                "Enter 1 or 2 for selection: \n" +
                "\n" +
                "Here is our menu, go ahead and take a look...\n" +
                "\n" +
                "MENU:\n" +
                "1. MASHED POTATO, BACON, SHALLOT, SOUR CREAM CHIVE DRIZZLE\n" +
                "2. ROASTED CHICKEN PESTO\n" +
                "3. CAPICOLA, PINEAPPLE, HOT-HONEY\n" +
                "4. CUP & CHAR PEPPERONI (RED SAUCE)\n" +
                "5. BUFFALO CHICKEN, RED ONION, GORGONZOLA CRUMBLE\n" +
                "6. SMOKED PULLED PORK, GOUDA, MAC & CHEESE, JALAPENO CORNBREAD\n" +
                "7. STRAWBERRY, BACON, HOT HONEY CHICKEN\n" +
                "8. SMOKED BBQ PULLED PORK, FUJI APPLE, RED ONION" +
                "9. SAUSAGE, FETA, BANANA PEPPER\n" +
                "10. SAUSAGE, FRESH MUSHROOM, RED ONION (RED SAUCE)\n" +
                "11. PEPPERONI, GROUND BEEF, CHERRY TOMATO, RED ONION, DONAIR SAUCE (RED SAUCE)\n" +
                "12. MAINE BLUEBERRIES, RICOTTA, ROASTED SHALLOT, LEMON ZEST\n" +
                "13. PEACHES, BALSAMIC REDUCTION, GOAT CHEESE, BASIL\n" +
                "14. MASHED POTATO, SPINACH, SHALLOT, ROASTED RED PEPPERS, BROCCOLI\n" +
                "15. FRESH MUSHROOM, BROCCOLI, RED PEPPERS, SWEET THAI SAUCE\n" +
                "16. SPINACH, FRESH TOMATO, GOAT CHEESE (RED SAUCE)\n" +
                "17. SWEET POTATO, GOAT CHEESE, HONEY DRIZZLE\n" +
                "18. FRESH MUSHROOM, ROASTED GARLIC, GORGONZOLA CRUMBLE WITH SIDE OF BUFFALO SAUCE\n" +
                "19. TOMATO PESTO\n" +
                "20. SPINACH, RICOTTA, GARLIC (RED SAUCE)\n" +
                "21. MARGHERITA: TOMATO BASIL, BALSAMIC REDUCTION\n" +
                "22. CHEESE (RED SAUCE)\n" +
                "\n" +
                "Would you like to: 1) Make a selection or 2) Exit\n" +
                "Enter 1 or 2 for selection: \n";
        assertEquals(expectedOutput, testOut.toString());
    }
}
