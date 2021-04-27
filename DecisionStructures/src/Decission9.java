//Exercise 7.04
// Write a program that asks the user to enter a username,
// a password and a confirmation password.
// Then print out the username, and a message about whether or not the entered password and confirmation password are identical.

import java.util.Scanner;

public class Decission9
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter your unsername:");
    String username=keyboard.nextLine();
    System.out.print("Enter your password:");
    String password=keyboard.nextLine();
    System.out.print("Enter your password again:");
    String confirmPassword=keyboard.nextLine();

    if(password.equals(confirmPassword)){
      System.out.println("Username: " + username +"\nPassword: " + password);
    }else{
      System.out.println("Password is not equal.");
    }

  }
}
