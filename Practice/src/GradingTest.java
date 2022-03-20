import junit.framework.TestCase;

public class GradingTest extends TestCase {
    Grading testObj = new Grading();


    // Test Number: 1
    // Objective: Test low invalid values
    // Input(s): exam = -1, coursework: -1
    // Expected Output: Exception Object with "Invalid (low) values" message
    public void test_calculateGrade001() {
        try {
            testObj.calculateGrade(-1, -1);
            fail("Test should not reach this line!");
        } catch (GradingExceptionHandler e) {
            assertEquals("Invalid (low) values", e.getMessage());
        }
    }


    // Test Number: 2
    // Objective: Test lowest valid values
    // Input(s): exam = 0, coursework: 0
    // Expected Output: 'D'
    public void test_calculateGrade002() {
        try {
            assertEquals('D', testObj.calculateGrade(0, 0));
        } catch (GradingExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }


    // Test Number: 3
    // Objective: Test low valid values
    // Input(s): exam = 30, coursework: 5
    // Expected Output: 'C'
    public void test_calculateGrade003() {
        try {
            assertEquals('C', testObj.calculateGrade(30, 5));
        } catch (GradingExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }


    // Test Number: 4
    // Objective: Test high valid values
    // Input(s): exam = 50, coursework: 5
    // Expected Output: 'B'
    public void test_calculateGrade004() {
        try {
            assertEquals('B', testObj.calculateGrade(50, 5));
        } catch (GradingExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }


    // Test Number: 5
    // Objective: Test highest valid values
    // Input(s): exam = 75, coursework: 25
    // Expected Output: 'A'
    public void test_calculateGrade005() {
        try {
            assertEquals('A', testObj.calculateGrade(75, 25));
        } catch (GradingExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }


    // Test Number: 6
    // Objective: Test high invalid values
    // Input(s): exam = 76, coursework: 26
    // Expected Output: Exception Object with "Invalid (high) values" message
    public void test_calculateGrade006() {
        try {
            testObj.calculateGrade(76, 26);
            fail("Test should not reach this line!");
        } catch (GradingExceptionHandler e) {
            assertEquals("Invalid (high) values", e.getMessage());
        }
    }
}