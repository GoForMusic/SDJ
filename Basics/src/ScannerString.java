//Exercise 2.04
// Write an application that uses a Scanner object, to read your name, age and address.
// Afterwards the application should display the information on the screen.

import java.util.Scanner;

public class ScannerString
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Your name: ");
    String userName = keyboard.nextLine();
    System.out.print("Your age: ");
    int userAge = keyboard.nextInt();
    //saturate the nextInt buffer
    keyboard.nextLine();
    System.out.print("Your adress: ");
    String userAdress = keyboard.nextLine();

    System.out.print("Your Name: " +userName+ "\nYour Age: "+userAge+"\nYour Adress: "+userAdress);
  }
}
