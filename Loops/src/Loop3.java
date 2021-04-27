//Exercise 09.03
// Add another method to your MyDate class called nextDay().
// The method should change the date to one day later than the current date.
// Then in your test class create a MyDate object with the date of your birthday,
// and use a loop and the nextDay() method to find out how many days it has been since you were born.

public class Loop3
{
  public static void main(String[] args)
  {
    MyDate myDate = new MyDate(26,12,1998);

    int days=0;

    while(!(myDate.getDay()==1 && myDate.getMonth()==3 && myDate.getYear()==2021))
    {
      myDate.nextDay();
      days++;
    }



    System.out.print(days);
  }
}
