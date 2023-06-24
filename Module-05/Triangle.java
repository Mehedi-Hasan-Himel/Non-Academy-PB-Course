public class Triangle {
   public static void main(String[] args) {
      
      // Triangle area
      // int h = 10 ;
      // int b = 15;
      // float area = (float) (h * b) / 2;

      // System.out.println(area);

      // Triangle Area
      int a = 10;
      int b = 5;
      int c = 8;

      float s, area;

      s = (a + b + c) / 2f;
      
      area = s*(s-a)*(s-b)*(s-c);

      
      System.out.println("The area is : "+area);
   }
}
