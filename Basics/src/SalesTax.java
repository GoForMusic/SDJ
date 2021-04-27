//Exercise 1.05 In Denmark, the sales tax is 25%. Write a program that calculates and prints
//the tax and the total price of items that before the added tax cost 80, 140, and
//230 kr., respectively.


//Exercise 2.03Modify the program you made last time in Exercise 1.05 so that it now asks the user to input the sales tax,
// and the prices for the three items.
// Then calculate and print out the tax and total prices like before.

import java.util.Scanner;

public class SalesTax
{
  public static void main(String[] args)
  {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("taxCount: ");
    int taxCount = keyboard.nextInt();
    System.out.print("Price: ");
    int price = keyboard.nextInt();
    int priceBeforeTax = price;

    int sum = price + (price*taxCount/100);

    System.out.println("Price before taxes: "+priceBeforeTax+"\nPrice: " +sum);
    

  }
}
