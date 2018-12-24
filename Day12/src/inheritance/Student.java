package inheritance;

// derived class
public class Student extends Person {
    private int[] testScores;
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */

    public char calculate() {
        // calculate average of test scores

        // initialize a sum
        int sum = 0;
        // for loop to go through array
        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }

        // calculate average
        int testScoreAverage = sum / testScores.length;


        if (testScoreAverage >= 90 && testScoreAverage <= 100) {
            return 'O';
        } else if (testScoreAverage >= 80 && testScoreAverage < 90) {
            return 'E';
        } else if (testScoreAverage >= 70 && testScoreAverage < 80) {
            return 'A';
        } else if (testScoreAverage >= 55 && testScoreAverage < 70) {
            return 'P';
        } else if (testScoreAverage >= 40 && testScoreAverage < 55) {
            return 'D';
        } else if (testScoreAverage < 40) {
            return 'T';
        }

        return 'T';
    }
}
