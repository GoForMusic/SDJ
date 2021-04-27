//link with Book class

import java.util.Scanner;

public class BookTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Book book1 = new Book(keyboard.nextLine(), keyboard.nextLine(), keyboard.nextDouble(), keyboard.nextInt());
    keyboard.nextLine();
    Book book2 = new Book(keyboard.nextLine(), keyboard.nextLine(), keyboard.nextDouble(), keyboard.nextInt());

    double price1 = book1.getPrice() - (book1.getPrice()*20/100);
    double price2 = book2.getPrice() - (book2.getPrice()*20/100);
    book1.setPrice(price1);
    book2.setPrice(price2);

    System.out.println(book1);
    System.out.println(book2);

  }

}
