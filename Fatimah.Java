public class Fatimah {
    public static void main(String[] args) {
        int nums[] = new int[4];  // ✅ array of 4 numbers
        nums[0] = 10;             // ✅ first slot
        nums[1] = 20;             // ✅ second slot
        nums[2] = 30;             // ✅ third slot
        nums[3] = 40;             // ✅ fourth slot

        for (int i = 0; i < nums.length; i++) { // ✅ correct loop
            System.out.println(nums[i]);          // ✅ correct print
        }
    }
}