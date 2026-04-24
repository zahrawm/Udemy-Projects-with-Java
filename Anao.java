
class D {
    public void display(){
        System.out.println("This is class D");
    }
}

 

public class Anao {
    public static void main(String[] args) {
        D obj = new D() {
            @Override
            public void display() {
                System.out.println("This is an anonymous class");
            }
        };
        obj.display();
    }
}