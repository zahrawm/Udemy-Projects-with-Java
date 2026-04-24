public class Exercise {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
          
        try {
            int results = numerator / denominator;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Program completed");
        }
    }
}