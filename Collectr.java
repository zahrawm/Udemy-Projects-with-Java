import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectr {
    public static void main(String[] args) {
       Set <Integer>  nums = new TreeSet<Integer>();
		  nums.add(10);
		  nums.add(20);
		  nums.add(30);
		  nums.add(50);
		  nums.add(50);
         System.out.println(nums);
         Iterator<Integer> it = nums.iterator();
         while(it.hasNext()) {
             System.out.println(it.next());
         }
         
         
		  
		    // for ( Object n : nums){
            //     int k = (Integer) n;
            //     System.out.println(k);
            // }
    }
    
}
