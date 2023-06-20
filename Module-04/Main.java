public class Main{
   public static void main(String[] args) {


/* 
 * 1. Binary Literals - 0,1
 * 2. Octal Literals - 0-7
 * 3. Decimal Literals - 0-9
 * 4. Hexadecimal Literals - 0-9, A-F
 */

      byte b = 10;
      byte b2 = 0b1010;
      byte b3 = 012;
      byte b4 = 0xA;


      System.out.println(b);
      System.out.println(b2);
      System.out.println(b3);
      System.out.println(b4);


      long l = 10000000000000000l;
      System.out.println(l);


      float f = 12.232f;
      System.out.println(f);


      double d = 124.22322333d;
      System.out.println(d);


      char c = 'A';
      System.out.println(c);

      boolean bool = true;
      System.out.println(bool);
   }
}