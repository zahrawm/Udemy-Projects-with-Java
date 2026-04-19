class A{
    int  age;
     public void show(){
        System.out.println("This is class A");
     }
     class B{
      public void config(){
        System.out.println("This is class B");  
     }

}
   static class C{
    public void display(){
        System.out.println("This is class C");
    }

  }

}

 public class Pro {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj2 = obj.new B();
        obj2.config();
        A.C obj3 = new A.C();
        obj3.display();
   
    }
}