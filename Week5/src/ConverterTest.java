import junit.framework.TestCase;

public class ConverterTest extends TestCase {

    /**
     * TEST #1
     *
     * Objective: Invalid values
     * Input(s): USD = "10", xRate = "0.25"
     * Expected output: "-99.00"
     */
    public void testConverter001(){
        Converter testObj = new Converter();

        assertEquals(-99.00, testObj.convertUSDtoEUR(10, 0.25));
    }


    /**
     * TEST #2
     *
     * Objective: Valid values
     * Input(s): USD = "750", xRate = "0.88"
     * Expected output: "663.81"
     */
    public void testConverter002(){
        Converter testObj = new Converter();

        assertEquals(660.00, testObj.convertUSDtoEUR(750, 0.88), 0.01);
    }


    /**
     * TEST #3
     *
     * Objective: Invalid values
     * Input(s): USD = "11,750", xRate = "1.00"
     * Expected output: "87.43"
     */
    public void testConverter003(){
        Converter testObj = new Converter();

        assertEquals(-99.00, testObj.convertUSDtoEUR(11750, 1.00));
    }
}