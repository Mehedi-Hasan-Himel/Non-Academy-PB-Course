public class SWAP {
   public static void main(String args[]) {
         /*  
         // swap with third variable.
         
         int a = 10;
         int b = 5;
         
         
         c = a;
         int c;
         b = c;
         a = b;
         System.out.println("b = " + b); 
         System.out.println("a = " + a);
         
         */

         int x = 9;
         int y = 12;

         x = x ^ y;
         y = x ^ y;
         x = x ^ y;

         System.out.println(x + "," + y);
   }
}
