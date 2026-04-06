
class Computer {
public void PlayMusic(){
    System.out.println("Playing music...");
}

public   String getPen( int cost){
      if (cost >= 5)
          return "Expensive Pen";
      else 
          return "Cheap Pen";
      
}
}


public class Main {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Computer comp = new Computer();
        comp.PlayMusic();
        String item = comp.getPen(2);
       System.out.println(item);
}

}
