

 enum Status {
    Running, Pending , Failed, Success;
 }
public class Stat {
    public static void main(String[] args) {
        Status s =  Status.Pending;
         switch(s){
             case Running:
                 System.out.println("Running...");
                 break;
             case Pending:
                 System.out.println("Pending...");
                 break;
             case Failed:
                 System.out.println("Failed...");
                 break;
             case Success:
                 System.out.println("Success...");
                 break;
                  default:
                      System.out.println("Invalid status");
         }
    }
}
