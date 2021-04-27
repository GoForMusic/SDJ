//link to Temperature class

import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Temperature temp = new Temperature(keyboard.nextDouble());

    System.out.println("Celsius: " + temp.getCelsius() + " Kelvin: " + temp
        .getKelvin());

  }
}
