import junit.framework.TestCase;

public class ConverterTest extends TestCase {

    /**
     * TEST #1
     *
     * Objective: Convert USD to EUR
     * Input(s): USD = "100"
     * Expected output: "87.43"
     */
    public void testConverter001(){
        Converter testObj = new Converter();

        assertEquals(87.63, testObj.convertUSDtoEUR(100, 1.14116170261326));
    }
}