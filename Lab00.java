public class Lab00
{
   public static void main(String[] args)
   {
      //declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;
      
      //printing the variables
      system.out.println('x:', x, 'y:', y, 'z:', z);
      
      // a list (make an array in java)
      int [] nums = [3,6,-1,2];
      for(int i = 0, i < nums.length,  i ++){
         system.out.println(nums[i]);
      }
      
      
      //call a function
      int numFound = char_count(String y, char "l");
      system.out.println("Found:" numFound);   
      
      
      
      // a counting for loop
      for(int i = 0, i < 11, i ++){
         system.out.print(i, end = " ");
      }
      
      
      public int char_count( String s, char c){
         int count = 0;
         for(int ch = 0, ch < s.length, ch ++){
            if(ch.equals(c)){
               count ++;
            }
         }
         return count
      }       
   }
}
