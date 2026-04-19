
 abstract class Car{
   public  abstract void drive(); 
   public abstract void fly();  
public  void playMusic(){

}
} 
  abstract class WagonR extends Car{
       
        public void drive() {
            System.out.println("WagonR is driving");
        }
    
         public void fly() {
            System.out.println("WagonR is flying");
        }
        
        public void playMusic() {
            System.out.println("Playing music in WagonR");
        }
 }
  class GWagon extends WagonR{
    public void drive() {
        System.out.println("GWagon is driving");
    }

     public void fly() {
        System.out.println("GWagon is flying");
    }
    
    public void playMusic() {
        System.out.println("Playing music in GWagon");
    }
  }
public class Demo {
    public static void main(String[] args) {
        WagonR obj = new GWagon();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
    
}
