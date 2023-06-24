public class Cuboid {
   public static void main(String[] args) {
      // Area of a cuboid
      // A = 2lw + 2lh + 2wh

      int length = 5;
      int width = 3;
      int height = 2;

      int area = 2 * ((length * width) + (length * height) + (width * height));

      System.out.println("Area = " + area);


       // Volume of a cuboid
       // V = lwh
      
       int volume = length * width * height;
      
       System.out.println("Volume = " + volume);   
   }
}
