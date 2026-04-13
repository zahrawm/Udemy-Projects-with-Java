class Mobile{
    
    String brand;
    int price;
     static String  network;
    public  void  show(){
        System.out.println(brand+" : "+price+" : "+network);
    }
          

}
 

public class Staats {
    public static void main(String[] args) throws ClassNotFoundException {    

    Mobile m1 = new Mobile();
    m1.brand="Apple";
    m1.price=100000;
    Mobile.network="5G";
    
    Class.forName("Mobile");

  
    }
}
