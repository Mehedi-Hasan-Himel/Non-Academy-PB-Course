public class Assignment {
   public static void main(String args[]) {


      // AND (&) operator.
      int c = 100;
      int d = 90;

      int AndOperator = c & d;
      System.out.println("Result of the AND operation: " + AndOperator);


      // OR (|) operator.
      int e = 100;
      int f = 90;

      int result = e | f;

      System.out.println("Result of the OR operation: " + result);


      // How to swap two numbers without third variable. XOR (^) operator.
      int a = 100;
      int b = 90;
      
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println("Result of the XOR operation: " +a + "," + b);


   }
}
