public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number=number;
  }

  public int getNumber()
  {
    return number;
  }

  public int getLastDigit()
  {
    return this.number%10;
  }

  public int getFirstDigit()
  {
    int localNumber = number;
    while(localNumber>10)
    {
      localNumber = localNumber/10;
    }
    return localNumber;
  }

  public boolean isDivisibleBy(int anotherInt)
  {
    if(this.number%anotherInt==0) return true;
    else return false;
  }

  public int numberOfProperDivisiors()
  {
    int count=0;
    for(int index=1;index<this.number;index++)
    {
      if(isDivisibleBy(index))
        count++;
    }

    return count;
  }

  public boolean isPrime()
  {
    boolean condition = true;

    for(int index=2;index<=this.number/2;index++)
    {
      if(isDivisibleBy(index)) condition = false;
    }

    if(condition) return true;
    else return false;
  }

  public String toString()
  {
    if(isPrime()){
      return this.number + "(a prime number)";
    }else return this.number+"";
  }

  public MyNumber plus(MyNumber anotherNumber)
  {
    //class lvl is null
    if(anotherNumber == null) return new MyNumber(this.number);
    else return new MyNumber(this.number + anotherNumber.number);
  }

  public boolean isPerfectNumber()
  {
    int sum = 0;
    for(int index=1;index<this.number;index++)
    {
      if(isDivisibleBy(index))
      {
        sum = sum+index;
      }
    }
    if(sum == this.number) return true;
    else return false;
  }

}
