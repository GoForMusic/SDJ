//Write a for loop that calculates the total of the following series of numbers:

public class Loop10
{
  public static void main(String[] args)
  {
    double sum=0;
    int maxNumber = 30;
    int number2=1;

    while(number2<31&&maxNumber>0)
    {
      System.out.println(number2 + " " + maxNumber);
      sum=sum+(double)number2/maxNumber;
      maxNumber--;
      number2++;
    }

    System.out.print(sum);

  }
}
