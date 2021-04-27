//Exercise 2.07[Gaddis] Programming Challenge 18, p. 148

import java.util.Scanner;

public class StockTransactionProgram
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    //buy and sell
    final int shares = 1000;

    //buy
    double priceBuy = 32.87;
    //sell
    double priceSell = 33.92;

    //buy
    double totalAmountPaid = shares * priceBuy;
    //sell
    double commissionPaid = 2/100 * totalAmountPaid;

    //buy
    double totalAmountSell = shares * priceSell;
    //sell
    double commissionSell = 2/100 * totalAmountSell;

    System.out.println("The total amount he paid for the stock " + totalAmountPaid);
    System.out.println("The total amount he paid to his commission " + commissionPaid);

    System.out.println("The total amount he sold for "+ totalAmountSell);
    System.out.println("The total amount he paid to his commission when he sold for " + commissionSell);



  }
}
