import junit.framework.TestCase;

public class LeapTest extends TestCase {
    Leap testObj = new Leap();


    //INVALIDS

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


    //VALIDS

    // Test Number: 3
    // Objective: Test low valid values
    // Input(s): Year = 1000
    // Expected Output: false
    public void test_findLeapYear003() {
        try {
            assertTrue(testObj.findLeapYear(1000));
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
            assertTrue(testObj.findLeapYear(10000));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 5
    // Objective: Test high valid Julian leap year
    // Input(s): Year = 1581
    // Expected Output: false
    public void test_findLeapYear005() {
        try {
            assertFalse(testObj.findLeapYear(1581));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 6
    // Objective: Test low valid Gregorian leap year
    // Input(s): Year = 1581
    // Expected Output: false
    public void test_findLeapYear006() {
        try {
            //or assertEquals(false, testObj.findLeapYear(1582));
            assertFalse(testObj.findLeapYear(1582));
        } catch (LeapExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }
}