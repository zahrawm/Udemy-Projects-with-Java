
class D {
    public void display(){
        System.out.println("This is class D");
    }
}

 class E extends D{
    public void display(){
        System.out.println("This is class E");
    }
}
public class Anao {
    public static void main(String[] args) {
        D obj = new E();
        obj.display();
    }
}