//Exercise 7.02
// Further modify your MyDate class from the last session by adding a method daysInMonth()
// that returns the number of days in the month (e.g. for January it should return 31).
// Remember: If year is a leap year February has 29 days (unlike the usual 28 days),
// so you can use the isLeapYear() method you made previously to calculate the number of days properly.

//Exercise 7.03
// Add yet another method getAstroSign()
// to the class MyDate that will return a String with the name
// of the astrological sign corresponding to the date.
// The 12 astrological signs are: Aries – March 21 - April 19 (both days included)
// Taurus – for April 20 - May 20 (both days included)
// Gemini – May 21 - June 20 (both days included)
// Cancer – June 21 - July 22 (both days included)
// Leo –July 23 - August 22 (both days included)
// Virgo –August 23 - September 22 (both days included)
// Libra – September 23 - October 22 (both days included)
// Scorpio – October 23 - November 21 (both days included)
// Sagittarius – November 22 - December 21 (both days included)
// Capricorn – December 22 - January 19 (both days included)
// Aquarius – January 20 - February 18 (both days included)
// Pisces – February 19 - March 20 (both days included)

public class Decission8
{
  public static void main(String[] args)
  {

    MyDate date = new MyDate(26,12,1998);

    System.out.println(date.daysInMonth());
    System.out.println(date.getAstroSign());

  }
}
