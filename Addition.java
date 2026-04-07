
class Calculator{
    public int add(int r1, int r2){
        return r1 + r2;
    }
}

public class Addition {
    
    public static void main(String[] args) {
        Calculator  obj = new Calculator();
        int r1 = obj.add(5, 10);
        System.out.println("The sum is: " + r1);
    }
}
