public class Grading {

    //Format
    public char calculateGrade(int exam, int coursework) throws GradingExceptionHandler {

        if (exam < 0 || coursework < 0) {
            throw new GradingExceptionHandler("Invalid (low) values");
        }

        if (exam > 75 || coursework > 25) {
            throw new GradingExceptionHandler("Invalid (high) values");
        }

        int marks = exam + coursework;

        if (marks >= 70) {
            return 'A';
        }

        if (marks >= 50) {
            return 'B';
        }

        if (marks >= 30) {
            return 'C';
        }
        return 'D';
    }
}
