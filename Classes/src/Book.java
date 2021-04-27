//Exercise 4.02
// Create a UML class diagram for a class Book.
// Then implement it in Java and test it.
// The Book class should have the following fields: author (String), title (String), price (double), and pages (int).
// a)Create a 4-argument constructor initializing all fields.
// b)Create get methods for all fields.
// c)Create a set method for price.
// d)Write a test program that creates two Book objects based on user input (use a Scanner object to input author, title, price, and pages),
// then lowers the price on both books by 20%, and finally prints out the information about the two books.

public class Book
{
  private String author;
  private String title;
  private double price;
  private int pages;

  public Book(String author, String title, double price, int pages)
  {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;
  }

  public Book()
  {
    this.author = null;
    this.title = null;
    this.price = 0;
    this.pages = 0;
  }

  public double getPrice()
  {
    return price;
  }

  public int getPages()
  {
    return pages;
  }

  public String getAuthor()
  {
    return author;
  }

  public String getTitle()
  {
    return title;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String toString()
  {
    return "Author: " + author +"\nTitle: "+ title +"\nPrice: "+price +"\nPages: " + pages;
  }
}
