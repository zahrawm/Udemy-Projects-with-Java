import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
         int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for(int i =1; i<=size ; i++){
            nums.add( ran.nextInt(100));

        }
     System.out.println(nums);
    }
}
