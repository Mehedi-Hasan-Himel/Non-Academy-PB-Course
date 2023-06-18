import java.util.Scanner;

public class Temperature {
   public static void main(String[] args) {

      /* 
      Assignment
      1- Farenheit to kelvin
      2- Celsius to Farenheit
      
      Formula: 
      1 - Farenheit to Celsius: (Farenheit - 32) * 5 / 9
      
      2 - Farenheit to kelvin: (((Farenheit - 32) * 5) / 9) + 273.15
      
      3 - Celsius to Farenheit: ((Celsius * 9) / 5) + 32
      */

      // Input data Start 
      System.out.println("Enter the temperature in Farenheit: ");
      Scanner sc = new Scanner(System.in);
      float farenheit = sc.nextFloat();
      // Input data End 

      // Farenheit to Celsius Start
      float celsius = (farenheit - 32) * 5 / 9;
      System.out.println("The temperature in Celsius is: " + celsius);
      // Farenheit to Celsius End

      // Farenheit to kelvin Start
      double kelvin = (((farenheit - 32) * 5) / 9) + 273.15;
      System.out.println("The temperature in Kelvin is: " + kelvin);
      // Farenheit to kelvin End

      // Celsius to Farenheit Start
      System.out.println("Enter the temperature in Celsius: ");
      Scanner sc2 = new Scanner(System.in);
      float inputCelsius = sc2.nextFloat();

      float outputFarenheit = ((inputCelsius * 9) / 5) + 32;
      System.out.println("The temperature in Farenheit is: " + outputFarenheit);
      // Celsius to Farenheit End
   }
}



