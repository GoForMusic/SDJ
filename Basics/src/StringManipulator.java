//Exercise 2.01[Gaddis] Programming Challenge 12, p. 147

import java.util.Scanner;

public class StringManipulator
{
  public static void main(String[] artgs)
  {
    //scanner keyboard
    Scanner keyboard = new Scanner(System.in);

    System.out.print("City name: ");
    String cityName = keyboard.nextLine();

    int cityNameNumbers = cityName.length();
    String upperCharacters = cityName.toUpperCase();
    String lowerCharacters = cityName.toLowerCase();

    System.out.println("Number of characters in the city name: " + cityNameNumbers);
    System.out.println("Upper Case: " + upperCharacters);
    System.out.println("Lower Case: " + lowerCharacters);
    System.out.println("First character: " + cityName.substring(0,1));

  }

}
