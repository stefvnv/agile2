import junit.framework.TestCase;

public class generate_grading_test extends TestCase {
    generate_grading testObj = new generate_grading();

    // Test Number: 1
    // Objective: Invalid values
    // Input(s): examMark: 90.50, caMark: -5.33
    // Expected Output: Exception Object with "Invalid (low) values" message
    public void testGenerateGrade001(){
        double actualResult = 0;

        try{
            actualResult = testObj.generateGrade(90.50, -5.33);
            fail("Exception expected...");
        }catch(generate_grading_exception_handler e){
            assertEquals("Invalid (low) values", e.getMessage());
        }
    }

    // Test Number: 2
    // Objective: Valid values (general)
    // Input(s): examMark: 66.5, caMark: 19.5
    // Expected Output: 85
    public void testGenerateGrade002(){
        double actualResult = 0;

        try{
            assertEquals('A',testObj.generateGrade(65.5,19.5), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 3
    // Objective: To test the conversion of 70 to 'A' (inner bound)
    // Input(s): examMark: 50, caMark: 20
    // Expected Output: 'A'
    public void testGenerateGrade003(){
        double actualResult = 0;

        try{
            assertEquals('A',testObj.generateGrade(50,20), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 4
    // Objective: To test the conversion of 100 to 'A' (outer bound)
    // Input(s): examMark: 75, caMark: 25
    // Expected Output: 'A'
    public void testGenerateGrade004(){
        double actualResult = 0;

        try{
            assertEquals('A',testObj.generateGrade(75,25), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 5
    // Objective: To test the conversion of 69 to 'B' (outer bound)
    // Input(s): examMark: 50.75, caMark: 18.25
    // Expected Output: 'B'
    public void testGenerateGrade005(){
        double actualResult = 0;

        try{
            assertEquals('B',testObj.generateGrade(50.75,18.25), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 6
    // Objective: To test the conversion of 50 to 'B' (inner bound)
    // Input(s): examMark: 40, caMark: 10
    // Expected Output: 'B'
    public void testGenerateGrade006(){
        double actualResult = 0;

        try{
            assertEquals('B',testObj.generateGrade(40,10));
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 7
    // Objective: To test the conversion of 49 to 'c' (outer bound)
    // Input(s): examMark: 40, caMark: 9
    // Expected Output: 'C'
    public void testGenerateGrade007(){
        double actualResult = 0;

        try{
            assertEquals('C',testObj.generateGrade(40,9), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 8
    // Objective: To test the conversion of 30 to 'C' (inner bound)
    // Input(s): examMark: 20, caMark: 10
    // Expected Output: 'C'
    public void testGenerateGrade008(){
        double actualResult = 0;

        try{
            assertEquals('C',testObj.generateGrade(20,10), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }

    // Test Number: 9
    // Objective: To test the conversion of 29 to 'A' (outer bound)
    // Input(s): examMark: 15, caMark: 15
    // Expected Output: 'D'
    public void testGenerateGrade009(){
        double actualResult = 0;

        try{
            assertEquals('D',testObj.generateGrade(15,15), 0.01);
        }catch(generate_grading_exception_handler e){
            fail("Should not get here ... no exception expected");
        }
    }
}