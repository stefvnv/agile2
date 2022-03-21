import junit.framework.TestCase;

public class LeapTest extends TestCase {
    Leap testObj = new Leap();

    // Test Number: 1
    // Objective: Test low invalid values
    // Input(s): Year = 999
    // Expected Output: Exception Object with "Invalid (low) values" message
    public void test_findLeapYear001() {
        try {
            testObj.findLeapYear(999);
            fail("Test should not reach this line!");
        } catch (LeapExceptionHandler e) {
            assertEquals("Invalid (low) values", e.getMessage());
        }
    }

    // Test Number: 2
    // Objective: Test high invalid values
    // Input(s): Year = 10001
    // Expected Output: Exception Object with "Invalid (high) values" message
    public void test_findLeapYear002() {
        try {
            testObj.findLeapYear(10001);
            fail("Test should not reach this line!");
        } catch (LeapExceptionHandler e) {
            assertEquals("Invalid (high) values", e.getMessage());
        }
    }

    // Test Number: 3
    // Objective: Test low valid values
    // Input(s): Year = 1000
    // Expected Output: false
    public void test_findLeapYear003() {
        try {
            assertEquals(false, testObj.findLeapYear(1000));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 4
    // Objective: Test high valid values
    // Input(s): Year = 10000
    // Expected Output: true
    public void test_findLeapYear004() {
        try {
            assertEquals(true, testObj.findLeapYear(1984));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 5
    // Objective: Test invalid leap year
    // Input(s): Year = 1581
    // Expected Output: false
    public void test_findLeapYear005() {
        try {
            assertEquals(false, testObj.findLeapYear(1581));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 6
    // Objective: Test valid leap year
    // Input(s): Year = 1581
    // Expected Output: false
    public void test_findLeapYear006() {
        try {
            assertEquals(false, testObj.findLeapYear(1582));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

}