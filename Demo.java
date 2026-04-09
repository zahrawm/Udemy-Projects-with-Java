public class Demo {
    public static void main(String[] args) {

         StringBuffer sb = new StringBuffer("Hello");
         System.out.println(sb.capacity());
            sb.append(" World");
          //  sb.ensureCapacity(50);
         System.out.println(sb.capacity());
    }

}
