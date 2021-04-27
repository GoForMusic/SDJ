//Exercise 11.01 Modify your MyDate class so that you:
// a)Add an equals method that will return true if the object given as argument has the same values for day, month and year.
// The method signature should be: public boolean equals(MyDate obj)
// b)Add a copy method, public MyDate copy(), that will return a new MyDateobject with the same date (day, month and year)
// c)Add a copy constructor, public MyDate(MyDate obj), that sets the fields to the same values as those in the MyDate object given as argument
// Then write a test class to test the new constructor and methods.

public class TestMyDate2
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(22,12,1998);
    MyDate date2 = date1.copy();
    date2.setDay(23);
    MyDate date3 = new MyDate(date1);

    date3.nextDays(20);
    MyDate date4 = new MyDate();

    System.out.println("date:" + date1 + " "+ date2 + " " + date3);
    System.out.println(date4);
    System.out.println(date3.isBefore(date4));


  }
}
