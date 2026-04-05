public class Calculator{
    public static void main(String[] args) {

        // Step 1 — initialize your ingredients
        double num1 = 7;
        double num2 = 3;
        char operator = '+';

        // Step 2 — the flag that controls the loop
        String again = "y";

        while (again.equals("y")) {

            // Step 3 — decide what operation to do
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));

            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));

            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));

            } else if (operator == '/') {
                // Step 4 — guard against dividing by zero
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            }

            // Step 5 — flip the flag to stop the loop
            again = "n";
        }

        // Step 6 — closing message after the loop ends
        System.out.println("Thank you for using the calculator.");
    }
}