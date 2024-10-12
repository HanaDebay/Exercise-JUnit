//Exercise: JUnit
//Define a class where you have 2 static methods:
//
//subtraction that takes minuend and subtrahend as int params and returns the difference
//multiplication that takes multiplier and multiplicand as int params and returns the product
//using JUnit, write and execute at least 2 tests for each method,
// giving some information to the user regarding each test
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathOperations {

        public static int subtraction(int minuend, int subtrahend) {
            return minuend - subtrahend;
        }

        public static int multiplication(int multiplier, int multiplicand) {
            return multiplier * multiplicand;
        }

    @Nested
    class MathOperationsTest {

                @Test
                public void testSubtraction() {
                    int result = MathOperations.subtraction(10, 5);
                    assertEquals(5, result, "10 - 5 should equal 5");

                    result = MathOperations.subtraction(0, 5);
                    assertEquals(-5, result, "0 - 5 should equal -5");
                }

                @Test
                public void testMultiplication() {
                    int result = MathOperations.multiplication(3, 4);
                    assertEquals(12, result, "3 * 4 should equal 12");

                    result = MathOperations.multiplication(-2, 5);
                    assertEquals(-10, result, "-2 * 5 should equal -10");
                }
            }
        }
