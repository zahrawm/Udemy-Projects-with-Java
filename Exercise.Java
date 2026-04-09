public class Exercise {
    public static void main(String[] args) {
        
        int[] numbers = {45, 22, 89, 16, 90, 33};
        
        int smallest = numbers[0];  // Initialize with first element
        int largest = numbers[0];   // Initialize with first element
        
        for (int n : numbers) {
            if (n < smallest) {
                smallest = n;       // Update if smaller found
            }
            if (n > largest) {
                largest = n;        // Update if larger found
            }
        }
        
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}