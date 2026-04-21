
enum Status{

    SUCCESS,
    FAILURE,
    PENDING
}

public class Main {
    public static void main(String[] args) {
      Status [] s = Status.values();
      for(Status status : s){
          System.out.println(status.ordinal() + " : " + status);
      }
    }
}
