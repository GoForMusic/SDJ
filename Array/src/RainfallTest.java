import java.util.Scanner;

public class RainfallTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Rainfall rain = new Rainfall();

    for(int index=0;index<12;index++)
      rain.setRainfall(keyboard.nextDouble(), index);

    System.out.println(rain.getTotalRainfall());
    System.out.println(rain.getAverageRainfall());
    System.out.println(rain.getMostRain());
    System.out.println(rain.getLeastRain());
  }
}
