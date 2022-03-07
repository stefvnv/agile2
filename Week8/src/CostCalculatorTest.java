import junit.framework.TestCase;

public class CostCalculatorTest extends TestCase {

    // Test Number: 1
    // Objective: Invalid values
    // Input(s):
    // Expected Output: Exception Object with "Invalid (low) values" message

    public void testCostCalculator001() {
        double actualResult = 0;
        CostCalculator testObj = new CostCalculator();

        try {
            actualResult = testObj.calculateCost(50.00, 66.00, 1.70);
            fail("Exception expected ...");
        } catch (CostCalculatorExceptionHandler e) {
            assertEquals("Invalid (low) values", e.getMessage());
        }
    }
}