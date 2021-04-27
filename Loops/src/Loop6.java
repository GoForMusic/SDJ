//Exercise 10.01
// Write a program that asks the user for a username,
// a password and a confirmation password.
// Keep asking the user until the password and confirmation passwords match.
// Then print out the entered username and password and exit.

import java.util.Scanner;

public class Loop6
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String username = null;
    String password = null;
    String confirmPassword = null;

    do
    {
      System.out.println("---REGISTER---");
      System.out.print("Username: ");
      username = keyboard.nextLine();
      System.out.print("Password: ");
      password = keyboard.nextLine();
      System.out.print("Confirm password: ");
      confirmPassword = keyboard.nextLine();
    }while(!(password.equals(confirmPassword)));

    System.out.print("Username: "+ username + "|Password: "+password);

  }
}
