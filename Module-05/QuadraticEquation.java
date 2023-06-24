public class QuadraticEquation {
   public static void main(String[]args) {
      // quadratic equation
      // ax^2 + bx + c = 0
      // a = 1, b = 5, c = 6
      // x1 = (-b + sqrt(b^2 - 4ac)) / 2a
      // x2 = (-b - sqrt(b^2 - 4ac)) / 2a

      int a = 5;
      int b = -7;
      int c = 2;

      double x1, x2;

      x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      
      x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
   }
}
