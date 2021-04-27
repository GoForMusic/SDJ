// at public static double square just need to change the parameter
// type from int to double because is asking to return a double value
// not a int and a static function is required to have a different parameter from the previous function with the same name

public class MyMath
{
  public static int square(int number)
  {
    return number * number;
  }
  public static double square(double number)
  {
    return number * number;
  }
}