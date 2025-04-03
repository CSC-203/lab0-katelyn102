public class Lab00
{
   public static void main(String[] args) {
      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      float z = 9.8f;

      // printing the variables
      System.out.print("x: " + x + " y: " + y + " z: " + z + "\n");

      // a list (make an array in java)
      int[] nums = {3,6,-1,2};
      for (int i=0; i < nums.length; i++) {
         System.out.println(nums[i]+ " ");}
      // call a function
      System.out.println("Found: " + char_count(y, 'l'));

      // a counting for loop
      for (int i=1; i< 11; i++) {
      System.out.print(i+ " ");}


   }

   public static long char_count(String s, char c) {
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == c) {
            count++;
         }
      }
      return count;
   }
}
