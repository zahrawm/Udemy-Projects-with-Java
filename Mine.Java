 public class Mine{
   int  x;
   String name;
    
     public Mine(){
        x = 10;
        name = "Zainab";

      }
      public static void main(String args[]){
        Mine m = new Mine();
        System.out.println(m.x);
        Mine m1 = new Mine();
        System.out.println(m1.name);
      }
 }
