import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		 List<Integer>  nums =  Arrays.asList(10, 20, 30, 50, 50, 45, 809, 70, 67, 34,23);
		//  Stream<Integer> s = nums.stream();
		//  s.forEach(n -> System.out.println(n));
		// Stream <Integer> s2 = s.filter(n-> n % 2 == 0);
		//  s2.forEach(n -> System.out.println(n));
		//  Stream <Integer> s3 =  s2.map(n-> n * 2);
        // // s3.forEach(n -> System.out.println(n));
		//  int results = s3.reduce(0, (a,b) -> a + b);
		//  System.out.println(results);
		//  Predicate<Integer> p = new Predicate<Integer>() {
		// 	@Override
		// 	public boolean test(Integer n) {
		// 		return n % 2 == 0;
		// 	}
		// };	
		//  int results2 = nums.stream().filter(n-> n % 2 == 0)
		//  .map(n-> n * 2)
		//  .reduce(0, (a,b) -> a + b);
		//  System.out.println(results2);
		//  System.out.println(nums);
		 Stream<Integer>  sortedValues  = nums.stream()
		 .filter(n-> n % 2 == 0)
		 .map(n-> n * 2)
		 .sorted();
		 sortedValues.forEach(n -> System.out.println(n)); 
	}
}