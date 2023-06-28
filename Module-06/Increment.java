public class Increment {
   public static void main(String[] args ) {
      int x = 5;
      int y = 5 * ++x;

      int z = 5 * x++;

      char a = 'A';
      a++;

      System.out.println("y = " + y);
      System.out.println("z = " + z);
      System.out.println("a = " + a);
   }
}