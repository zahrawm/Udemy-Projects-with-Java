class Calculator {

    int a;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    } // ✅ closes add() method

} // ✅ closes Calculator class properly


public class Demos {

    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 89;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("Result: " + result);
    }
} // ✅ closes Demos class