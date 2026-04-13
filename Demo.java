
 class A{
      public A() {
        System.out.println("Constructor of class A");
     }

 }
 
  class B  extends A {
     public B() {
        System.out.println("Constructor of class B");
     }

       public B(int a) {
        super();
        System.out.println("Constructor of class B");
     }
  }
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
         B b1 = new B(5); 
    }
    
}
