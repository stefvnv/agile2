public class generate_grading {

    public char generateGrade(double examMark, double caMark) throws generate_grading_exception_handler {
        double mark = examMark + caMark;
        char grade = 'Z';

        if (examMark >= 0 && examMark <= 75 && caMark >= 0 && caMark <= 25) {
            if (mark >= 70) {
                grade = 'A';
            } else if (mark >= 50 && mark <= 69) {
                grade = 'B';
            } else if (mark >= 30 && mark <= 49) {
                grade = 'C';
            } else if (mark < 30) {
                grade = 'D';
            }
        } else {
            throw new generate_grading_exception_handler("Invalid (low) values");
        } return grade;
    }
}
