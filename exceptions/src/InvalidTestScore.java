public class InvalidTestScore extends RuntimeException
{
  public InvalidTestScore()
  {
    super("Invalid element in array");
  }

  public InvalidTestScore(int index, int element)
  {
    super("Invalid element in array on index("+index+") with element("+element+")");
  }
}
