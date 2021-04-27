//link to Mydate class for
//MyDate class revisited:
//We have a leap year when the year can be divided by 4 (1996, 2008, 2012, etc.), except
//for the years that can also be divided by 100, unless they can also be divided by 400 (i.e.
//1600, 2000 and 2400 are leap years, while 1800, 1900, and 2100 are not).
//Extend the MyDate class that you made in an earlier exercise with a new method called
//isLeapYear(), that will return true if the year stored is a leap year, and false if it
//is not. Hint: the following boolean expression will be true if year is dividable by four:
//year%4==0


public class Decission5
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(22,4,1996);

    System.out.println(date.isLeapYear());
    System.out.println(date.getMonthName());

  }
}
