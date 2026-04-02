public class Exercise {
    public static void main(String[] args) {

        int score = 75;
        char grade = 'B';

        // TODO: Check pass or fail
        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // TODO: Determine grade based on score
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Step 3: Print the grade
        System.out.println("Grade:  " + grade);
    }
}