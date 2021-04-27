//Exercise 09.04
// The Fibonacci numbers is a special sequence of numbers.
// They are defined so that the first two numbers are 1, and all following numbers are the sum of the two preceding numbers.
// E.g.  The 0th Fibonacci number is 1.
// The 1st Fibonacci number is also 1.
// The 2nd Fibonacci number is 1 + 1 = 2.
// The 3rd Fibonacci number is 1 + 2 = 3.
// The 4th Fibonacci number is 2 + 3 = 5.  Etc.


public class Fibonacci
{
  public static int fibonacci(int number)
  {
    int previousNumber = 0;
    int nextNumber = 1;

    for(int index = 0; index<=number;index++)
    {
      int sum = previousNumber + nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;
    }

    return previousNumber;
  }


  public static void main(String[] args)
  {
    for(int index=0;index<20;index++)
    {
      System.out.println("Fibonacci("+index+") = "+fibonacci(index));
    }
  }
}
