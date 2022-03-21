public class Leap {

    public boolean findLeapYear(int year) throws LeapExceptionHandler {
        if (year < 1000) {
            throw new LeapExceptionHandler("Invalid (low) values");
        }

        if (year > 10000) {
            throw new LeapExceptionHandler("Invalid (high) values");
        }

        if (year > 1581) {
            if (year % 4 != 0) {
                return false;
            }
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
