import junit.framework.TestCase;

public class CostCalculatorTest extends TestCase {
    CostCalculator testObj = new CostCalculator();

    // Test Number: 1
    // Objective: Invalid values
    // Input(s):
    // Expected Output: Exception Object with "Invalid (low) values" message

    public void testCalculateCost001() {
        double actualResult = 0;

        try {
            actualResult = testObj.calculateCost(-20);
            fail("Exception expected ...");
        } catch (CostCalculatorExceptionHandler e) {
            assertEquals("Invalid (low) values", e.getMessage());
        }
    }




    // Test Number: 2
    // Objective: Invalid values
    // Input(s):
    // Expected Output: Exception Object with "Invalid (low) values" message

    public void testCalculateCost002() {
        double actualResult = 0;

        try {
            actualResult = testObj.calculateCost(1.5);
            assertEquals(1.5, 150);
        } catch (CostCalculatorExceptionHandler e) {
            fail("Exception expected ...");
        }
    }


}