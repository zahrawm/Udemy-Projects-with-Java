
 class Human {
    private int age = 90;
     private  String name;

      public int getAge(int age) {
        return age;
      }
      public String getName(String n) {
        return name;
      }
 }

public class Encaps {
     Human h = new Human();
     h.age = 25;
    h.name = "John";
    h.getAge( 67);
    h.getName("Jane");
  System.out.println("Age: " + h.getAge(67));
    System.out.println("Name: " + h.getName("Jane"));   
}