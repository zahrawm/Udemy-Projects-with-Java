public class Demo {
    public static void main(String[] args) {
       int nums[][] = new int[2][3]; 
       int randoms = 0;

       for (int i = 0;i < 2; i++){ 
         nums[i][0] =  (int)(Math.random() * 100);
         System.out.println(nums[i][0] + " ");
          for (int j = 0; j < 3; j++){
            System.out.println(nums[i][j] );
             // ✅ 2D array with 2 rows and 3 columns
          }
          System.out.print(nums);// ✅ print a new line after each row
       } for (int n[] : nums){
        for (int m : n){
            System.out.println(m);
        }
       }
    }
}
