//Exercise 3.02
// The MyDate class Create a class called MyDate that includes three pieces of information as fields:
// A day (int), a month (int), and a year (int).
// a)First draw a UML class diagram of the class, and then implement it in Java.
// b)Add set and get methods for each field.
// c)Add a method displayDate that returns the day, month, and year separated by forward slashes (e.g. 15/2/2021).
// d)Write a test program named MyDateTest that demonstrates class MyDate's capabilities, by creating at least two MyDate objects,
// setting the fields, and then printing out the dates by calling their displayDate methods.

import java.util.GregorianCalendar;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate()
  {
    MyDate date = today();
    this.day = date.day;
    this.month = date.month;
    this.year = date.year;
  }

  public MyDate(MyDate obj)
  {
    this.day = obj.day;
    this.month = obj.month;
    this.year = obj.year;
  }

  public static MyDate today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH)+1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);

    return new MyDate(currentDay,currentMonth,currentYear);
  }

  public void setDay(int day)
  {
    if(day==0){
      throw new IllegalDataException(day);
    } else
    this.day = day;
  }

  public void setMonth(int month)
  {
    if(day==0){
      throw new IllegalDataException(month);
    } else
    this.month = month;
  }

  public void setYear(int year)
  {
    if(day==0){
      throw new IllegalDataException(year);
    } else
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String displayDate()
  {
    return this.day + "/" + this.month + "/" + this.year;
  }

  public boolean isLeapYear()
  {
    if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
    {
      return true;
    } else {
        return false;
      }
  }

  public int daysInMonth()
  {
    int numbersOfDays=0;

    if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12 )
    {
      numbersOfDays = 31;
    }
    else if ( this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11 )
    {
      numbersOfDays = 30;
    }
    else if ( this.month == 2 )
    {
      if(isLeapYear()){
        numbersOfDays = 29;
      }else{
        numbersOfDays = 28;
      }
    }

    return numbersOfDays;
  }

  public String getAstroSign()
  {
    String sign = null;

    if (this.month == 1)
    {
      if (this.day < 20)
      {
        sign = "Capricorn – December 22 - January 19";
      }else{
        sign = "Aquarius – January 20 - February 18";
      }
    }
    else if (this.month == 2)
    {
      if (this.day < 19)
      {
        sign = "Aquarius – January 20 - February 18";
    }else{
        sign = "Pisces – February 19 - March 20";
      }
    }
    else if(this.month == 3) {
      if (this.day < 21)
      {
        sign = "Pisces – February 19 - March 20";
      }else{
        sign = "Aries – March 21 - April 19";
      }
    }
    else if (this.month == 4) {
      if (this.day < 20)
      {
        sign = "Aries – March 21 - April 19";
      }else{
        sign = "Taurus – for April 20 - May 20";
      }
    }
    else if (this.month == 5) {
      if (this.day < 21)
      {
        sign = "Taurus – for April 20 - May 20";
      }else{
        sign = "Gemini – May 21 - June 20";
      }
    }
    else if( this.month == 6) {
      if (this.day < 21)
      {
        sign = "Gemini – May 21 - June 20";
      }else{
        sign = "Cancer – June 21 - July 22";
      }
    }
    else if (this.month == 7) {
      if (this.day < 23)
      {
        sign = "Cancer – June 21 - July 22";
      }else{
        sign = "Leo – July 23 - August 22";
      }
    }
    else if( this.month == 8) {
      if (this.day < 23)
      {
        sign = "Leo – July 23 - August 22";
      }else{
        sign = "Virgo – August 23 - September 22";
      }
    }
    else if (this.month == 9) {
      if (this.day < 23)
      {
        sign = "Virgo – August 23 - September 22";
      }else
      {
        sign = "Libra – September 23 - October 22";
      }
    }
    else if (this.month == 10) {
      if (this.day < 23)
      {
        sign = "Libra – September 23 - October 22";
      }else{
        sign = "Scorpio – October 23 - November 21";
      }
    }
    else if (this.month == 11) {
      if (this.day < 22)
      {
        sign = "Scorpio – October 23 - November 21";
      }else{
        sign = "Sagittarius – November 22 - December 21";
      }
    }
    else if (this.month == 12) {
      if (this.day < 22)
      {
        sign = "Sagittarius – November 22 - December 21";
      }else{
        sign ="Capricorn – December 22 - January 19";
      }
    }

    return sign;

  }

  public String dayOfWeek()
  {
    int q = this.day;
    int m = this.month;
    int k = this.year%100;
    int j = this.year/100;
    int h  = (q+(13*(m+1))/5+k+k/4+j/4+5*j)%7;

    if(h==0){
      return "Saturday";
    }else if(h==1){
      return "Sunday";
    }else if(h==2){
      return "Monday";
    }else if(h==3){
      return "Tuesday";
    }else if(h==4){
      return "Wednesday";
    }else if(h==5){
      return "Thursday";
    }else if(h==6){
      return "Friday";
    }

    return null;
  }

  public String getMonthName()
  {
    switch (this.month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        throw new IllegalStateException("Unexpected value: " + this.month);
    }
  }

  public void nextDay()
  {
    this.day++;
    if(this.day>=daysInMonth())
    {
      this.day = 1;
      this.month++;
      if(this.month>=12){
        this.month=1;
        this.year++;
      }
    }
  }

  public void nextDays(int days)
  {
    this.day=this.day+days;
    if(this.day>=daysInMonth())
    {
      this.day = daysInMonth()-days;
      this.month++;
      if(this.month>=12){
        this.month=1;
        this.year++;
      }
    }
  }

  public String toString()
  {
    return this.day + "/" + this.month + "/" + this.year;
  }

  public boolean equals(Object object)
  {
    if(!(object instanceof MyDate))
    {
      return false;
    }

    MyDate obj = (MyDate)object;

    if(this.day == obj.day && this.month == obj.month && this.year == obj.year)
    {
      return true;
    }else return false;
  }

  public MyDate copy()
  {
    return new MyDate(this.day,this.month,this.year);
  }

  public boolean isBefore(MyDate date2)
  {
    if(this.year < date2.year)
      return true;
    else if(this.year == date2.year && this.month < date2.month)
      return true;
    else if(this.year == date2.year && this.month == date2.month && this.day < date2.day)
      return true;
    else return false;
  }
}
